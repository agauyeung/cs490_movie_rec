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
    MovieRecommender movRec = new MovieRecommender("movies.txt", "Vn.txt");

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
        randMovieIDs = movRec.getRandMovies();
        for (int i = 0; i < randMovieIDs.size(); i++) {
            tenMoviesTest.add(MovieRecommender.getMovieTitle(randMovieIDs.get(i)));
        }
        System.out.println("CALLING RATE PAGE");
        return ok(rate.render("Rate 10 Movies", tenMoviesTest, ratingsForm));
    }
    
    public Result results() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();

        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
        //Grab each rating in from the form and add to User Ratings.
        HashMap<Integer, Integer> ratingsMap = new HashMap<Integer, Integer>();
        ratingsMap.put(randMovieIDs.get(0), Integer.parseInt(formMap.get("m1")));
        ratingsMap.put(randMovieIDs.get(1), Integer.parseInt(formMap.get("m2")));
        ratingsMap.put(randMovieIDs.get(2), Integer.parseInt(formMap.get("m3")));
        ratingsMap.put(randMovieIDs.get(3), Integer.parseInt(formMap.get("m4")));
        ratingsMap.put(randMovieIDs.get(4), Integer.parseInt(formMap.get("m5")));
        ratingsMap.put(randMovieIDs.get(5), Integer.parseInt(formMap.get("m6")));
        ratingsMap.put(randMovieIDs.get(6), Integer.parseInt(formMap.get("m7")));
        ratingsMap.put(randMovieIDs.get(7), Integer.parseInt(formMap.get("m8")));
        ratingsMap.put(randMovieIDs.get(8), Integer.parseInt(formMap.get("m9")));
        ratingsMap.put(randMovieIDs.get(9), Integer.parseInt(formMap.get("m10")));

        //Call getRecommendation() to populate recommendations ArrayList
        List<String> recommendations = movRec.getRecommendations(movRec.createNewUserVector(ratingsMap));
        
        return ok(results.render("Results", recommendations));
    }
    
    public Result random() {
    	List<String> recommendations = movRec.getRecommendations(movRec.genRandUser());

    	return ok(results.render("Random", recommendations));
    }
}
