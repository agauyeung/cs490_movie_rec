package controllers;

import models.Users;
import models.Movies;
import models.TenRatings;
import models.MovieRecommender;

import play.Logger;
import play.data.Form;
import play.mvc.*;
import play.db.*;
import play.data.*;

import play.i18n.*;
import play.api.i18n.Lang;

import views.html.*;

import static play.data.Form.form;

import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recommender extends Controller {
    
    final static Form<TenRatings> ratingsForm = Form.form(TenRatings.class);
    final static Form<Users> dbRegForm = Form.form(Users.class);

    List<Integer> randMovieIDs = null;
    List<String> tenMoviesTest = null;
    
    //TODO: TIMER here to wrap construction of movRec object after SVD calc
    MovieRecommender movRec = new MovieRecommender("movies_1M.txt", "V_1M_short.txt");

    //database stuff

    //CAN CREATE methods to open other pages...

    public Result recommended() {
    	return ok(recommended.render("Recommended For You"));
    }
    
    public Result history() {
        return ok(history.render("Rating History"));
    }
    
    /**
    public Result register_user() {
        return ok(register_user.render("User Registration", dbRegForm));
    }
    **/
    
    /**
    public Result login() {
        return ok(login.render("User Login", login));
    }
    **/

    public Result view() {
        return ok(view.render( 
            Movies.find.all()
        ));
    }
    
    public Result users() {
        return ok(users.render( 
            Users.find.all()
        ));
    }
    
    /**
    public static Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().email);
            return redirect(
                routes.Application.index()
            );
        }
    }
    **/
    
    /**
    public Result registered() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();
        
        Grab each rating in from the form and add to User Ratings.
        String email = formMap.get("username");
        String username = formMap.get("username");
        String password = formMap.get("password");
        
        //TODO: PLACE THEM INTO DATABASE!
        //TODO: BACKEND; CHECK USERNAME/PASSWORD for validity.
        
        Users newUser = new Users();
        newUser.email = email;
        newUser.username = username;
        newUser.password = password;
        newUser.save();

        return ok(registered.render("Registration Confirmation", username));
    }
    **/

    /** DEMO */
    public Result rate() { 	    	
        randMovieIDs = movRec.getRandMovies();
        tenMoviesTest = new ArrayList<String>();
        for (int i = 0; i < randMovieIDs.size(); i++) {
            tenMoviesTest.add(MovieRecommender.getMovieTitle(randMovieIDs.get(i)));
        }
        System.out.println("CALLING RATE PAGE");
        
        return ok(rate.render("Rate 10 Movies", tenMoviesTest, ratingsForm));
    }
    
    public Result results() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();

        /** DO NOT filledForm.get() because Eclipse Build interferes with it
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
    
    /** TESTING */
    public Result random() {
    	List<String> recommendations = movRec.getRecommendations(movRec.genRandUser());

    	return ok(results.render("Random", recommendations));
    }
}
