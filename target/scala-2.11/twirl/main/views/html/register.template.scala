
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[UserRegistration],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, regForm: Form[UserRegistration]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/base(title)/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""	"""),format.raw/*4.63*/("""

    """),format.raw/*6.41*/("""
    """),_display_(/*7.6*/form(action = routes.Application.registered(), 'id -> "regForm")/*7.70*/ {_display_(Seq[Any](format.raw/*7.72*/("""
    
        """),_display_(/*9.10*/inputText(field = regForm("username"), 'placeholder -> "username")),format.raw/*9.76*/("""
        """),_display_(/*10.10*/inputText(field = regForm("password"), 'placeholder -> "password")),format.raw/*10.76*/("""
        """),format.raw/*11.9*/("""<input type="submit" class="tenratings" value="Get Recommendations">         

    """)))}),format.raw/*13.6*/("""

""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(title:String,regForm:Form[UserRegistration]): play.twirl.api.HtmlFormat.Appendable = apply(title,regForm)

  def f:((String,Form[UserRegistration]) => play.twirl.api.HtmlFormat.Appendable) = (title,regForm) => apply(title,regForm)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Mon Oct 19 18:16:54 PDT 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/register.scala.html
                  HASH: ef5800eff262a7a4ee1af7cd92fa72bbade7b997
                  MATRIX: 774->1|932->49|959->67|986->69|1005->80|1044->82|1072->130|1105->172|1136->178|1208->242|1247->244|1288->259|1374->325|1411->335|1498->401|1534->410|1648->494|1681->497
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|39->9|40->10|40->10|41->11|43->13|45->15
                  -- GENERATED --
              */
          