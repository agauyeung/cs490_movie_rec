
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object almostSignedUp_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class almostSignedUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""
"""),_display_(/*2.2*/default("Almost Signed Up")/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
	"""),format.raw/*3.2*/("""<p>"""),_display_(/*3.6*/Messages("signup.thanks", user.fullName)),format.raw/*3.46*/("""</p>
	<p>"""),_display_(/*4.6*/Messages("signup.sent", user.email)),format.raw/*4.41*/("""</p>
""")))}))
      }
    }
  }

  def render(user:User,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user)(messages)

  def f:((User) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user) => (messages) => apply(user)(messages)

  def ref: this.type = this

}


}

/**/
object almostSignedUp extends almostSignedUp_Scope0.almostSignedUp
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/auth/almostSignedUp.scala.html
                  HASH: ccd1b4357365eabbede6c3ba8d0065ce235d8014
                  MATRIX: 557->1|693->42|720->44|755->71|794->73|822->75|851->79|911->119|946->129|1001->164
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4
                  -- GENERATED --
              */
          