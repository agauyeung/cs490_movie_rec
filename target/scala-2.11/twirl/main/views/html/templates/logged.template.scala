
package views.html.templates

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logged_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class logged extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,String,Html,Html,Html,Html,User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, tab: String = "", styles: Html = Html(""), scripts: Html = Html(""), modals: Html = Html(""))(content: Html)(implicit loggedUser: User, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.173*/("""
"""),_display_(/*2.2*/default(title, loggedUser = Some(loggedUser), withMainTabs = true, tab, styles, scripts, modals)/*2.98*/(content)/*2.107*/(messages)))
      }
    }
  }

  def render(title:String,tab:String,styles:Html,scripts:Html,modals:Html,content:Html,loggedUser:User,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,tab,styles,scripts,modals)(content)(loggedUser,messages)

  def f:((String,String,Html,Html,Html) => (Html) => (User,Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,tab,styles,scripts,modals) => (content) => (loggedUser,messages) => apply(title,tab,styles,scripts,modals)(content)(loggedUser,messages)

  def ref: this.type = this

}


}

/**/
object logged extends logged_Scope0.logged
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/templates/logged.scala.html
                  HASH: 0bc99804192c1fa35ea3995c3141b18dd423d9c4
                  MATRIX: 580->1|847->172|874->174|978->270|996->279
                  LINES: 20->1|25->1|26->2|26->2|26->2
                  -- GENERATED --
              */
          