
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

"""),_display_(/*7.2*/base(title)/*7.13*/ {_display_(Seq[Any](format.raw/*7.15*/("""	"""),format.raw/*7.63*/("""

    """),_display_(/*9.6*/form(action = routes.Recommender.results(), 'id -> "ratingsForm")/*9.71*/ {_display_(Seq[Any](format.raw/*9.73*/("""
        """),_display_(/*10.10*/for((movie, index) <- movies.zipWithIndex) yield /*10.52*/ {_display_(Seq[Any](format.raw/*10.54*/("""
            
        """)))}),format.raw/*12.10*/("""
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
                  DATE: Wed Nov 11 18:43:53 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/rate.scala.html
                  HASH: cf13204ad583d846272c38eb98a87830c40e122f
                  MATRIX: 633->39|826->122|853->140|881->143|900->154|939->156|967->204|999->211|1072->276|1111->278|1148->288|1206->330|1246->332|1300->355|1336->364|1449->447|1482->490|1514->492
                  LINES: 24->3|29->3|30->5|32->7|32->7|32->7|32->7|34->9|34->9|34->9|35->10|35->10|35->10|37->12|38->13|39->14|40->15|41->16
                  -- GENERATED --
              */
          