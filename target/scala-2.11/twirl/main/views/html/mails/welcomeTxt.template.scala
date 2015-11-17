
package views.html.mails

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcomeTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class welcomeTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, link: String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),_display_(/*2.2*/Messages("mail.welcome.hello", name)),format.raw/*2.38*/("""

"""),_display_(/*4.2*/Messages("mail.welcome.prelink")),format.raw/*4.34*/("""

"""),_display_(/*6.2*/link),format.raw/*6.6*/("""

"""),_display_(/*8.2*/Messages("mail.welcome.postlink")),format.raw/*8.35*/("""

"""),_display_(/*10.2*/Messages("mail.sign")))
      }
    }
  }

  def render(name:String,link:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(name,link)(messages)

  def f:((String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (name,link) => (messages) => apply(name,link)(messages)

  def ref: this.type = this

}


}

/**/
object welcomeTxt extends welcomeTxt_Scope0.welcomeTxt
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/mails/welcomeTxt.scala.html
                  HASH: 94f9f169b2554e017f86cbfa644fcce3282e48de
                  MATRIX: 559->1|711->58|738->60|794->96|822->99|874->131|902->134|925->138|953->141|1006->174|1035->177
                  LINES: 20->1|25->1|26->2|26->2|28->4|28->4|30->6|30->6|32->8|32->8|34->10
                  -- GENERATED --
              */
          