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
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.TreeMap;

import org.apache.mahout.math.Matrix;
import org.apache.mahout.math.SparseMatrix;


public class MovieRecommender {
	
	private static final int MAXNUMOFRECS = 10;
	
	private static ArrayList<String> movies;
	private static SparseMatrix V;
	
	public MovieRecommender(String movieFile, String VFile){
		try {
			//Recommender.readMoviesTenK(Paths.get(movieFile));
			Recommender.readMoviesOneM(Paths.get(movieFile));

			movies = (ArrayList<String>) Recommender.getMovies();
		
			readV(Paths.get(VFile));
			System.out.println("Movie Recommender object initialized. All files read successfully.");
		} catch (IOException e) {
			System.out.println("The movie file or V file not valid.");
		}
	}
	
	public int getNumOfMovies() {
		return movies.size();
	}
	
	/**
	 * Goes through each word in the line; they are separated by 1 space.
	 * 
	 * @param text - line from file
	 * @return List of words in the line
	 */
	public List<String> parseText(String text) {
		ArrayList<String> words = new ArrayList<>();
		String word = "";
		
		for (char c: text.toCharArray()) {
			if (c != ' '){
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
	
	private void readV(Path path) throws IOException {
		
		List<String> line;
		String text;
		int movie, i;
			
		try (
				BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF8"))
			) {
			movie = 0;
			
			if ((text = reader.readLine()) != null){
				line = parseText(text);
				
				System.out.println("Columns Retained: " + line.size());
				
				V = new SparseMatrix(movies.size(), line.size());
				for (i = 0; i < line.size(); i ++) {
					V.set(movie, i, Double.parseDouble(line.get(i)));
				}
				movie ++;
			}
			
			while ((text = reader.readLine()) != null){
				line = parseText(text);
				for (i = 0; i < line.size(); i ++) {
					V.set(movie, i, Double.parseDouble(line.get(i)));
				}
				movie ++;
			}
		}
	}
	
    public ArrayList<Integer> getRandMovies(){
		System.out.println("GETTING RANDOM MOVIES");

        ArrayList<Integer> ranmov = new ArrayList<Integer>();
        Random rand = new Random();
        int num = 0;
        System.out.println("SIZE " + movies.size());
        while(ranmov.size() < 10) {
            num = rand.nextInt(movies.size());

            if(!ranmov.contains(num)) {
                ranmov.add(num);
            }
        }
		System.out.println("GOT RANDOM MOVIES");

        return ranmov;
    }
    
    public static String getMovieTitle(int movieID){
        return movies.get(movieID);
    }
    
    public SparseMatrix createNewUserVector(HashMap<Integer, Integer> ratingsMap) {
    	SparseMatrix vector = new SparseMatrix(1, getNumOfMovies());
		System.out.println("Ratings:");
    	for (int movieID : ratingsMap.keySet()) {
    	    System.out.println("MovieID: " + movieID + ", Rating: " + ratingsMap.get(movieID));
    		vector.set(0, movieID, ratingsMap.get(movieID));
    	}
    	return vector;
    }
    
	public Matrix calcRecVector(SparseMatrix user) throws UnsupportedEncodingException, FileNotFoundException, IOException {
		Matrix qV = user.times(V);
		Matrix VTransposed = V.transpose();
		Matrix recommendations = qV.times(VTransposed);
		/*try (Writer writer = new BufferedWriter(new OutputStreamWriter(
			       new FileOutputStream("Rec.txt"), "utf-8"))) {
				for (int i = 0; i < recommendations.rowSize(); i ++) {
					for (int j = 0; j < recommendations.columnSize(); j ++) {
						//if (recommendations.get(i, j) > 5) {
							writer.write(recommendations.get(i, j) + " ");
							writer.write("\n");
						//}
					}
				}		
			}*/		
		return recommendations;
	}
    
    public List<String> getRecommendations(SparseMatrix user) {
    	Matrix recommendations = null;
    	try {
    		recommendations = calcRecVector(user);
    	} catch (Exception e) {
    		System.out.println("Exception from calcRecVector");
    	}
    	
        System.out.println("Recommending Movies...");
        List<String> recMovies = new ArrayList<String>();
        int movieID;
        
        LinkedList<Integer> topRecs = new LinkedList<Integer>();
        
        for (int j = 0; j < recommendations.columnSize(); j++) {
//        	if (recommendations.get(0, j) <= 3) {
//        		continue;
//        	}

        	//go through all ratings
        	//if max, put in linked list
        	if (j == 0) {
        		topRecs.add(j);
        	} else if (topRecs.size() < MAXNUMOFRECS) {
        		if (recommendations.get(0, j) > recommendations.get(0, topRecs.getLast())) {
        			topRecs.addLast(j);
        		} else {
        		
	               	ListIterator<Integer> listIterator = topRecs.listIterator();
	            	while (listIterator.hasNext()) {
	            		if (recommendations.get(0, j) <= recommendations.get(0, listIterator.next())) {
	            			listIterator.previous();
	            			listIterator.add(j);
	            			break;
	            		}
	            	}
        		}
        	} else {
        		if (recommendations.get(0, j) > recommendations.get(0, topRecs.getLast())) {
        			topRecs.addLast(j);
        			topRecs.removeFirst();
        		} else {
	        		
	        		ListIterator<Integer> listIterator = topRecs.listIterator();
	        		boolean atFirst = true;
	
	            	while (listIterator.hasNext()) {
	            		if (atFirst && recommendations.get(0, j) <= recommendations.get(0, listIterator.next())) {
	            			break;
	            		}
	            		else if (!atFirst && recommendations.get(0, j) <= recommendations.get(0, listIterator.next())) {
	            			listIterator.previous();
	            			listIterator.add(j);
	            			topRecs.removeFirst();
	            			break;
	            		}
	            		atFirst = false;
	            	}
        		}
        	} 
//        	System.out.println(recommendations.get(0, j));
//            ListIterator<Integer> listIterator = topRecs.listIterator();
//        	while (listIterator.hasNext()) {
//        		System.out.print(listIterator.next() + " ");
//        	}
//        	System.out.println("\n");
        }
        
        System.out.println("Recommendations:");
        ListIterator<Integer> listIterator = topRecs.listIterator();
    	while (listIterator.hasNext()) {
    		movieID = listIterator.next() + 1;
    		System.out.println("Movie " + getMovieTitle(movieID));
    		recMovies.add(getMovieTitle(movieID));
    	}
        
        System.out.println("DONE RECOMMENDING");
        return recMovies;
    }
    
    public SparseMatrix genRandUser() {
    	SparseMatrix user = new SparseMatrix(1, getNumOfMovies());

    	Random rand = new Random();
    	for(int y = 0; y < movies.size(); y++){
    		user.set(0, y, rand.nextInt(6));
    	}
    	
    	return user;
    }
	
	
	
}
