
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/movie/master/cs490_movie_rec/conf/routes
// @DATE:Tue Nov 10 03:24:49 PST 2015

package controllers.account.settings;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.account.settings.ReverseEmail Email = new controllers.account.settings.ReverseEmail(RoutesPrefix.byNamePrefix());
  public static final controllers.account.settings.ReversePassword Password = new controllers.account.settings.ReversePassword(RoutesPrefix.byNamePrefix());
  public static final controllers.account.settings.ReverseIndex Index = new controllers.account.settings.ReverseIndex(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.account.settings.javascript.ReverseEmail Email = new controllers.account.settings.javascript.ReverseEmail(RoutesPrefix.byNamePrefix());
    public static final controllers.account.settings.javascript.ReversePassword Password = new controllers.account.settings.javascript.ReversePassword(RoutesPrefix.byNamePrefix());
    public static final controllers.account.settings.javascript.ReverseIndex Index = new controllers.account.settings.javascript.ReverseIndex(RoutesPrefix.byNamePrefix());
  }

}
