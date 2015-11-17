
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

class rate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,util.List[String],Form[TenRatings],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, movies: util.List[String], ratingsForm: Form[TenRatings])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*3.104*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/base(title)/*6.13*/ {_display_(Seq[Any](format.raw/*6.15*/("""	"""),format.raw/*6.63*/("""

    """),format.raw/*8.5*/("""<h2>View Movies to Rate/<h2>

    """),_display_(/*10.6*/form(action = routes.Recommender.results(), 'id -> "ratingsForm")/*10.71*/ {_display_(Seq[Any](format.raw/*10.73*/("""
        """),_display_(/*11.10*/for((movie, index) <- movies.zipWithIndex) yield /*11.52*/ {_display_(Seq[Any](format.raw/*11.54*/("""
            """),_display_(/*12.14*/inputRadioGroup(
                ratingsForm("m" + (index+1)),  
                options = Seq("0" -> "0", "1" -> "1", "2" -> "2", "3" -> "3", "4" -> "4", "5" -> "5"),
                '_label -> movie
            )),format.raw/*16.14*/(""" 
        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""<input type="submit" class="tenratings" value="Get Recommendations">
    """)))}),format.raw/*19.6*/("""
    """),format.raw/*20.43*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(title:String,movies:util.List[String],ratingsForm:Form[TenRatings],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,movies,ratingsForm)(messages)

  def f:((String,util.List[String],Form[TenRatings]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,movies,ratingsForm) => (messages) => apply(title,movies,ratingsForm)(messages)

  def ref: this.type = this

}


}
}

/**/
object rate extends rate_Scope0.rate_Scope1.rate
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 19:02:55 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/rate.scala.html
                  HASH: afa8310d9eec00b9a3d44eaa4e65b1cd0bed232b
                  MATRIX: 632->39|845->141|872->159|899->161|918->172|957->174|985->222|1017->228|1078->263|1152->328|1192->330|1229->340|1287->382|1327->384|1368->398|1603->612|1645->623|1681->632|1785->706|1818->749|1850->751
                  LINES: 24->3|29->3|30->5|31->6|31->6|31->6|31->6|33->8|35->10|35->10|35->10|36->11|36->11|36->11|37->12|41->16|42->17|43->18|44->19|45->20|46->21
                  -- GENERATED --
              */
          