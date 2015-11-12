
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object history_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class history extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.43*/("""
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object history extends history_Scope0.history
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:46 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/history.scala.html
                  HASH: 8569b99322bd4919720e9cd5a5771f25fd22fd5f
                  MATRIX: 531->1|641->16|669->19|688->30|727->32|755->80|788->124|819->126
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|30->6
                  -- GENERATED --
              */
          