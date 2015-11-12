
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object results_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object results_Scope1 {
import java.util

class results extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,util.List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, recommendations: util.List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.53*/("""

"""),_display_(/*4.2*/base(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""	"""),format.raw/*4.63*/("""
    """),format.raw/*5.43*/("""
    """),_display_(/*6.6*/for(recommendation <- recommendations) yield /*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
        """),_display_(/*7.10*/recommendation),format.raw/*7.24*/("""  
        """),format.raw/*8.9*/("""<br>
    """)))}),format.raw/*9.6*/("""
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(title:String,recommendations:util.List[String]): play.twirl.api.HtmlFormat.Appendable = apply(title,recommendations)

  def f:((String,util.List[String]) => play.twirl.api.HtmlFormat.Appendable) = (title,recommendations) => apply(title,recommendations)

  def ref: this.type = this

}


}
}

/**/
object results extends results_Scope0.results_Scope1.results
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 17:04:58 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/results.scala.html
                  HASH: 353d2dca358570f932b633836c643ace03813097
                  MATRIX: 596->19|742->70|770->73|789->84|828->86|856->134|888->177|919->183|972->221|1011->223|1047->233|1081->247|1118->258|1157->268|1189->270
                  LINES: 23->2|28->2|30->4|30->4|30->4|30->4|31->5|32->6|32->6|32->6|33->7|33->7|34->8|35->9|36->10
                  -- GENERATED --
              */
          