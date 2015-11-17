
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/nmovie/cs490_movie_rec/conf/routes
// @DATE:Mon Nov 16 18:35:09 PST 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:44
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:60
  class ReverseMyAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def public(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "public/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:65
    def commonCss(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/common/stylesheets")))
      Call("GET", _prefix + { _defaultPrefix } + "common/css/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:62
    def css(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/stylesheets")))
      Call("GET", _prefix + { _defaultPrefix } + "css/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:61
    def lib(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib")))
      Call("GET", _prefix + { _defaultPrefix } + "lib/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:64
    def img(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/images")))
      Call("GET", _prefix + { _defaultPrefix } + "img/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:67
    def commonImg(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/common/images")))
      Call("GET", _prefix + { _defaultPrefix } + "common/img/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:63
    def js(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/javascripts")))
      Call("GET", _prefix + { _defaultPrefix } + "js/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:66
    def commonJs(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public/lib/common/javascripts")))
      Call("GET", _prefix + { _defaultPrefix } + "common/js/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseAuth(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def handleChangePassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "change-password")
    }
  
    // @LINE:6
    def startSignUp(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:7
    def handleStartSignUp(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:13
    def handleForgotPassword(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset-password")
    }
  
    // @LINE:11
    def signOut(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signout")
    }
  
    // @LINE:14
    def resetPassword(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reset-password/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:8
    def signUp(token:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signup/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:12
    def forgotPassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reset-password")
    }
  
    // @LINE:16
    def changePassword(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "change-password")
    }
  
    // @LINE:18
    def accessDenied(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "denied")
    }
  
    // @LINE:15
    def handleResetPassword(token:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "reset-password/" + implicitly[PathBindable[String]].unbind("token", dynamicString(token)))
    }
  
    // @LINE:10
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "authenticate")
    }
  
    // @LINE:9
    def signIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "signin")
    }
  
  }

  // @LINE:30
  class ReverseRecommender(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def rate(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rate")
    }
  
    // @LINE:30
    def recommended(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "recommended")
    }
  
    // @LINE:50
    def results(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "results")
    }
  
    // @LINE:41
    def users(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:52
    def random(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "random")
    }
  
    // @LINE:33
    def history(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "history")
    }
  
    // @LINE:38
    def view(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "view")
    }
  
  }

  // @LINE:22
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def myAccount(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "myaccount")
    }
  
    // @LINE:25
    def serviceAandServiceB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "serviceA_and_ServiceB")
    }
  
    // @LINE:26
    def settings(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "settings")
    }
  
    // @LINE:23
    def serviceA(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "serviceA")
    }
  
    // @LINE:24
    def serviceAorServiceB(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "serviceA_or_ServiceB")
    }
  
    // @LINE:22
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:56
    def selectLang(lang:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "lang/" + implicitly[PathBindable[String]].unbind("lang", lang))
    }
  
  }


}