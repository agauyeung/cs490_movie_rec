
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object serviceAandServiceB_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class serviceAandServiceB extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit user: User, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import controllers.routes

Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.templates.logged(title = "Service A && Service B", tab = "serviceA_and_serviceB")/*5.94*/ {_display_(Seq[Any](format.raw/*5.96*/("""
	
	"""),format.raw/*7.2*/("""<h1 class="text-primary">Service A && Service B area</h1>
	
	<h3>This is the Service A AND Service B area. Only users with <strong>'serviceA' AND 'serviceB'</strong> services can be here.</h3>

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
object serviceAandServiceB extends serviceAandServiceB_Scope0.serviceAandServiceB
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/serviceAandServiceB.scala.html
                  HASH: 38fdcf0101746f87534ec796b46d399735f5ace0
                  MATRIX: 562->1|725->44|753->73|780->75|792->80|887->167|926->169|956->173|1181->368
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|30->7|34->11
                  -- GENERATED --
              */
          