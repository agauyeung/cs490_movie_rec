
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/movie/cs490_movie_rec/conf/routes
// @DATE:Wed Nov 11 16:04:25 PST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:44
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseMyAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def public: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.public",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:65
    def commonCss: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.commonCss",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "common/css/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:62
    def css: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.css",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "css/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:61
    def lib: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.lib",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lib/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:64
    def img: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.img",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "img/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:67
    def commonImg: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.commonImg",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "common/img/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:63
    def js: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.js",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "js/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
    // @LINE:66
    def commonJs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MyAssets.commonJs",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "common/js/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAuth(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def handleChangePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleChangePassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "change-password"})
        }
      """
    )
  
    // @LINE:6
    def startSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.startSignUp",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:7
    def handleStartSignUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleStartSignUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:13
    def handleForgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleForgotPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password"})
        }
      """
    )
  
    // @LINE:11
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
        }
      """
    )
  
    // @LINE:14
    def resetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.resetPassword",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:8
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.signUp",
      """
        function(token) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:12
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.forgotPassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password"})
        }
      """
    )
  
    // @LINE:16
    def changePassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.changePassword",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "change-password"})
        }
      """
    )
  
    // @LINE:18
    def accessDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.accessDenied",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "denied"})
        }
      """
    )
  
    // @LINE:15
    def handleResetPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.handleResetPassword",
      """
        function(token) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset-password/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token))})
        }
      """
    )
  
    // @LINE:10
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate"})
        }
      """
    )
  
    // @LINE:9
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Auth.signIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseRecommender(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def rate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Recommender.rate",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rate"})
        }
      """
    )
  
    // @LINE:30
    def recommended: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Recommender.recommended",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "recommended"})
        }
      """
    )
  
    // @LINE:50
    def results: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Recommender.results",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "results"})
        }
      """
    )
  
    // @LINE:41
    def users: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Recommender.users",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:52
    def random: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Recommender.random",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "random"})
        }
      """
    )
  
    // @LINE:33
    def history: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Recommender.history",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history"})
        }
      """
    )
  
    // @LINE:38
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Recommender.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "view"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def myAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.myAccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "myaccount"})
        }
      """
    )
  
    // @LINE:25
    def serviceAandServiceB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.serviceAandServiceB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceA_and_ServiceB"})
        }
      """
    )
  
    // @LINE:26
    def settings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.settings",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "settings"})
        }
      """
    )
  
    // @LINE:23
    def serviceA: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.serviceA",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceA"})
        }
      """
    )
  
    // @LINE:24
    def serviceAorServiceB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.serviceAorServiceB",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "serviceA_or_ServiceB"})
        }
      """
    )
  
    // @LINE:22
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:56
    def selectLang: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.selectLang",
      """
        function(lang) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lang/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lang", lang)})
        }
      """
    )
  
  }


}