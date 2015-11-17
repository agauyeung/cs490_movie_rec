
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object authenticated_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class authenticated extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.5*/("""Welcome, """),_display_(/*5.15*/username),format.raw/*5.23*/("""!<br>
    You are logged in!

""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(title:String,username:String): play.twirl.api.HtmlFormat.Appendable = apply(title,username)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (title,username) => apply(title,username)

  def ref: this.type = this

}


}

/**/
object authenticated extends authenticated_Scope0.authenticated
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:10 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/authenticated.scala.html
                  HASH: 228a747db3b758a9565387ccc078c0c667e7a96a
                  MATRIX: 550->1|678->34|706->37|725->48|764->50|792->98|824->104|860->114|888->122|948->153
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|29->5|29->5|32->8
                  -- GENERATED --
              */
          