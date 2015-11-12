
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object serviceAorServiceB_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class serviceAorServiceB extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit user: User, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import controllers.routes

Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.templates.logged(title = "Service A || Service B", tab = "serviceA_or_serviceB")/*5.93*/ {_display_(Seq[Any](format.raw/*5.95*/("""
	
	"""),format.raw/*7.2*/("""<h1 class="text-primary">Service A || Service B area</h1>
	
	<h3>This is the Service A OR Service B area. Only users with <strong>'serviceA' OR 'serviceB'</strong> services can be here.</h3>

""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(user:User,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply()(user,messages)

  def f:(() => (User,Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (user,messages) => apply()(user,messages)

  def ref: this.type = this

}


}

/**/
object serviceAorServiceB extends serviceAorServiceB_Scope0.serviceAorServiceB
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/serviceAorServiceB.scala.html
                  HASH: d3af4739ed311d1e90955323cf68f257fa455a9e
                  MATRIX: 560->1|723->44|751->73|778->75|790->80|884->166|923->168|953->172|1176->365
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|30->7|34->11
                  -- GENERATED --
              */
          