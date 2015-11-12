
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signIn_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signIn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[scala.Tuple3[String, String, Boolean]],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signInForm: Form[(String, String, Boolean)])(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor
import controllers.routes

Seq[Any](format.raw/*1.100*/("""
"""),_display_(/*4.2*/default("Sign In")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
	"""),_display_(/*5.3*/tags/*5.7*/.alertFromRequest(request, "error")),format.raw/*5.42*/("""
	"""),_display_(/*6.3*/b3/*6.5*/.form(routes.Auth.authenticate)/*6.36*/ {_display_(Seq[Any](format.raw/*6.38*/("""
		"""),format.raw/*7.3*/("""<fieldset>
			<legend>"""),_display_(/*8.13*/Messages("signin.title")),format.raw/*8.37*/("""</legend>
			"""),_display_(/*9.5*/b3/*9.7*/.text( signInForm("identifier"), '_hiddenLabel -> Messages("field.email"), 'placeholder -> "your@email.com", 'autofocus -> true )),format.raw/*9.136*/("""
			"""),_display_(/*10.5*/b3/*10.7*/.password( signInForm("password"), '_hiddenLabel -> Messages("field.password"), 'placeholder -> Messages("field.password") )),format.raw/*10.131*/("""
			"""),_display_(/*11.5*/b3/*11.7*/.checkbox( signInForm("rememberMe"), '_text -> Messages("signin.rememberme"), 'checked -> true )),format.raw/*11.103*/("""
			"""),_display_(/*12.5*/b3/*12.7*/.submit('class -> "btn btn-primary btn-block")/*12.53*/{_display_(Seq[Any](format.raw/*12.54*/(""" """),_display_(/*12.56*/Messages("signin")),format.raw/*12.74*/(""" """)))}),format.raw/*12.76*/("""
			"""),format.raw/*13.4*/("""<div class="post-form-opts">
				<p>"""),_display_(/*14.9*/Messages("signin.forgot.question")),format.raw/*14.43*/(""" """),format.raw/*14.44*/("""<a href=""""),_display_(/*14.54*/routes/*14.60*/.Auth.forgotPassword),format.raw/*14.80*/("""">"""),_display_(/*14.83*/Messages("signin.forgot")),format.raw/*14.108*/("""</a></p>
			</div>
		</fieldset>
	""")))}),format.raw/*17.3*/("""
	"""),_display_(/*18.3*/views/*18.8*/.html.tags.signInHelper()),format.raw/*18.33*/("""
""")))}))
      }
    }
  }

  def render(signInForm:Form[scala.Tuple3[String, String, Boolean]],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(signInForm)(request,messages)

  def f:((Form[scala.Tuple3[String, String, Boolean]]) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (signInForm) => (request,messages) => apply(signInForm)(request,messages)

  def ref: this.type = this

}


}

/**/
object signIn extends signIn_Scope0.signIn
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/auth/signIn.scala.html
                  HASH: 3b1ef3614ed2042cdae5998e52a9b8fe88394b08
                  MATRIX: 594->1|849->99|876->165|902->183|941->185|969->188|980->192|1035->227|1063->230|1072->232|1111->263|1150->265|1179->268|1228->291|1272->315|1311->329|1320->331|1470->460|1501->465|1511->467|1657->591|1688->596|1698->598|1816->694|1847->699|1857->701|1912->747|1951->748|1980->750|2019->768|2052->770|2083->774|2146->811|2201->845|2230->846|2267->856|2282->862|2323->882|2353->885|2400->910|2465->945|2494->948|2507->953|2553->978
                  LINES: 20->1|26->1|27->4|27->4|27->4|28->5|28->5|28->5|29->6|29->6|29->6|29->6|30->7|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|35->12|35->12|35->12|35->12|36->13|37->14|37->14|37->14|37->14|37->14|37->14|37->14|37->14|40->17|41->18|41->18|41->18
                  -- GENERATED --
              */
          