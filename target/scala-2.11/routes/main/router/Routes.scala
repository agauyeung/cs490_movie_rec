
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/movie/cs490_movie_rec/conf/routes
// @DATE:Wed Nov 11 16:04:25 PST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Auth_1: controllers.Auth,
  // @LINE:22
  Application_4: controllers.Application,
  // @LINE:30
  Recommender_2: controllers.Recommender,
  // @LINE:44
  Assets_3: controllers.Assets,
  // @LINE:60
  MyAssets_0: controllers.MyAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Auth_1: controllers.Auth,
    // @LINE:22
    Application_4: controllers.Application,
    // @LINE:30
    Recommender_2: controllers.Recommender,
    // @LINE:44
    Assets_3: controllers.Assets,
    // @LINE:60
    MyAssets_0: controllers.MyAssets
  ) = this(errorHandler, Auth_1, Application_4, Recommender_2, Assets_3, MyAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Auth_1, Application_4, Recommender_2, Assets_3, MyAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Auth.startSignUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Auth.handleStartSignUp"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup/$token<[^/]+>""", """controllers.Auth.signUp(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.Auth.signIn"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate""", """controllers.Auth.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signout""", """controllers.Auth.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password""", """controllers.Auth.forgotPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password""", """controllers.Auth.handleForgotPassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password/$token<[^/]+>""", """controllers.Auth.resetPassword(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset-password/$token<[^/]+>""", """controllers.Auth.handleResetPassword(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """change-password""", """controllers.Auth.changePassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """change-password""", """controllers.Auth.handleChangePassword"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """denied""", """controllers.Auth.accessDenied"""),
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """serviceA""", """controllers.Application.serviceA"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """serviceA_or_ServiceB""", """controllers.Application.serviceAorServiceB"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """serviceA_and_ServiceB""", """controllers.Application.serviceAandServiceB"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.Application.settings"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """myaccount""", """controllers.Application.myAccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommended""", """controllers.Recommender.recommended()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history""", """controllers.Recommender.history()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """view""", """controllers.Recommender.view()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Recommender.users()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rate""", """controllers.Recommender.rate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """results""", """controllers.Recommender.results()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """random""", """controllers.Recommender.random()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lang/$lang<(en)>""", """controllers.Application.selectLang(lang:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """public/$file<.+>""", """controllers.MyAssets.public(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lib/$file<.+>""", """controllers.MyAssets.lib(path:String = "/public/lib", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """css/$file<.+>""", """controllers.MyAssets.css(path:String = "/public/stylesheets", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """js/$file<.+>""", """controllers.MyAssets.js(path:String = "/public/javascripts", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """img/$file<.+>""", """controllers.MyAssets.img(path:String = "/public/images", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """common/css/$file<.+>""", """controllers.MyAssets.commonCss(path:String = "/public/lib/common/stylesheets", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """common/js/$file<.+>""", """controllers.MyAssets.commonJs(path:String = "/public/lib/common/javascripts", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """common/img/$file<.+>""", """controllers.MyAssets.commonImg(path:String = "/public/lib/common/images", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Auth_startSignUp0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Auth_startSignUp0_invoker = createInvoker(
    Auth_1.startSignUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "startSignUp",
      Nil,
      "GET",
      """ Authentication pages""",
      this.prefix + """signup"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Auth_handleStartSignUp1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Auth_handleStartSignUp1_invoker = createInvoker(
    Auth_1.handleStartSignUp,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleStartSignUp",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Auth_signUp2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Auth_signUp2_invoker = createInvoker(
    Auth_1.signUp(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "signUp",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """signup/$token<[^/]+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Auth_signIn3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_Auth_signIn3_invoker = createInvoker(
    Auth_1.signIn,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "signIn",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Auth_authenticate4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate")))
  )
  private[this] lazy val controllers_Auth_authenticate4_invoker = createInvoker(
    Auth_1.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """authenticate"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Auth_signOut5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_Auth_signOut5_invoker = createInvoker(
    Auth_1.signOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """signout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Auth_forgotPassword6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password")))
  )
  private[this] lazy val controllers_Auth_forgotPassword6_invoker = createInvoker(
    Auth_1.forgotPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "forgotPassword",
      Nil,
      "GET",
      """""",
      this.prefix + """reset-password"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Auth_handleForgotPassword7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password")))
  )
  private[this] lazy val controllers_Auth_handleForgotPassword7_invoker = createInvoker(
    Auth_1.handleForgotPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleForgotPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """reset-password"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Auth_resetPassword8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Auth_resetPassword8_invoker = createInvoker(
    Auth_1.resetPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "resetPassword",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """reset-password/$token<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Auth_handleResetPassword9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset-password/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Auth_handleResetPassword9_invoker = createInvoker(
    Auth_1.handleResetPassword(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleResetPassword",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset-password/$token<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Auth_changePassword10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("change-password")))
  )
  private[this] lazy val controllers_Auth_changePassword10_invoker = createInvoker(
    Auth_1.changePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "changePassword",
      Nil,
      "GET",
      """""",
      this.prefix + """change-password"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Auth_handleChangePassword11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("change-password")))
  )
  private[this] lazy val controllers_Auth_handleChangePassword11_invoker = createInvoker(
    Auth_1.handleChangePassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "handleChangePassword",
      Nil,
      "POST",
      """""",
      this.prefix + """change-password"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Auth_accessDenied12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("denied")))
  )
  private[this] lazy val controllers_Auth_accessDenied12_invoker = createInvoker(
    Auth_1.accessDenied,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Auth",
      "accessDenied",
      Nil,
      "GET",
      """""",
      this.prefix + """denied"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_index13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index13_invoker = createInvoker(
    Application_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_serviceA14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("serviceA")))
  )
  private[this] lazy val controllers_Application_serviceA14_invoker = createInvoker(
    Application_4.serviceA,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "serviceA",
      Nil,
      "GET",
      """""",
      this.prefix + """serviceA"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_serviceAorServiceB15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("serviceA_or_ServiceB")))
  )
  private[this] lazy val controllers_Application_serviceAorServiceB15_invoker = createInvoker(
    Application_4.serviceAorServiceB,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "serviceAorServiceB",
      Nil,
      "GET",
      """""",
      this.prefix + """serviceA_or_ServiceB"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_serviceAandServiceB16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("serviceA_and_ServiceB")))
  )
  private[this] lazy val controllers_Application_serviceAandServiceB16_invoker = createInvoker(
    Application_4.serviceAandServiceB,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "serviceAandServiceB",
      Nil,
      "GET",
      """""",
      this.prefix + """serviceA_and_ServiceB"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_settings17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_Application_settings17_invoker = createInvoker(
    Application_4.settings,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "settings",
      Nil,
      "GET",
      """""",
      this.prefix + """settings"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_myAccount18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("myaccount")))
  )
  private[this] lazy val controllers_Application_myAccount18_invoker = createInvoker(
    Application_4.myAccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "myAccount",
      Nil,
      "GET",
      """""",
      this.prefix + """myaccount"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Recommender_recommended19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommended")))
  )
  private[this] lazy val controllers_Recommender_recommended19_invoker = createInvoker(
    Recommender_2.recommended(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Recommender",
      "recommended",
      Nil,
      "GET",
      """ Recommended For You page""",
      this.prefix + """recommended"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Recommender_history20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Recommender_history20_invoker = createInvoker(
    Recommender_2.history(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Recommender",
      "history",
      Nil,
      "GET",
      """ Rating History page""",
      this.prefix + """history"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Recommender_view21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("view")))
  )
  private[this] lazy val controllers_Recommender_view21_invoker = createInvoker(
    Recommender_2.view(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Recommender",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """view"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Recommender_users22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Recommender_users22_invoker = createInvoker(
    Recommender_2.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Recommender",
      "users",
      Nil,
      "GET",
      """ View users in the database""",
      this.prefix + """users"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Recommender_rate24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rate")))
  )
  private[this] lazy val controllers_Recommender_rate24_invoker = createInvoker(
    Recommender_2.rate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Recommender",
      "rate",
      Nil,
      "GET",
      """ Ratings""",
      this.prefix + """rate"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Recommender_results25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("results")))
  )
  private[this] lazy val controllers_Recommender_results25_invoker = createInvoker(
    Recommender_2.results(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Recommender",
      "results",
      Nil,
      "POST",
      """ Results""",
      this.prefix + """results"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Recommender_random26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("random")))
  )
  private[this] lazy val controllers_Recommender_random26_invoker = createInvoker(
    Recommender_2.random(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Recommender",
      "random",
      Nil,
      "GET",
      """""",
      this.prefix + """random"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Application_selectLang27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lang/"), DynamicPart("lang", """(en)""",false)))
  )
  private[this] lazy val controllers_Application_selectLang27_invoker = createInvoker(
    Application_4.selectLang(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "selectLang",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """lang/$lang<(en)>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_MyAssets_public28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("public/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_public28_invoker = createInvoker(
    MyAssets_0.public(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "public",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """public/$file<.+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_MyAssets_lib29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lib/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_lib29_invoker = createInvoker(
    MyAssets_0.lib(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "lib",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """lib/$file<.+>"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_MyAssets_css30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("css/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_css30_invoker = createInvoker(
    MyAssets_0.css(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "css",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """css/$file<.+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_MyAssets_js31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("js/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_js31_invoker = createInvoker(
    MyAssets_0.js(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "js",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """js/$file<.+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_MyAssets_img32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("img/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_img32_invoker = createInvoker(
    MyAssets_0.img(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "img",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """img/$file<.+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_MyAssets_commonCss33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("common/css/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_commonCss33_invoker = createInvoker(
    MyAssets_0.commonCss(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "commonCss",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """common/css/$file<.+>"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_MyAssets_commonJs34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("common/js/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_commonJs34_invoker = createInvoker(
    MyAssets_0.commonJs(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "commonJs",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """common/js/$file<.+>"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_MyAssets_commonImg35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("common/img/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_MyAssets_commonImg35_invoker = createInvoker(
    MyAssets_0.commonImg(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MyAssets",
      "commonImg",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """common/img/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Auth_startSignUp0_route(params) =>
      call { 
        controllers_Auth_startSignUp0_invoker.call(Auth_1.startSignUp)
      }
  
    // @LINE:7
    case controllers_Auth_handleStartSignUp1_route(params) =>
      call { 
        controllers_Auth_handleStartSignUp1_invoker.call(Auth_1.handleStartSignUp)
      }
  
    // @LINE:8
    case controllers_Auth_signUp2_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Auth_signUp2_invoker.call(Auth_1.signUp(token))
      }
  
    // @LINE:9
    case controllers_Auth_signIn3_route(params) =>
      call { 
        controllers_Auth_signIn3_invoker.call(Auth_1.signIn)
      }
  
    // @LINE:10
    case controllers_Auth_authenticate4_route(params) =>
      call { 
        controllers_Auth_authenticate4_invoker.call(Auth_1.authenticate)
      }
  
    // @LINE:11
    case controllers_Auth_signOut5_route(params) =>
      call { 
        controllers_Auth_signOut5_invoker.call(Auth_1.signOut)
      }
  
    // @LINE:12
    case controllers_Auth_forgotPassword6_route(params) =>
      call { 
        controllers_Auth_forgotPassword6_invoker.call(Auth_1.forgotPassword)
      }
  
    // @LINE:13
    case controllers_Auth_handleForgotPassword7_route(params) =>
      call { 
        controllers_Auth_handleForgotPassword7_invoker.call(Auth_1.handleForgotPassword)
      }
  
    // @LINE:14
    case controllers_Auth_resetPassword8_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Auth_resetPassword8_invoker.call(Auth_1.resetPassword(token))
      }
  
    // @LINE:15
    case controllers_Auth_handleResetPassword9_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_Auth_handleResetPassword9_invoker.call(Auth_1.handleResetPassword(token))
      }
  
    // @LINE:16
    case controllers_Auth_changePassword10_route(params) =>
      call { 
        controllers_Auth_changePassword10_invoker.call(Auth_1.changePassword)
      }
  
    // @LINE:17
    case controllers_Auth_handleChangePassword11_route(params) =>
      call { 
        controllers_Auth_handleChangePassword11_invoker.call(Auth_1.handleChangePassword)
      }
  
    // @LINE:18
    case controllers_Auth_accessDenied12_route(params) =>
      call { 
        controllers_Auth_accessDenied12_invoker.call(Auth_1.accessDenied)
      }
  
    // @LINE:22
    case controllers_Application_index13_route(params) =>
      call { 
        controllers_Application_index13_invoker.call(Application_4.index)
      }
  
    // @LINE:23
    case controllers_Application_serviceA14_route(params) =>
      call { 
        controllers_Application_serviceA14_invoker.call(Application_4.serviceA)
      }
  
    // @LINE:24
    case controllers_Application_serviceAorServiceB15_route(params) =>
      call { 
        controllers_Application_serviceAorServiceB15_invoker.call(Application_4.serviceAorServiceB)
      }
  
    // @LINE:25
    case controllers_Application_serviceAandServiceB16_route(params) =>
      call { 
        controllers_Application_serviceAandServiceB16_invoker.call(Application_4.serviceAandServiceB)
      }
  
    // @LINE:26
    case controllers_Application_settings17_route(params) =>
      call { 
        controllers_Application_settings17_invoker.call(Application_4.settings)
      }
  
    // @LINE:27
    case controllers_Application_myAccount18_route(params) =>
      call { 
        controllers_Application_myAccount18_invoker.call(Application_4.myAccount)
      }
  
    // @LINE:30
    case controllers_Recommender_recommended19_route(params) =>
      call { 
        controllers_Recommender_recommended19_invoker.call(Recommender_2.recommended())
      }
  
    // @LINE:33
    case controllers_Recommender_history20_route(params) =>
      call { 
        controllers_Recommender_history20_invoker.call(Recommender_2.history())
      }
  
    // @LINE:38
    case controllers_Recommender_view21_route(params) =>
      call { 
        controllers_Recommender_view21_invoker.call(Recommender_2.view())
      }
  
    // @LINE:41
    case controllers_Recommender_users22_route(params) =>
      call { 
        controllers_Recommender_users22_invoker.call(Recommender_2.users())
      }
  
    // @LINE:44
    case controllers_Assets_versioned23_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:47
    case controllers_Recommender_rate24_route(params) =>
      call { 
        controllers_Recommender_rate24_invoker.call(Recommender_2.rate())
      }
  
    // @LINE:50
    case controllers_Recommender_results25_route(params) =>
      call { 
        controllers_Recommender_results25_invoker.call(Recommender_2.results())
      }
  
    // @LINE:52
    case controllers_Recommender_random26_route(params) =>
      call { 
        controllers_Recommender_random26_invoker.call(Recommender_2.random())
      }
  
    // @LINE:56
    case controllers_Application_selectLang27_route(params) =>
      call(params.fromPath[String]("lang", None)) { (lang) =>
        controllers_Application_selectLang27_invoker.call(Application_4.selectLang(lang))
      }
  
    // @LINE:60
    case controllers_MyAssets_public28_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_public28_invoker.call(MyAssets_0.public(path, file))
      }
  
    // @LINE:61
    case controllers_MyAssets_lib29_route(params) =>
      call(Param[String]("path", Right("/public/lib")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_lib29_invoker.call(MyAssets_0.lib(path, file))
      }
  
    // @LINE:62
    case controllers_MyAssets_css30_route(params) =>
      call(Param[String]("path", Right("/public/stylesheets")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_css30_invoker.call(MyAssets_0.css(path, file))
      }
  
    // @LINE:63
    case controllers_MyAssets_js31_route(params) =>
      call(Param[String]("path", Right("/public/javascripts")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_js31_invoker.call(MyAssets_0.js(path, file))
      }
  
    // @LINE:64
    case controllers_MyAssets_img32_route(params) =>
      call(Param[String]("path", Right("/public/images")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_img32_invoker.call(MyAssets_0.img(path, file))
      }
  
    // @LINE:65
    case controllers_MyAssets_commonCss33_route(params) =>
      call(Param[String]("path", Right("/public/lib/common/stylesheets")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_commonCss33_invoker.call(MyAssets_0.commonCss(path, file))
      }
  
    // @LINE:66
    case controllers_MyAssets_commonJs34_route(params) =>
      call(Param[String]("path", Right("/public/lib/common/javascripts")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_commonJs34_invoker.call(MyAssets_0.commonJs(path, file))
      }
  
    // @LINE:67
    case controllers_MyAssets_commonImg35_route(params) =>
      call(Param[String]("path", Right("/public/lib/common/images")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_MyAssets_commonImg35_invoker.call(MyAssets_0.commonImg(path, file))
      }
  }
}