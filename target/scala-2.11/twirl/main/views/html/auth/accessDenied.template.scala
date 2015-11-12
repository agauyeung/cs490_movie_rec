
package views.html.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object accessDenied_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class accessDenied extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Option[User],RequestHeader,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit loggedUser: Option[User], request: RequestHeader, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.83*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.templates.default("Access Denied", loggedUser)/*2.59*/ {_display_(Seq[Any](format.raw/*2.61*/("""
	"""),_display_(/*3.3*/tags/*3.7*/.alertFromRequest(request, "error")),format.raw/*3.42*/("""
	"""),format.raw/*4.2*/("""<h1 class="text-primary">"""),_display_(/*4.28*/Messages("denied.title")),format.raw/*4.52*/("""</h1>
	<h3 class="text-danger">"""),_display_(/*5.27*/Messages("denied.text")),format.raw/*5.50*/("""</h3>
""")))}))
      }
    }
  }

  def render(loggedUser:Option[User],request:RequestHeader,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply()(loggedUser,request,messages)

  def f:(() => (Option[User],RequestHeader,Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (loggedUser,request,messages) => apply()(loggedUser,request,messages)

  def ref: this.type = this

}


}

/**/
object accessDenied extends accessDenied_Scope0.accessDenied
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/auth/accessDenied.scala.html
                  HASH: 6e01c634690e70ea10feb30ce9538d5ae0b22de5
                  MATRIX: 575->1|751->82|778->84|790->89|850->141|889->143|917->146|928->150|983->185|1011->187|1063->213|1107->237|1165->269|1208->292
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|29->5
                  -- GENERATED --
              */
          