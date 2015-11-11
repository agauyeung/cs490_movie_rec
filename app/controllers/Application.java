package controllers;

import models.User;
import models.utils.AppException;
import play.Logger;
import play.data.Form;
import play.*;
import play.mvc.*;
import play.db.*;
import play.data.*;
import models.TenRatings;
import models.MovieRecommender;
import models.Movies;
import models.Users;
import views.html.*;

import static play.data.Form.form;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application extends Controller {


    public static Result GO_HOME = redirect(
            routes.Application.index()
    );

    public static Result GO_DASHBOARD = redirect(
            routes.Dashboard.index()
    );

    /**
     * Display the login page or dashboard if connected
     *
     * @return login page or dashboard
     */
    public static Result index() {
        // Check that the email matches a confirmed user before we redirect
        String email = ctx().session().get("email");
        if (email != null) {
            User user = User.findByEmail(email);
            if (user != null && user.validated) {
                return GO_DASHBOARD;
            } else {
                Logger.debug("Clearing invalid session credentials");
                session().clear();
            }
        }

        return ok(index.render(form(Register.class), form(Login.class)));
    }

    /**
     * Login static class used by Login Form.
     */
    public static class Login {

        @Constraints.Required
        public String email;
        @Constraints.Required
        public String password;

        /**
         * Validate the authentication.
         *
         * @return null if validation ok, string with details otherwise
         */
        public String validate() {

            User user = null;
            try {
                user = User.authenticate(email, password);
            } catch (AppException e) {
                return Messages.get("error.technical");
            }
            if (user == null) {
                return Messages.get("invalid.user.or.password");
            } else if (!user.validated) {
                return Messages.get("account.not.validated.check.mail");
            }
            return null;
        }

    }

    public static class Register {

        @Constraints.Required
        public String email;

        @Constraints.Required
        public String fullname;

        @Constraints.Required
        public String inputPassword;

        /**
         * Validate the authentication.
         *
         * @return null if validation ok, string with details otherwise
         */
        public String validate() {
            if (isBlank(email)) {
                return "Email is required";
            }

            if (isBlank(fullname)) {
                return "Full name is required";
            }

            if (isBlank(inputPassword)) {
                return "Password is required";
            }

            return null;
        }

        private boolean isBlank(String input) {
            return input == null || input.isEmpty() || input.trim().isEmpty();
        }
    }

    /**
     * Handle login form submission.
     *
     * @return Dashboard if auth OK or login form if auth KO
     */
    public Result authenticate() {
        Form<Login> loginForm = form(Login.class).bindFromRequest();

        Form<Register> registerForm = form(Register.class);

        if (loginForm.hasErrors()) {
            return badRequest(index.render(registerForm, loginForm));
        } else {
            session("email", loginForm.get().email);
            return GO_DASHBOARD;
        }
    }

    /**
     * Logout and clean the session.
     *
     * @return Index page
     */
    public Result logout() {
        session().clear();
        flash("success", Messages.get("youve.been.logged.out"));
        return GO_HOME;
    }

    final static Form<TenRatings> ratingsForm = Form.form(TenRatings.class);
    final static Form<Users> dbRegForm = Form.form(Users.class);
    
    final static Form<User> userRegistrationForm = Form.form(User.class);

    List<Integer> randMovieIDs = null;
    List<String> tenMoviesTest = null;
    
    //TODO: TIMER here to wrap construction of movRec object after SVD calc
    MovieRecommender movRec = new MovieRecommender("movies_1M.txt", "V_1M_short.txt");

    //database stuff

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
    
    
    public Result register_user() {
        return ok(register_user.render("User Registration", dbRegForm));
    }
    
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
    
    
    public Result registered() {
        Form<TenRatings> filledForm = ratingsForm.bindFromRequest();
        Map<String, String> formMap = filledForm.data();

        /** DO NOT USE filledForm.get() because Eclipse Build interferes with it
         *  WILL GET 0 or NULL values.
         */
        
        //Grab each rating in from the form and add to User Ratings.
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
    
    /** TESTING */
    public Result random() {
    	List<String> recommendations = movRec.getRecommendations(movRec.genRandUser());

    	return ok(results.render("Random", recommendations));
    }
}
