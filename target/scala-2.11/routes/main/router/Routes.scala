
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/movie/master/cs490_movie_rec/conf/routes
// @DATE:Tue Nov 10 03:24:49 PST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_6: controllers.Application,
  // @LINE:7
  Dashboard_2: controllers.Dashboard,
  // @LINE:12
  Index_7: controllers.account.settings.Index,
  // @LINE:13
  Password_1: controllers.account.settings.Password,
  // @LINE:15
  Email_3: controllers.account.settings.Email,
  // @LINE:19
  Signup_5: controllers.account.Signup,
  // @LINE:26
  Reset_0: controllers.account.Reset,
  // @LINE:36
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:7
    Dashboard_2: controllers.Dashboard,
    // @LINE:12
    Index_7: controllers.account.settings.Index,
    // @LINE:13
    Password_1: controllers.account.settings.Password,
    // @LINE:15
    Email_3: controllers.account.settings.Email,
    // @LINE:19
    Signup_5: controllers.account.Signup,
    // @LINE:26
    Reset_0: controllers.account.Reset,
    // @LINE:36
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_6, Dashboard_2, Index_7, Password_1, Email_3, Signup_5, Reset_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, Dashboard_2, Index_7, Password_1, Email_3, Signup_5, Reset_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Dashboard.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.account.settings.Index.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.runPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.runEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm/$confirmToken<[^/]+>""", """controllers.account.Signup.confirm(confirmToken:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.ask()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.runAsk()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.reset(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.runReset(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """email/$token<[^/]+>""", """controllers.account.settings.Email.validateEmail(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommended""", """controllers.Application.recommended()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history""", """controllers.Application.history()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register_user""", """controllers.Application.register_user()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """view""", """controllers.Application.view()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Application.users()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rate""", """controllers.Application.rate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """results""", """controllers.Application.results()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """random""", """controllers.Application.random()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registered""", """controllers.Application.registered()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_6.index(),
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

  // @LINE:7
  private[this] lazy val controllers_Dashboard_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Dashboard_index1_invoker = createInvoker(
    Dashboard_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_authenticate2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_authenticate2_invoker = createInvoker(
    Application_6.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
    Application_6.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_account_settings_Index_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_account_settings_Index_index4_invoker = createInvoker(
    Index_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Index",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_account_settings_Password_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_index5_invoker = createInvoker(
    Password_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_account_settings_Password_runPassword6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_runPassword6_invoker = createInvoker(
    Password_1.runPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "runPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_account_settings_Email_index7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_index7_invoker = createInvoker(
    Email_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_account_settings_Email_runEmail8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_runEmail8_invoker = createInvoker(
    Email_3.runEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "runEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_account_Signup_create9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create9_invoker = createInvoker(
    Signup_5.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """ Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_account_Signup_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save10_invoker = createInvoker(
    Signup_5.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_account_Signup_confirm11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm11_invoker = createInvoker(
    Signup_5.confirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "confirm",
      Seq(classOf[String]),
      "GET",
      """ Accessed when the user confirms the registration.""",
      this.prefix + """confirm/$confirmToken<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_account_Reset_ask12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask12_invoker = createInvoker(
    Reset_0.ask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "ask",
      Nil,
      "GET",
      """ Displays a page to send a reset email given the user's email.""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_account_Reset_runAsk13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk13_invoker = createInvoker(
    Reset_0.runAsk(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runAsk",
      Nil,
      "POST",
      """""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_account_Reset_reset14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset14_invoker = createInvoker(
    Reset_0.reset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "reset",
      Seq(classOf[String]),
      "GET",
      """ Resets the password using the password.""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_account_Reset_runReset15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset15_invoker = createInvoker(
    Reset_0.runReset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runReset",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_account_settings_Email_validateEmail16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail16_invoker = createInvoker(
    Email_3.validateEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "validateEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """email/$token<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_at17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at17_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_recommended18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommended")))
  )
  private[this] lazy val controllers_Application_recommended18_invoker = createInvoker(
    Application_6.recommended(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "recommended",
      Nil,
      "GET",
      """ Recommended For You page""",
      this.prefix + """recommended"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Application_history19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Application_history19_invoker = createInvoker(
    Application_6.history(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "history",
      Nil,
      "GET",
      """ Rating History page""",
      this.prefix + """history"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Application_register_user20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register_user")))
  )
  private[this] lazy val controllers_Application_register_user20_invoker = createInvoker(
    Application_6.register_user(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "register_user",
      Nil,
      "GET",
      """ User_DB Registration page""",
      this.prefix + """register_user"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Application_view21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("view")))
  )
  private[this] lazy val controllers_Application_view21_invoker = createInvoker(
    Application_6.view(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """view"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Application_users22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Application_users22_invoker = createInvoker(
    Application_6.users(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "users",
      Nil,
      "GET",
      """ View users in the database""",
      this.prefix + """users"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:58
  private[this] lazy val controllers_Application_rate24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rate")))
  )
  private[this] lazy val controllers_Application_rate24_invoker = createInvoker(
    Application_6.rate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "rate",
      Nil,
      "GET",
      """ Ratings""",
      this.prefix + """rate"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Application_results25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("results")))
  )
  private[this] lazy val controllers_Application_results25_invoker = createInvoker(
    Application_6.results(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "results",
      Nil,
      "POST",
      """ Results""",
      this.prefix + """results"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_Application_random26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("random")))
  )
  private[this] lazy val controllers_Application_random26_invoker = createInvoker(
    Application_6.random(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "random",
      Nil,
      "GET",
      """""",
      this.prefix + """random"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Application_registered27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registered")))
  )
  private[this] lazy val controllers_Application_registered27_invoker = createInvoker(
    Application_6.registered(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "registered",
      Nil,
      "POST",
      """""",
      this.prefix + """registered"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_6.index())
      }
  
    // @LINE:7
    case controllers_Dashboard_index1_route(params) =>
      call { 
        controllers_Dashboard_index1_invoker.call(Dashboard_2.index())
      }
  
    // @LINE:9
    case controllers_Application_authenticate2_route(params) =>
      call { 
        controllers_Application_authenticate2_invoker.call(Application_6.authenticate())
      }
  
    // @LINE:10
    case controllers_Application_logout3_route(params) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_6.logout())
      }
  
    // @LINE:12
    case controllers_account_settings_Index_index4_route(params) =>
      call { 
        controllers_account_settings_Index_index4_invoker.call(Index_7.index())
      }
  
    // @LINE:13
    case controllers_account_settings_Password_index5_route(params) =>
      call { 
        controllers_account_settings_Password_index5_invoker.call(Password_1.index())
      }
  
    // @LINE:14
    case controllers_account_settings_Password_runPassword6_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword6_invoker.call(Password_1.runPassword())
      }
  
    // @LINE:15
    case controllers_account_settings_Email_index7_route(params) =>
      call { 
        controllers_account_settings_Email_index7_invoker.call(Email_3.index())
      }
  
    // @LINE:16
    case controllers_account_settings_Email_runEmail8_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail8_invoker.call(Email_3.runEmail())
      }
  
    // @LINE:19
    case controllers_account_Signup_create9_route(params) =>
      call { 
        controllers_account_Signup_create9_invoker.call(Signup_5.create())
      }
  
    // @LINE:20
    case controllers_account_Signup_save10_route(params) =>
      call { 
        controllers_account_Signup_save10_invoker.call(Signup_5.save())
      }
  
    // @LINE:23
    case controllers_account_Signup_confirm11_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm11_invoker.call(Signup_5.confirm(confirmToken))
      }
  
    // @LINE:26
    case controllers_account_Reset_ask12_route(params) =>
      call { 
        controllers_account_Reset_ask12_invoker.call(Reset_0.ask())
      }
  
    // @LINE:27
    case controllers_account_Reset_runAsk13_route(params) =>
      call { 
        controllers_account_Reset_runAsk13_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:30
    case controllers_account_Reset_reset14_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset14_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:31
    case controllers_account_Reset_runReset15_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset15_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:33
    case controllers_account_settings_Email_validateEmail16_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail16_invoker.call(Email_3.validateEmail(token))
      }
  
    // @LINE:36
    case controllers_Assets_at17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at17_invoker.call(Assets_4.at(path, file))
      }
  
    // @LINE:39
    case controllers_Application_recommended18_route(params) =>
      call { 
        controllers_Application_recommended18_invoker.call(Application_6.recommended())
      }
  
    // @LINE:42
    case controllers_Application_history19_route(params) =>
      call { 
        controllers_Application_history19_invoker.call(Application_6.history())
      }
  
    // @LINE:45
    case controllers_Application_register_user20_route(params) =>
      call { 
        controllers_Application_register_user20_invoker.call(Application_6.register_user())
      }
  
    // @LINE:48
    case controllers_Application_view21_route(params) =>
      call { 
        controllers_Application_view21_invoker.call(Application_6.view())
      }
  
    // @LINE:51
    case controllers_Application_users22_route(params) =>
      call { 
        controllers_Application_users22_invoker.call(Application_6.users())
      }
  
    // @LINE:54
    case controllers_Assets_versioned23_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:58
    case controllers_Application_rate24_route(params) =>
      call { 
        controllers_Application_rate24_invoker.call(Application_6.rate())
      }
  
    // @LINE:61
    case controllers_Application_results25_route(params) =>
      call { 
        controllers_Application_results25_invoker.call(Application_6.results())
      }
  
    // @LINE:63
    case controllers_Application_random26_route(params) =>
      call { 
        controllers_Application_random26_invoker.call(Application_6.random())
      }
  
    // @LINE:65
    case controllers_Application_registered27_route(params) =>
      call { 
        controllers_Application_registered27_invoker.call(Application_6.registered())
      }
  }
}