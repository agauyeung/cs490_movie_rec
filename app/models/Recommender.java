package models;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.mahout.math.Matrix;
import org.apache.mahout.math.SingularValueDecomposition;
import org.apache.mahout.math.SparseMatrix;

public class Recommender {
	
	/**
	 * Constants
	 */
	private static final int DOTPRODUCT = 0;
	private static final int PEARSON = 1;	//Collaborative Filtering
	private static final int NUMOFALGORITHMS = 2;
	
	private static int algorithm;
	
	/**
	 * Number of Recommendations to find.
	 */
	private static final int numOfRecs = 5;
	
	/**
	 * Instance of UserMap that will be populated with User IDs mapped to their ratings.
	 */
	private static UserMap userMap;
	
	/**
	 * ArrayList of movies. Index is movie ID, which corresponds to the movie title.
	 */
	private static ArrayList<String> movies = null;
	
	/**
	 * Matrix of user ID as rows and movie ID as columns, containing ratings.
	 */
	private static SparseMatrix matrix;
	
	/**
	 * Go through file and read in movie titles into movies ArrayList.
	 * 
	 * @param path - file that contains movies and info
	 * @throws IOException
	 */
	public static void readMovies(Path path) throws IOException {
		int i;
		String movie = "";
		String text;
		movies = new ArrayList<String>();
		movies.add(null);
		
		try (
				BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF8"))
			) {
			while ((text = reader.readLine()) != null){
				i = 0;
				for (char c: text.toCharArray()) {
					if (c != '|'){
						movie += c;
					} else {
						i++;
						if (i > 1) {
							movies.add(movie);
							break;
						}
						movie = "";
					}
				}
			}
		}
	}
	
	/**
	 * Goes through each rating and adds them and their users to the User Map.
	 * 
	 * @param path - file that contains movie ratings by individual users
	 * @return true if movies ArrayList has been populated and false if it has not
	 * @throws IOException
	 */
	public static boolean readRatings(Path path) throws IOException {
		int userID;
		int movieID;
		int rating;
		
		userMap = new UserMap(movies.size());

		
		if (movies == null) {
			return false;
		} else {
			List<String> line;
			String text;
			
			//Go through movie ratings file and populate usermap
			try (
					BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF8"))
				) {
				while ((text = reader.readLine()) != null){
					line = parseText(text);
					userID = Integer.parseInt(line.get(0));
					movieID = Integer.parseInt(line.get(1));
					rating = Integer.parseInt(line.get(2));
					userMap.addRating(userID, movieID, rating);
					//setQuick
				}
			}
			return true;
		}
	}
	
	/**
	 * Goes through each word in the line; they are separated by tabs.
	 * 
	 * @param text - line from file
	 * @return List of words in the line
	 */
	public static List<String> parseText(String text) {
		ArrayList<String> words = new ArrayList<>();
		String word = "";
		
		for (char c: text.toCharArray()) {
			if (c != '\t'){
				word += c;
			} else {
				words.add(word);
				word = "";
			}
		}
		if (!word.contentEquals("")){
			words.add(word);
		}
		
		return words;
	}
	
	/**
	 * Find the top 5 similar users, then find a top-rated movie from each similar user that the user has never seen. 
	 * 
	 * @param targetUserID - the ID of the user that the program is trying to find recommendations for
	 * @return ArrayList of movie IDs of the recommended movies
	 */
	public static ArrayList<Integer> findRecommendations(int targetUserID) {
		int i, movieID;
		ArrayList<Integer> recommendations = new ArrayList<Integer>();
		ArrayList<Integer> blacklist = new ArrayList<Integer>();
		
		LinkedList<Double> similarities = new LinkedList<Double>();
		LinkedList<Integer> similarUsers = new LinkedList<Integer>();
		for (i = 0; i < numOfRecs; i++) {
			similarities.add((double) 0);
			similarUsers.add(0);
		}

		while (recommendations.size() < numOfRecs) {
			//find top 5 similar users
			for (i = 1; i < userMap.size(); i++) {
				//if the current user is not the same as the user we're finding the recommendations
				//for, if the blacklist doesn't contain the current user we're looking at, and if
				//the similarusers list doesn't contain the current user we're looking at...
				if (i != targetUserID && !blacklist.contains(i) && !similarUsers.contains(i)) {
					switch (algorithm) {
						case DOTPRODUCT:
							checkTop(similarUsers, similarities, i, (double) calcSimilarityDotProduct(targetUserID, i));
							break;
						case PEARSON:
							checkTop(similarUsers, similarities, i, calcSimilarityPearson(targetUserID, i));
							break;
					}
					
				}
			}	
			
			//find 5 recommendations
			//go through each similar user
			int[] ratings = userMap.getRatings(targetUserID);
			for (i = 0; i < similarUsers.size(); i++) {
				int recommendedMovie = 0;
				//highest rating in the current similar user's ratings found so far
				double topRating = 0;
				int[] simRatings = userMap.getRatings(similarUsers.get(i));
				//go through each rating of the similar user
				for (movieID = 1; movieID < simRatings.length; movieID++) {
					//if user has never seen the movie and the recommendations does not contain this movie yet			
					if (ratings[movieID] == 0 && !recommendations.contains(movieID)) {
						//if the rating is a 5, set it as the recommended movie and break
						if (simRatings[movieID] == 5) {
							recommendedMovie = movieID;
							break;
						//if the rating is greater than the current top rating, set the top rating as the current
						//rating and the recommended movie as the current movie
						} else if (simRatings[movieID] > topRating) {
							topRating  = simRatings[movieID];
							recommendedMovie = movieID;
						}
					}
				}
				//if no recommended movie could be found for this user, add this user to the blacklist,
				//remove the user from the similarusers list, clear the recommendations, and go back to
				//finding a new similar user.
				if (recommendedMovie == 0) {
					blacklist.add(similarUsers.get(i));
					similarUsers.remove(i);
					similarUsers.addFirst(0);
					recommendations.clear();
					break;
				} else {
					recommendations.add(recommendedMovie);
				}
			}
		}
		
		return recommendations;
	}
	
