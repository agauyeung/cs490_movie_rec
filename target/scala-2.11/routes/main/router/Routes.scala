
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/conf/routes
// @DATE:Sun Oct 11 22:58:18 PDT 2015

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
  Application_1: controllers.Application,
  // @LINE:18
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:18
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recommended""", """controllers.Application.recommended()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """history""", """controllers.Application.history()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rate""", """controllers.Application.rate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """results""", """controllers.Application.results()"""),
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
    Application_1.index(),
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

  // @LINE:9
  private[this] lazy val controllers_Application_recommended1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recommended")))
  )
  private[this] lazy val controllers_Application_recommended1_invoker = createInvoker(
    Application_1.recommended(),
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

  // @LINE:12
  private[this] lazy val controllers_Application_history2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("history")))
  )
  private[this] lazy val controllers_Application_history2_invoker = createInvoker(
    Application_1.history(),
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

  // @LINE:15
  private[this] lazy val controllers_Application_register3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_register3_invoker = createInvoker(
    Application_1.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "register",
      Nil,
      "GET",
      """ User Registration page""",
      this.prefix + """register"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:22
  private[this] lazy val controllers_Application_rate5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rate")))
  )
  private[this] lazy val controllers_Application_rate5_invoker = createInvoker(
    Application_1.rate(),
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

  // @LINE:25
  private[this] lazy val controllers_Application_results6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("results")))
  )
  private[this] lazy val controllers_Application_results6_invoker = createInvoker(
    Application_1.results(),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Application_recommended1_route(params) =>
      call { 
        controllers_Application_recommended1_invoker.call(Application_1.recommended())
      }
  
    // @LINE:12
    case controllers_Application_history2_route(params) =>
      call { 
        controllers_Application_history2_invoker.call(Application_1.history())
      }
  
    // @LINE:15
    case controllers_Application_register3_route(params) =>
      call { 
        controllers_Application_register3_invoker.call(Application_1.register())
      }
  
    // @LINE:18
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:22
    case controllers_Application_rate5_route(params) =>
      call { 
        controllers_Application_rate5_invoker.call(Application_1.rate())
      }
  
    // @LINE:25
    case controllers_Application_results6_route(params) =>
      call { 
        controllers_Application_results6_invoker.call(Application_1.results())
      }
  }
}