
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rate_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object rate_Scope1 {
import java.util
import play.i18n._

class rate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,util.List[String],play.data.Form[TenRatings],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, movies: util.List[String], ratingsForm: play.data.Form[TenRatings]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*3.85*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/base(title)/*6.13*/ {_display_(Seq[Any](format.raw/*6.15*/("""	"""),format.raw/*6.63*/("""

    """),_display_(/*8.6*/form(action = routes.Recommender.results(), 'id -> "ratingsForm")/*8.71*/ {_display_(Seq[Any](format.raw/*8.73*/("""
        """),_display_(/*9.10*/for((movie, index) <- movies.zipWithIndex) yield /*9.52*/ {_display_(Seq[Any](format.raw/*9.54*/("""
            """),_display_(/*10.14*/movie),format.raw/*10.19*/("""
        """)))}),format.raw/*11.10*/("""
        
        """),format.raw/*13.9*/("""<input type="submit" class="tenratings" value="Get Recommendations">         
    """)))}),format.raw/*14.6*/("""
    """),format.raw/*15.43*/("""
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(title:String,movies:util.List[String],ratingsForm:play.data.Form[TenRatings]): play.twirl.api.HtmlFormat.Appendable = apply(title,movies,ratingsForm)

  def f:((String,util.List[String],play.data.Form[TenRatings]) => play.twirl.api.HtmlFormat.Appendable) = (title,movies,ratingsForm) => apply(title,movies,ratingsForm)

  def ref: this.type = this

}


}
}

/**/
object rate extends rate_Scope0.rate_Scope1.rate
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 19:43:35 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/rate.scala.html
                  HASH: da15e03abfa319461a37b9f5cdefecb7b42dff65
                  MATRIX: 633->39|826->122|853->140|880->142|899->153|938->155|966->203|998->210|1071->275|1110->277|1146->287|1203->329|1242->331|1283->345|1309->350|1350->360|1395->378|1508->461|1541->504|1573->506
                  LINES: 24->3|29->3|30->5|31->6|31->6|31->6|31->6|33->8|33->8|33->8|34->9|34->9|34->9|35->10|35->10|36->11|38->13|39->14|40->15|41->16
                  -- GENERATED --
              */
          