package controllers;

import models.MovieRecommender;
import play.data.Form;
import play.*;
import play.mvc.*;
import models.TenRatings;
import views.html.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application extends Controller {

    final static Form<TenRatings> ratingsForm = Form.form(TenRatings.class);
    List<Integer> randMovieIDs = null;
    List<String> tenMoviesTest = new ArrayList<String>();
    List<String> recommendations = new ArrayList<String>();
    TreeMap<Integer, String> movieData = null;

    public Result index() {
        return recommended();
    }
    
    //CAN CREATE methods to open other pages...

    public Result recommended() {
    	return ok(recommended.render("Recommended For You"));
    }
    
    public Result history() {
        return ok(history.render("Rating History"));
    }
    
    public Result register() {
        return ok(register.render("User Registration"));
    }

    public Result rate() {
        /*tenMoviesTest.add("Toy Story (1995)");
        tenMoviesTest.add("GoldenEye (1995)");
        tenMoviesTest.add("Four Rooms (1995)");
        tenMoviesTest.add("Get Shorty (1995)");
        tenMoviesTest.add("Copycat (1995)");
        tenMoviesTest.add("Shanghai Triad (Yao a yao yao dao waipo qiao) (1995)");
        tenMoviesTest.add("Twelve Monkeys (1995)");
        tenMoviesTest.add("Babe (1995)");
        tenMoviesTest.add("Dead Man Walking (1995)");
        tenMoviesTest.add("Richard III (1995)");*/
    	
    	movieData = MovieRecommender.initializeMovieData(Paths.get("movies.txt"));
        randMovieIDs = MovieRecommender.getRandMovies(movieData);
        for (int i = 0; i < randMovieIDs.size(); i++) {
            tenMoviesTest.add(MovieRecommender.getMovieTitle(randMovieIDs.get(i), movieData));
        }
        System.out.println("CALLING RATE PAGE");
        return ok(rate.render("Rate 10 Movies", tenMoviesTest, ratingsForm));
    }
    
    public Result results() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> test = filledForm.data();
        System.out.println("Form Values Begin");
        for (String key : test.keySet()) {
        	System.out.println(test.get(key));
        }
        System.out.println("Form Values End.");
        
        TenRatings created = /*filledForm.get();*/ new TenRatings();
        created.m1 = Integer.parseInt(test.get("m1"));
        created.m2 = Integer.parseInt(test.get("m2"));
        created.m3 = Integer.parseInt(test.get("m3"));
        created.m4 = Integer.parseInt(test.get("m4"));
        created.m5 = Integer.parseInt(test.get("m5"));
        created.m6 = Integer.parseInt(test.get("m6"));
        created.m7 = Integer.parseInt(test.get("m7"));
        created.m8 = Integer.parseInt(test.get("m8"));
        created.m9 = Integer.parseInt(test.get("m9"));
        created.m10 = Integer.parseInt(test.get("m10"));
        
        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
        System.out.println("New Object Begin");
        System.out.println(created.m1);
        System.out.println(created.m2);
        System.out.println(created.m3);
        System.out.println(created.m4);
        System.out.println(created.m5);
        System.out.println(created.m6);
        System.out.println(created.m7);
        System.out.println(created.m8);
        System.out.println(created.m9);
        System.out.println(created.m10);
        System.out.println("New Object End");

        
        //Grab each rating in TenRatings and add to User Ratings.
        HashMap<Integer, Integer> ratingsMap = new HashMap<Integer, Integer>();
        ratingsMap.put(randMovieIDs.get(0), created.m1);
        ratingsMap.put(randMovieIDs.get(1), created.m2);
        ratingsMap.put(randMovieIDs.get(2), created.m3);
        ratingsMap.put(randMovieIDs.get(3), created.m4);
        ratingsMap.put(randMovieIDs.get(4), created.m5);
        ratingsMap.put(randMovieIDs.get(5), created.m6);
        ratingsMap.put(randMovieIDs.get(6), created.m7);
        ratingsMap.put(randMovieIDs.get(7), created.m8);
        ratingsMap.put(randMovieIDs.get(8), created.m9);
        ratingsMap.put(randMovieIDs.get(9), created.m10);

        //Call getRecommendation() to populate recommendations ArrayList
        recommendations = MovieRecommender.getRecommendations(MovieRecommender.createNewUserVector(ratingsMap, movieData.size()), movieData);
        
        
        return ok(results.render("Results", recommendations));
    }
}