	/**
	 * Similarities and Similar Users linked lists correspond to each other: user at index 0 of similarusers
	 * has the similarity value at index 0 of similarities. Similarities is ordered from smallest to largest
	 * so that the program doesn't have to go through the similarities linked list the entire way each time it wants
	 * to potentially add a new, larger similarity value.
	 * 
	 * When adding a new value, the first value in the list (the smallest) is removed.
	 * 
	 * Uses algorithm corresponding to the user's input.
	 * 
	 * @param similarUsers - LinkedList of similar users to the user that the program is trying to find recommendations for
	 * @param similarities - LinkedList of similarity value of how similar the similar users are to the main user
	 * @param potentialUserID - the main user; the user that the program is trying to find recommendations for
	 * @param d - the similarity value of the user that is potentially to be added to the list of similar users
	 */
	public static void checkTop(LinkedList<Integer> similarUsers, LinkedList<Double> similarities, int potentialUserID, double d) {

		ListIterator<Double> listIterator = similarities.listIterator();
		Double simIter;
		int i;
		i = 0;
        while (listIterator.hasNext()) {
            simIter = listIterator.next();
            //If the new similarity value is less than similarities[i] and there is a slot before similarities[i],
			//then add the new value and user
            if (d < simIter && i != 0) {
            	similarUsers.add(i, potentialUserID);
            	similarities.add(i, d);
            	similarUsers.removeFirst();
            	similarities.removeFirst();
            	return;
    		//If the we have reached the highest similarity value and the new similarity value is higher than 
    		//the highest similarity value, then add the new value and user
            } else if (d > simIter && !listIterator.hasNext()) {
            	similarUsers.addLast(potentialUserID);
            	similarities.addLast(d);
            	similarUsers.removeFirst();
            	similarities.removeFirst();
            	return;
            }
            i++;
        }
	}
	
	/**
	 * Uses dot product to calculate the similarities between 2 users' ratings.
	 * 
	 * @param userID1
	 * @param userID2
	 * @return
	 */
	public static int calcSimilarityDotProduct(int userID1, int userID2) {
		if (!userMap.contains(userID1) || !userMap.contains(userID2)) { 
			System.out.println("User ID invalid.");
			System.exit(1);
		}
		
		int similarity = 0;
		int[] userRatings1 = userMap.getRatings(userID1);
		int[] userRatings2 = userMap.getRatings(userID2);
		for (int i = 1; i < userRatings1.length; i++) {
			similarity += (userRatings1[i] * userRatings2[i]);
		}
		return similarity;
	}
	
	/**
	 * Uses Pearson Correlation to calculate the similarities between 2 user's ratings.
	 * 
	 * @param userID1
	 * @param userID2
	 * @return
	 */
	public static double calcSimilarityPearson(int userID1, int userID2) {
		if (!userMap.contains(userID1) || !userMap.contains(userID2)) { 
			System.out.println("User ID invalid.");
			System.exit(1);
		}
		
		int numerator = 0;
		double denominator = 0;
		int xMean = 0;
		int xTotal = 0;
		int yMean = 0;
		int yTotal = 0;
		int xDenom = 0;
		int yDenom = 0;
		
		int[] userRatings1 = userMap.getRatings(userID1);
		int[] userRatings2 = userMap.getRatings(userID2);
		//Calculate individual means (excluding 0's)
		for (int i = 1; i < userRatings1.length; i++) {
			if (userRatings1[i] != 0) {
				xMean += userRatings1[i];
				xTotal ++;
			}
			if (userRatings2[i] != 0) {
				yMean += userRatings2[i];
				yTotal ++;
			}
		}
		xMean = xMean/xTotal;
		yMean = yMean/yTotal;
		
		//Calculate numerator and denominator
		for (int i = 1; i < userRatings1.length; i++) {
			if (userRatings1[i] != 0 && userRatings2[i] != 0) {
				numerator += (userRatings1[i] - xMean) * (userRatings2[i] - yMean);
				xDenom += Math.pow((userRatings1[i] - xMean), 2);
				yDenom += Math.pow((userRatings2[i] - yMean), 2);
			}
		}
		
		denominator = Math.sqrt(xDenom * yDenom);
		
		return numerator/denominator;
	}
	
