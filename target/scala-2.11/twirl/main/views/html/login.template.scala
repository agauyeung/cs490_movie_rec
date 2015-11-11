
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.80*/("""

"""),format.raw/*6.1*/("""<h3>"""),_display_(/*6.6*/Messages("signin.signin")),format.raw/*6.31*/("""</h3>

"""),_display_(/*8.2*/form(routes.Application.authenticate(), 'class -> "form")/*8.59*/ {_display_(Seq[Any](format.raw/*8.61*/("""

    """),_display_(/*10.6*/if(loginForm.hasGlobalErrors)/*10.35*/ {_display_(Seq[Any](format.raw/*10.37*/("""
        """),format.raw/*11.9*/("""<p class="error">
            <span class="label label-danger">"""),_display_(/*12.47*/loginForm/*12.56*/.globalError.message),format.raw/*12.76*/("""</span>
        </p>
    """)))}),format.raw/*14.6*/("""

    """),format.raw/*16.5*/("""<fieldset>
        """),_display_(/*17.10*/inputText(
            loginForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            '_help -> Messages("signin.your.email"),
            'class -> "form-control"
        )),format.raw/*23.10*/("""
        """),_display_(/*24.10*/inputPassword(
            loginForm("password"),
            '_label -> null,
            'placeholder -> Messages("password"),
            '_help -> Messages("signin.your.password"),
            'class -> "form-control"
        )),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</fieldset>

    <div class="form-actions">
        <input type="submit" class="btn btn-primary" value=""""),_display_(/*34.62*/Messages("signin.signin")),format.raw/*34.87*/("""">
        <small><a href=""""),_display_(/*35.26*/controllers/*35.37*/.account.routes.Reset.ask),format.raw/*35.62*/("""">"""),_display_(/*35.65*/Messages("forgot.password")),format.raw/*35.92*/("""</a></small>
    </div>
""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 02:26:06 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/login.scala.html
                  HASH: a2cd821b021fe139df992cf54bc807a7a94689fe
                  MATRIX: 762->1|900->57|932->81|1016->37|1045->135|1073->137|1103->142|1148->167|1181->175|1246->232|1285->234|1318->241|1356->270|1396->272|1432->281|1523->345|1541->354|1582->374|1638->400|1671->406|1718->426|1957->644|1994->654|2246->885|2278->890|2410->995|2456->1020|2511->1048|2531->1059|2577->1084|2607->1087|2655->1114|2710->1139
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|36->6|36->6|38->8|38->8|38->8|40->10|40->10|40->10|41->11|42->12|42->12|42->12|44->14|46->16|47->17|53->23|54->24|60->30|61->31|64->34|64->34|65->35|65->35|65->35|65->35|65->35|67->37
                  -- GENERATED --
              */
          