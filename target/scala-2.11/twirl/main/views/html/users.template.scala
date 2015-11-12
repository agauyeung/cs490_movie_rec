
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

     object users_Scope1 {
import java.util

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: util.List[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.27*/("""

"""),format.raw/*4.1*/("""<h1>View All Users/<h1>

<ul> 
"""),_display_(/*7.2*/for(users <- users) yield /*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""
  """),format.raw/*8.3*/("""<li>"""),_display_(/*8.8*/users/*8.13*/.username),format.raw/*8.22*/("""
    """),format.raw/*9.5*/("""<ul> 
        """),_display_(/*10.10*/users/*10.15*/.password),format.raw/*10.24*/("""
    """),format.raw/*11.5*/("""</ul>
  </li>
""")))}),format.raw/*13.2*/("""
"""),format.raw/*14.1*/("""</ul>
"""))
      }
    }
  }

  def render(users:util.List[Users]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((util.List[Users]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}
}

/**/
object users extends users_Scope0.users_Scope1.users
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 16:23:58 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/users.scala.html
                  HASH: 519151416dc466de2475d1207dab283788f51a78
                  MATRIX: 582->19|702->44|730->46|787->78|821->97|860->99|889->102|919->107|932->112|961->121|992->126|1034->141|1048->146|1078->155|1110->160|1155->175|1183->176
                  LINES: 23->2|28->2|30->4|33->7|33->7|33->7|34->8|34->8|34->8|34->8|35->9|36->10|36->10|36->10|37->11|39->13|40->14
                  -- GENERATED --
              */
          