	/**
	 * Generates matrix as a SparseMatrix using user ratings.
	 * Rows represent users (userID-1) while columns represent movies (movieID-1).
	 * There is off-by-one accounting because the dataset does not have ID 0.
	 *
	 * @return SparseMatrix matrix
	 */
	public static SparseMatrix generateMatrix() {
		int[] ratings;
		matrix = new SparseMatrix(userMap.size()-1, movies.size()-1);

		for (int i = 1; i < userMap.size(); i ++) {
			ratings = userMap.getRatings(i);
			for (int j = 1; j < ratings.length; j++) {
				if (ratings[j] != 0) {
					matrix.set(i-1, j-1, ratings[j]);
				}
			}
		}
		
		return matrix;		
	}
	
	/**
	 * Calls generateMatrix() to create the SparseMatrix. It is then passed to the SVD constructor;
	 * calls Apache Mahout's SVD constructor and calls getS(), getU(), and getV(),
	 * which gets the Sigma matrix, U matrix, and get V matrix, respectively.
	 * Each matrix is written to a text file.
	 *
	 * Depending on the size of the matrix, SVD calculations will take a while.
	 * i.e. ~5 minutes for 10k dataset.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws UnsupportedEncodingException 
	 */
	public static void findSVDMatrices() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		int i, j;
		
		System.out.println("\nGenerating matrix...");
		generateMatrix();
			
		System.out.println("Matrix generated...");
			
		//create matrix
		System.out.println("SVD...");
		SingularValueDecomposition SVD = new SingularValueDecomposition(matrix);
			
		//call get methods for U, V, and Sigma
		System.out.println("Calculating Sigma...");
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		       new FileOutputStream("Sn.txt"), "utf-8"))) {
			Matrix S = SVD.getS();
			for (i = 0; i < S.rowSize(); i ++) {
				for (j = 0; j < S.columnSize(); j ++) {
					writer.write(S.get(i, j) + " ");
				}
				writer.write("\n");
			}
		}
			
		System.out.println("Calculating U...");
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		       new FileOutputStream("Un.txt"), "utf-8"))) {
			Matrix U = SVD.getU();
			for (i = 0; i < U.rowSize(); i ++) {
				for (j = 0; j < U.columnSize(); j ++) {
					writer.write(U.get(i, j) + " ");
				}
				writer.write("\n");
			}
		}
		
		System.out.println("Calculating V...");
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		       new FileOutputStream("Vn.txt"), "utf-8"))) {
			Matrix V = SVD.getV();
			for (i = 0; i < V.rowSize(); i ++) {
				for (j = 0; j < V.columnSize(); j ++) {
					writer.write(V.get(i, j) + " ");
				}
				writer.write("\n");
			}		
		}
			
		System.out.println("DONE.");
	}
	
	public static List<String> getMovies() {
		return movies;
	}
	
	public static UserMap getUserMap() {
		return userMap;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Reading and importing movie titles from \"" + args[0] + "\"");
			readMovies(Paths.get(/*"movies.txt"*/args[0]));


			System.out.println("Reading and importing movie ratings from \"" + args[1] + "\"");
			readRatings(Paths.get(/*"movieRatings.txt"*/args[1]));
			
			algorithm = Integer.parseInt(args[2]);
			if (algorithm < 0 || algorithm >= NUMOFALGORITHMS) {
				System.out.println("No such algorithm.");
				return;
			}		
			
			/* Algorithm */
			String algorithmName = "";
			
			switch (algorithm) {
				case DOTPRODUCT:
					algorithmName = "Dot Product";
					break;
				case PEARSON:
					algorithmName = "Pearson Correlation";
					break;
			}
			System.out.println("\nAlgorithm: " + algorithmName);
			
			/* Find Recommendations */
			ArrayList<Integer> recommendations = findRecommendations(Integer.parseInt(args[3]));
			
			System.out.println("\nRecommendations:\nMovID\tTitle\n----------------------------");
			for (int i = 0; i < recommendations.size(); i++) {
				System.out.println(recommendations.get(i) + "\t" + movies.get(recommendations.get(i)));
			}
					
			/*for (int j = 1; j < 51; j ++) {
				double[] ratings = userMap.getRatings(j);
				for (int k = 1; k < movies.size(); k ++) {
					System.out.print(ratings[k]);
				}
				System.out.println();
			}*/
			
			/* Find SVD Matrices */
            findSVDMatrices();
			
		} catch (IOException e) {
			System.out.println("Text file(s) does not exist.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("User ID invalid.");
		}
	}
}
