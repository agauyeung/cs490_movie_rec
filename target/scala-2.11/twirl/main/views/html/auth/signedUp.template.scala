
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signedUp_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signedUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User)(implicit request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.67*/("""
"""),_display_(/*2.2*/default("Signed Up", loggedUser = Some(user))/*2.47*/ {_display_(Seq[Any](format.raw/*2.49*/("""
	"""),format.raw/*3.2*/("""<p>"""),_display_(/*3.6*/Messages("signup.thanks", user.fullName)),format.raw/*3.46*/("""</p>
	<p>"""),_display_(/*4.6*/Messages("signup.ready")),format.raw/*4.30*/("""</p>
	<a href=""""),_display_(/*5.12*/controllers/*5.23*/.routes.Application.index),format.raw/*5.48*/("""">"""),_display_(/*5.51*/Messages("go.index")),format.raw/*5.71*/("""</a>
""")))}))
      }
    }
  }

  def render(user:User,request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user)(request,messages)

  def f:((User) => (RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request,messages) => apply(user)(request,messages)

  def ref: this.type = this

}


}

/**/
object signedUp extends signedUp_Scope0.signedUp
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/auth/signedUp.scala.html
                  HASH: de1a4b334428a475b3755cb293b54a1210e4d1cb
                  MATRIX: 559->1|719->66|746->68|799->113|838->115|866->117|895->121|955->161|990->171|1034->195|1076->211|1095->222|1140->247|1169->250|1209->270
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4|29->5|29->5|29->5|29->5|29->5
                  -- GENERATED --
              */
          