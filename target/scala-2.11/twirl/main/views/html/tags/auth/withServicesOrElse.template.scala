
package views.html.tags.auth

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object withServicesOrElse_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class withServicesOrElse extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Array[String],Html,Html,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(allOf: String*)(body: Html)(orElseBody: Html)(implicit loggedUser: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""
"""),_display_(/*2.2*/if(utils.silhouette.WithServices.isAuthorized(loggedUser, allOf:_*))/*2.70*/ {_display_(Seq[Any](format.raw/*2.72*/("""
	"""),_display_(/*3.3*/body),format.raw/*3.7*/("""
""")))}/*4.3*/else/*4.8*/{_display_(Seq[Any](format.raw/*4.9*/("""
	"""),_display_(/*5.3*/orElseBody),format.raw/*5.13*/("""
""")))}))
      }
    }
  }

  def render(allOf:Array[String],body:Html,orElseBody:Html,loggedUser:User): play.twirl.api.HtmlFormat.Appendable = apply(allOf:_*)(body)(orElseBody)(loggedUser)

  def f:((Array[String]) => (Html) => (Html) => (User) => play.twirl.api.HtmlFormat.Appendable) = (allOf) => (body) => (orElseBody) => (loggedUser) => apply(allOf:_*)(body)(orElseBody)(loggedUser)

  def ref: this.type = this

}


}

/**/
object withServicesOrElse extends withServicesOrElse_Scope0.withServicesOrElse
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/tags/auth/withServicesOrElse.scala.html
                  HASH: 6319e7591c93c57a9fea879332ecd1fb047319c2
                  MATRIX: 585->1|753->74|780->76|856->144|895->146|923->149|946->153|965->156|976->161|1013->162|1041->165|1071->175
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|27->3|28->4|28->4|28->4|29->5|29->5
                  -- GENERATED --
              */
          