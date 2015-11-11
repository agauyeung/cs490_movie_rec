
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/movie/master/cs490_movie_rec/conf/routes
// @DATE:Tue Nov 10 03:24:49 PST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:19
package controllers.account.javascript {
  import ReverseRouteContext.empty

  // @LINE:19
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.confirm",
      """
        function(confirmToken) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmToken", encodeURIComponent(confirmToken))})
        }
      """
    )
  
    // @LINE:20
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:19
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseReset(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def runReset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runReset",
      """
        function(token) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:26
    def ask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.ask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
        }
      """
    )
  
    // @LINE:30
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.reset",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:27
    def runAsk: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runAsk",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
        }
      """
    )
  
  }


}