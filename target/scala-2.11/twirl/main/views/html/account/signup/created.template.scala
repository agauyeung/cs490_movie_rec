
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object created_Scope0 {
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

class created extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

    """),format.raw/*3.5*/("""<h3>"""),_display_(/*3.10*/Messages("signup.successfull")),format.raw/*3.40*/("""</h3>
    """),_display_(/*4.6*/Messages("signup.msg.created")),format.raw/*4.36*/("""

    """),format.raw/*6.5*/("""<div class="form-actions">
        <a href=""""),_display_(/*7.19*/routes/*7.25*/.Application.index),format.raw/*7.43*/("""" class="btn btn-default">"""),_display_(/*7.70*/Messages("goback")),format.raw/*7.88*/("""</a>
    </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object created extends created_Scope0.created
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 02:26:06 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/account/signup/created.scala.html
                  HASH: a04822f48d59af6debc05bcef8bba08b8e891861
                  MATRIX: 846->1|859->7|898->9|930->15|961->20|1011->50|1047->61|1097->91|1129->97|1200->142|1214->148|1252->166|1305->193|1343->211
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|35->4|35->4|37->6|38->7|38->7|38->7|38->7|38->7
                  -- GENERATED --
              */
          