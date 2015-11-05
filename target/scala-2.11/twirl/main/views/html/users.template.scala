
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object users_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class users extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Users],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[Users]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*3.1*/("""<h1>View All Users/<h1>

<ul> 
"""),_display_(/*6.2*/for(users <- users) yield /*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
  """),format.raw/*7.3*/("""<li>"""),_display_(/*7.8*/users/*7.13*/.username),format.raw/*7.22*/("""
    """),format.raw/*8.5*/("""<ul> 
        """),_display_(/*9.10*/users/*9.15*/.password),format.raw/*9.24*/("""
    """),format.raw/*10.5*/("""</ul>
  </li>
""")))}),format.raw/*12.2*/("""
"""),format.raw/*13.1*/("""</ul>
"""))
      }
    }
  }

  def render(users:List[Users]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[Users]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/**/
object users extends users_Scope0.users
              /*
                  -- GENERATED --
                  DATE: Wed Nov 04 17:41:45 PST 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/app/views/users.scala.html
                  HASH: d25f778f7a9f06c4f470116baeb7e1a26e70a70f
                  MATRIX: 750->1|865->21|893->23|950->55|984->74|1023->76|1052->79|1082->84|1095->89|1124->98|1155->103|1196->118|1209->123|1238->132|1270->137|1315->152|1343->153
                  LINES: 27->1|32->1|34->3|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|43->12|44->13
                  -- GENERATED --
              */
          