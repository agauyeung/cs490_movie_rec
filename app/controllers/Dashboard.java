package controllers;

import models.User;
import play.mvc.*;
import views.html.dashboard.index;

/**
 * User: yesnault
 * Date: 22/01/12
 */
@Security.Authenticated(Secured.class)
public class Dashboard extends Controller {

    public Result index() {
        return ok(index.render(User.findByEmail(request().username())));
    }
}
