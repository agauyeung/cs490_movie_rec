package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import org.apache.mahout.math.SparseMatrix;

public class MovieRecommender {    
       
    public static TreeMap<Integer, String> initializeMovieData(Path filename) {
        TreeMap<Integer, String> movies = new TreeMap<Integer, String>();

        String text;
        int i, movieID;
        String movie = "";
        
		try (
				BufferedReader reader = Files.newBufferedReader(filename, Charset.forName("UTF8"))
			) {
			movieID = 1;
			while ((text = reader.readLine()) != null){
				i = 0;
				for (char c: text.toCharArray()) {
					if (c != '|'){
						movie += c;
					} else {
						i++;
						if (i > 1) {
							movies.put(movieID, movie);
							break;
						}
						movie = "";
					}
				}
				movieID ++;
			}
		} catch (IOException e) {
            System.out.println(filename.toString() + " does not exist.");
        }
		System.out.println("DONE READING MOVIES");
        return movies;
    }
    
    public static ArrayList<Integer> getRandMovies(TreeMap<Integer, String> movies){
		System.out.println("GETTING RANDOM MOVIES");

        ArrayList<Integer> ranmov = new ArrayList<Integer>();
        Random rand = new Random();
        int num = 0;
        System.out.println("SIZE " + movies.size());
        while(ranmov.size() < 10) {
            num = rand.nextInt(movies.size() + 1);

            if(!ranmov.contains(num)) {
                ranmov.add(num);
            }
        }
		System.out.println("GOT RANDOM MOVIES");

        return ranmov;
    }
    
    public static String getMovieTitle(int movieID, TreeMap<Integer, String> movies){
        String name;
        name = movies.get(movieID);
        return name;
    }

    public static SparseMatrix createNewUserVector(HashMap<Integer, Integer> ratingsMap, int numOfMovies) {
    	SparseMatrix vector = new SparseMatrix(1, numOfMovies);
    	for (int movieID : ratingsMap.keySet()) {
    		vector.set(0, movieID, ratingsMap.get(movieID));
    	}
    	return vector;
    }
    
    //This last one does not work yet!!!
    public static List<String> getRecommendations(SparseMatrix user, TreeMap<Integer, String> movies) {
        List<String> recMovies = new ArrayList<String>();
        for(int j = 0; j<1677; j++) {
            if(recMovies.size() < 10){
                if(user.get(0, j) > 3){
                    if(!recMovies.contains(j))
                    	recMovies.add(movies.get(j));
                    	System.out.println("MOVIE: " + movies.get(j));
                }
            }
        }
        System.out.println("DONE RECOMMENDING");
        return recMovies;
    }
}