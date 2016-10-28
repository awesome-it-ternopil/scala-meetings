package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's page.
 */
public class HomeController extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

}
