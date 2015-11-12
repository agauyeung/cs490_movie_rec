
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
    """),format.raw/*2.5*/("""<div>
        Current Page:&#09;<i>"""),_display_(/*3.31*/title),format.raw/*3.36*/("""</i>
        <hr>
        Menu:&#09;&#09;
        <a href="recommended">Recommended For You</a>
        &#09;&#09;|&#09;&#09;
        <a href="history">Rating History</a>
        &#09;&#09;|&#09;&#09;
        <a href="register_user">User Registration</a>
        &#09;&#09;|&#09;&#09;
        <a href="rate">Rate 10 Movies</a>
        &#09;&#09;|&#09;&#09;
        <a href="view">View Movies</a>
        &#09;&#09;|&#09;&#09;
        <a href="users">View Users</a>
        <hr>
        
        """),_display_(/*19.10*/content),format.raw/*19.17*/("""
        
    """),format.raw/*21.5*/("""</div>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 17:56:32 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/base.scala.html
                  HASH: b0088873cb26d3fb2dbe4ac04472845a8313add7
                  MATRIX: 530->1|655->31|686->36|748->72|773->77|1296->573|1324->580|1365->594
                  LINES: 20->1|25->1|26->2|27->3|27->3|43->19|43->19|45->21
                  -- GENERATED --
              */
          