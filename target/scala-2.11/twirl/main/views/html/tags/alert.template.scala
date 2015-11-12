
package views.html.tags

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object alert_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class alert extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msg: String, key: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*2.2*/alertType/*2.11*/ = {{ "alert-" + (if (key == "error") "danger" else key) }};
Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.69*/("""
"""),format.raw/*3.1*/("""<div class="alert """),_display_(/*3.20*/alertType),format.raw/*3.29*/(""" """),format.raw/*3.30*/("""alert-dismissible" role="alert">
	<button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	"""),_display_(/*5.3*/msg),format.raw/*5.6*/("""
"""),format.raw/*6.1*/("""</div>"""))
      }
    }
  }

  def render(msg:String,key:String): play.twirl.api.HtmlFormat.Appendable = apply(msg,key)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (msg,key) => apply(msg,key)

  def ref: this.type = this

}


}

/**/
object alert extends alert_Scope0.alert
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/tags/alert.scala.html
                  HASH: a937d0b2caf13f47760f65c26fc2514128e6061e
                  MATRIX: 539->1|643->29|660->38|748->27|776->96|803->97|848->116|877->125|905->126|1106->302|1128->305|1155->306
                  LINES: 20->1|24->2|24->2|25->1|26->2|27->3|27->3|27->3|27->3|29->5|29->5|30->6
                  -- GENERATED --
              */
          