
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registered_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class registered extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.5*/("""Welcome, """),_display_(/*5.15*/username),format.raw/*5.23*/("""!<br>
    You are now a member of our movie recommendation application. Enjoy!

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
object registered extends registered_Scope0.registered
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/registered.scala.html
                  HASH: 358ac9e1c31eab10acac7d133ea030148825b4a1
                  MATRIX: 544->1|672->34|700->37|719->48|758->50|786->98|818->104|854->114|882->122|992->203
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|29->5|29->5|32->8
                  -- GENERATED --
              */
          