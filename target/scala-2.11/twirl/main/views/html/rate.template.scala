
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rate_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class rate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[String],Form[TenRatings],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, movies: List[String], ratingsForm: Form[TenRatings]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""	"""),format.raw/*4.63*/("""

    """),_display_(/*6.6*/form(action = routes.Application.results(), 'id -> "ratingsForm")/*6.71*/ {_display_(Seq[Any](format.raw/*6.73*/("""
        """),_display_(/*7.10*/for((movie, index) <- movies.zipWithIndex) yield /*7.52*/ {_display_(Seq[Any](format.raw/*7.54*/("""
            """),_display_(/*8.14*/inputRadioGroup(
                ratingsForm("m" + (index+1)),  
                options = Seq("0" -> "0", "1" -> "1", "2" -> "2", "3" -> "3", "4" -> "4", "5" -> "5"),
                '_label -> movie
            )),format.raw/*12.14*/(""" 
        """)))}),format.raw/*13.10*/("""
        """),format.raw/*14.9*/("""<input type="submit" class="tenratings" value="Get Recommendations">         
    """)))}),format.raw/*15.6*/("""
    """),format.raw/*16.43*/("""
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(title:String,movies:List[String],ratingsForm:Form[TenRatings]): play.twirl.api.HtmlFormat.Appendable = apply(title,movies,ratingsForm)

  def f:((String,List[String],Form[TenRatings]) => play.twirl.api.HtmlFormat.Appendable) = (title,movies,ratingsForm) => apply(title,movies,ratingsForm)

  def ref: this.type = this

}


}

/**/
object rate extends rate_Scope0.rate
              /*
                  -- GENERATED --
                  DATE: Mon Oct 19 18:16:54 PDT 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/rate.scala.html
                  HASH: 8ce9df734f00688fa9c5a80c4acf2055fb425c85
                  MATRIX: 773->1|951->69|978->87|1005->89|1024->100|1063->102|1091->150|1123->157|1196->222|1235->224|1271->234|1328->276|1367->278|1407->292|1642->506|1684->517|1720->526|1833->609|1866->652|1898->654
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|36->6|36->6|37->7|37->7|37->7|38->8|42->12|43->13|44->14|45->15|46->16|47->17
                  -- GENERATED --
              */
          