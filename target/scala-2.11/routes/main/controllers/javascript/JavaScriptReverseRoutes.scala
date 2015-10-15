
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/conf/routes
// @DATE:Wed Oct 14 17:46:26 PDT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def rate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.rate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rate"})
        }
      """
    )
  
    // @LINE:9
    def recommended: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.recommended",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommended"})
        }
      """
    )
  
    // @LINE:25
    def results: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.results",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "results"})
        }
      """
    )
  
    // @LINE:15
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:27
    def random: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.random",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "random"})
        }
      """
    )
  
    // @LINE:12
    def history: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.history",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}