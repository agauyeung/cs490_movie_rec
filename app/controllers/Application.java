package controllers;

import play.data.Form;
import play.*;
import play.mvc.*;

import models.TenRatings;
import views.html.*;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Application extends Controller {

    final static Form<TenRatings> ratingsForm = Form.form(TenRatings.class);
    List<Integer> randMovieIDs = null;
    List<String> tenMoviesTest = new ArrayList<String>();
    List<String> recommendations = new ArrayList<String>();

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
        randMovieIDs = getRandMovies();
        for (int i = 0; i < randMovieIDs.size(); i++) {
            tenMoviesTest.add(getMovieTitle(randMovieIDs.get(i)));
        }
        
        return ok(rate.render("Rate 10 Movies", tenMoviesTest, ratingsForm));
    }
    
    public Result results() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        TenRatings created = filledForm.get();
        
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
        recommendations = getRecommendations(createNewUserVector(ratingsMap));
        
        
        return ok(results.render("Results", recommendations));
    }
}
