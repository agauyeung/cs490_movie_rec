
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object recommended_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class recommended extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
object recommended extends recommended_Scope0.recommended
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:10 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/recommended.scala.html
                  HASH: 83c97e297a89da83287094de69f08f2731724bef
                  MATRIX: 539->1|649->16|677->19|696->30|735->32|763->80|796->124|827->126
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|30->6
                  -- GENERATED --
              */
          