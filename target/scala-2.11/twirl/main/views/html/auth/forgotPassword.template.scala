
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object forgotPassword_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class forgotPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[String],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emailForm: Form[String])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*1.80*/("""
"""),_display_(/*3.2*/default("Forgot Password")/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
	"""),_display_(/*4.3*/tags/*4.7*/.alertFromRequest(request, "error")),format.raw/*4.42*/("""
	"""),_display_(/*5.3*/b3/*5.5*/.form(controllers.routes.Auth.handleForgotPassword)/*5.56*/ {_display_(Seq[Any](format.raw/*5.58*/("""
		"""),format.raw/*6.3*/("""<fieldset>
			<legend>"""),_display_(/*7.13*/Messages("forgot.title")),format.raw/*7.37*/("""</legend>
			"""),_display_(/*8.5*/b3/*8.7*/.text( emailForm("email"), '_hiddenLabel -> Messages("field.email"), 'placeholder -> "your@email.com", 'autofocus -> true )),format.raw/*8.130*/("""
			"""),_display_(/*9.5*/b3/*9.7*/.submit('class -> "btn btn-primary btn-block")/*9.53*/{_display_(Seq[Any](format.raw/*9.54*/(""" """),_display_(/*9.56*/Messages("submit")),format.raw/*9.74*/(""" """)))}),format.raw/*9.76*/("""
		"""),format.raw/*10.3*/("""</fieldset>
	""")))}),format.raw/*11.3*/("""
	"""),_display_(/*12.3*/views/*12.8*/.html.tags.signInHelper()),format.raw/*12.33*/("""
""")))}))
      }
    }
  }

  def render(emailForm:Form[String],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(emailForm)(request,messages)

  def f:((Form[String]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (emailForm) => (request,messages) => apply(emailForm)(request,messages)

  def ref: this.type = this

}


}

/**/
object forgotPassword extends forgotPassword_Scope0.forgotPassword
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/auth/forgotPassword.scala.html
                  HASH: a040d4a6a14ef9c81811f646a6ff5f0ecf6823e3
                  MATRIX: 579->1|787->79|814->118|848->144|887->146|915->149|926->153|981->188|1009->191|1018->193|1077->244|1116->246|1145->249|1194->272|1238->296|1277->310|1286->312|1430->435|1460->440|1469->442|1523->488|1561->489|1589->491|1627->509|1659->511|1689->514|1733->528|1762->531|1775->536|1821->561
                  LINES: 20->1|25->1|26->3|26->3|26->3|27->4|27->4|27->4|28->5|28->5|28->5|28->5|29->6|30->7|30->7|31->8|31->8|31->8|32->9|32->9|32->9|32->9|32->9|32->9|32->9|33->10|34->11|35->12|35->12|35->12
                  -- GENERATED --
              */
          