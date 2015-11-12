
package views.html.tags.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object withService_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class withService extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Array[String],Html,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(anyOf: String*)(body: Html)(implicit loggedUser: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""
"""),_display_(/*2.2*/if(utils.silhouette.WithService.isAuthorized(loggedUser, anyOf:_*))/*2.69*/ {_display_(Seq[Any](format.raw/*2.71*/("""
	"""),_display_(/*3.3*/body),format.raw/*3.7*/("""
""")))}))
      }
    }
  }

  def render(anyOf:Array[String],body:Html,loggedUser:User): play.twirl.api.HtmlFormat.Appendable = apply(anyOf:_*)(body)(loggedUser)

  def f:((Array[String]) => (Html) => (User) => play.twirl.api.HtmlFormat.Appendable) = (anyOf) => (body) => (loggedUser) => apply(anyOf:_*)(body)(loggedUser)

  def ref: this.type = this

}


}

/**/
object withService extends withService_Scope0.withService
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/tags/auth/withService.scala.html
                  HASH: f7a604a56a147eb5e6c2a0b8eadc92f4997b426a
                  MATRIX: 566->1|716->56|743->58|818->125|857->127|885->130|908->134
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3
                  -- GENERATED --
              */
          