
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object forgotPasswordSent_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class forgotPasswordSent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(email: String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""
"""),_display_(/*2.2*/default("Reset Password")/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""
	"""),format.raw/*3.2*/("""<p>"""),_display_(/*3.6*/Messages("forgot.sent", email)),format.raw/*3.36*/("""</p>
""")))}))
      }
    }
  }

  def render(email:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(email)(messages)

  def f:((String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (email) => (messages) => apply(email)(messages)

  def ref: this.type = this

}


}

/**/
object forgotPasswordSent extends forgotPasswordSent_Scope0.forgotPasswordSent
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/auth/forgotPasswordSent.scala.html
                  HASH: 6d421a013d79358aeed6bd9cd5f814e1914ed978
                  MATRIX: 567->1|706->45|733->47|766->72|805->74|833->76|862->80|912->110
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3|27->3
                  -- GENERATED --
              */
          