
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object resetedPassword_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class resetedPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""
"""),_display_(/*2.2*/default("Reseted Password")/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""
	"""),format.raw/*3.2*/("""<p>"""),_display_(/*3.6*/Messages("forgot.reseted")),format.raw/*3.32*/("""</p>
	<a href=""""),_display_(/*4.12*/controllers/*4.23*/.routes.Application.index),format.raw/*4.48*/("""">"""),_display_(/*4.51*/Messages("go.index")),format.raw/*4.71*/("""</a>
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
object resetedPassword extends resetedPassword_Scope0.resetedPassword
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/auth/resetedPassword.scala.html
                  HASH: 798faf29b72b5744786a6ef985f2892bbb8fa968
                  MATRIX: 559->1|695->42|722->44|757->71|796->73|824->75|853->79|899->105|941->121|960->132|1005->157|1034->160|1074->180
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4|28->4|28->4|28->4
                  -- GENERATED --
              */
          