
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_user_Scope0 {
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

class register_user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[UserRegistration],play.twirl.api.HtmlFormat.Appendable] {

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
object register_user extends register_user_Scope0.register_user
              /*
                  -- GENERATED --
                  DATE: Tue Oct 20 19:59:52 PDT 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/register_user.scala.html
                  HASH: ef5800eff262a7a4ee1af7cd92fa72bbade7b997
                  MATRIX: 784->1|942->49|969->67|996->69|1015->80|1054->82|1082->130|1115->172|1146->178|1218->242|1257->244|1298->259|1384->325|1421->335|1508->401|1544->410|1658->494|1691->497
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|34->4|36->6|37->7|37->7|37->7|39->9|39->9|40->10|40->10|41->11|43->13|45->15
                  -- GENERATED --
              */
          