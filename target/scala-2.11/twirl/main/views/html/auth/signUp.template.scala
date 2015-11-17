
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signUp_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[User],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signUpForm: Form[User])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor
import controllers.routes

Seq[Any](format.raw/*1.79*/("""
"""),_display_(/*4.2*/default("Sign Up")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
	"""),_display_(/*5.3*/tags/*5.7*/.alertFromRequest(request, "error")),format.raw/*5.42*/("""
	"""),_display_(/*6.3*/b3/*6.5*/.form(routes.Auth.handleStartSignUp)/*6.41*/ {_display_(Seq[Any](format.raw/*6.43*/("""
		"""),format.raw/*7.3*/("""<fieldset>
			<legend>"""),_display_(/*8.13*/Messages("signup.title")),format.raw/*8.37*/("""</legend>
			"""),_display_(/*9.5*/b3/*9.7*/.text(signUpForm("firstName"), '_label -> Messages("field.firstname"), 'placeholder -> "John", 'autofocus -> true )),format.raw/*9.122*/("""
			"""),_display_(/*10.5*/b3/*10.7*/.text(signUpForm("lastName"), '_label -> Messages("field.lastname"), 'placeholder -> "Doe" )),format.raw/*10.99*/("""
			"""),_display_(/*11.5*/b3/*11.7*/.text(signUpForm("nick"), '_label -> Messages("field.nick"), 'placeholder -> "Johny" )),format.raw/*11.93*/("""
			"""),_display_(/*12.5*/b3/*12.7*/.text(signUpForm("email"), '_label -> Messages("field.email"), 'placeholder -> "your@email.com" )),format.raw/*12.104*/("""
			"""),_display_(/*13.5*/b3/*13.7*/.password(signUpForm("password"), '_label -> Messages("field.password"), 'placeholder -> Messages("field.password") )),format.raw/*13.124*/("""
			"""),_display_(/*14.5*/b3/*14.7*/.select(signUpForm("services"), options = User.services.map(s => (s, s)), '_label -> "Select the services you have an account", 'multiple -> true )),format.raw/*14.154*/("""
			"""),_display_(/*15.5*/b3/*15.7*/.submit('class -> "btn btn-primary btn-block")/*15.53*/{_display_(Seq[Any](format.raw/*15.54*/(""" """),_display_(/*15.56*/Messages("signup")),format.raw/*15.74*/(""" """)))}),format.raw/*15.76*/("""
			"""),format.raw/*16.4*/("""<div class="post-form-opts">
				<p>"""),_display_(/*17.9*/Messages("signup.signin.question")),format.raw/*17.43*/(""" """),format.raw/*17.44*/("""<a href=""""),_display_(/*17.54*/routes/*17.60*/.Auth.signIn),format.raw/*17.72*/("""">"""),_display_(/*17.75*/Messages("signup.signin")),format.raw/*17.100*/("""</a></p>
			</div>
		</fieldset>
	""")))}),format.raw/*20.3*/("""
""")))}))
      }
    }
  }

  def render(signUpForm:Form[User],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request,messages)

  def f:((Form[User]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request,messages) => apply(signUpForm)(request,messages)

  def ref: this.type = this

}


}

/**/
object signUp extends signUp_Scope0.signUp
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/auth/signUp.scala.html
                  HASH: 67901034421470186388d1b461a120294fba2cc0
                  MATRIX: 561->1|794->78|821->144|847->162|886->164|914->167|925->171|980->206|1008->209|1017->211|1061->247|1100->249|1129->252|1178->275|1222->299|1261->313|1270->315|1406->430|1437->435|1447->437|1560->529|1591->534|1601->536|1708->622|1739->627|1749->629|1868->726|1899->731|1909->733|2048->850|2079->855|2089->857|2258->1004|2289->1009|2299->1011|2354->1057|2393->1058|2422->1060|2461->1078|2494->1080|2525->1084|2588->1121|2643->1155|2672->1156|2709->1166|2724->1172|2757->1184|2787->1187|2834->1212|2899->1247
                  LINES: 20->1|26->1|27->4|27->4|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|30->7|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|38->15|38->15|38->15|38->15|39->16|40->17|40->17|40->17|40->17|40->17|40->17|40->17|40->17|43->20
                  -- GENERATED --
              */
          