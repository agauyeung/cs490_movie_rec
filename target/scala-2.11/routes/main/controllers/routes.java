
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/nmovie/cs490_movie_rec/conf/routes
// @DATE:Mon Nov 16 18:35:09 PST 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMyAssets MyAssets = new controllers.ReverseMyAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuth Auth = new controllers.ReverseAuth(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRecommender Recommender = new controllers.ReverseRecommender(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMyAssets MyAssets = new controllers.javascript.ReverseMyAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuth Auth = new controllers.javascript.ReverseAuth(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRecommender Recommender = new controllers.javascript.ReverseRecommender(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
