
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object view_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object view_Scope1 {
import java.util

class view extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Movies],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(movies: util.List[Movies]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.29*/("""

"""),format.raw/*4.1*/("""<h1>View All Movies/<h1>

<ul> 
"""),_display_(/*7.2*/for(movie <- movies) yield /*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
  """),format.raw/*8.3*/("""<li>"""),_display_(/*8.8*/movie/*8.13*/.name),format.raw/*8.18*/("""
    """),format.raw/*9.5*/("""<ul> 
        """),_display_(/*10.10*/movie/*10.15*/.director),format.raw/*10.24*/("""
    """),format.raw/*11.5*/("""</ul>
  </li>
""")))}),format.raw/*13.2*/(""" 
"""),format.raw/*14.1*/("""</ul>
"""))
      }
    }
  }

  def render(movies:util.List[Movies]): play.twirl.api.HtmlFormat.Appendable = apply(movies)

  def f:((util.List[Movies]) => play.twirl.api.HtmlFormat.Appendable) = (movies) => apply(movies)

  def ref: this.type = this

}


}
}

/**/
object view extends view_Scope0.view_Scope1.view
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/view.scala.html
                  HASH: dad6aca2292a7147d4662cd41fa6675d4554a971
                  MATRIX: 580->19|702->46|730->48|788->81|823->101|862->103|891->106|921->111|934->116|959->121|990->126|1032->141|1046->146|1076->155|1108->160|1153->175|1182->177
                  LINES: 23->2|28->2|30->4|33->7|33->7|33->7|34->8|34->8|34->8|34->8|35->9|36->10|36->10|36->10|37->11|39->13|40->14
                  -- GENERATED --
              */
          