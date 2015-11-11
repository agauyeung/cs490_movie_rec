
package views.html.account.reset

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ask_Scope0 {
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

class ask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[controllers.account.Reset.AskForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(askForm: Form[controllers.account.Reset.AskForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.52*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""


"""),_display_(/*9.2*/main()/*9.8*/ {_display_(Seq[Any](format.raw/*9.10*/("""

    """),format.raw/*11.5*/("""<div class="col col-lg-8">
        <h3>"""),_display_(/*12.14*/Messages("resetpassword")),format.raw/*12.39*/("""</h3>

        """),_display_(/*14.10*/wflash()),format.raw/*14.18*/("""

        """),_display_(/*16.10*/form(controllers.account.routes.Reset.runAsk())/*16.57*/ {_display_(Seq[Any](format.raw/*16.59*/("""

            """),format.raw/*18.13*/("""<div class="form-group">
            """),_display_(/*19.14*/inputText(
                askForm("email"),
                'placeholder -> Messages("email"),
                '_label -> null,
                'class -> "form-control"
            )),format.raw/*24.14*/("""
            """),format.raw/*25.13*/("""</div>

            <hr>
            <input type="submit" class="btn btn-primary" value=""""),_display_(/*28.66*/Messages("reset")),format.raw/*28.83*/("""">

            <a href=""""),_display_(/*30.23*/routes/*30.29*/.Application.index),format.raw/*30.47*/("""" class="btn btn-default">"""),_display_(/*30.74*/Messages("goback")),format.raw/*30.92*/("""</a>

        """)))}),format.raw/*32.10*/("""

    """),format.raw/*34.5*/("""</div>


""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(askForm:Form[controllers.account.Reset.AskForm]): play.twirl.api.HtmlFormat.Appendable = apply(askForm)

  def f:((Form[controllers.account.Reset.AskForm]) => play.twirl.api.HtmlFormat.Appendable) = (askForm) => apply(askForm)

  def ref: this.type = this

}


}

/**/
object ask extends ask_Scope0.ask
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 16:38:13 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/account/reset/ask.scala.html
                  HASH: 1f969c3ae44f3a7a12f5975387636758ee838af6
                  MATRIX: 788->1|940->75|972->99|1068->51|1096->70|1126->165|1155->169|1168->175|1207->177|1240->183|1307->223|1353->248|1396->264|1425->272|1463->283|1519->330|1559->332|1601->346|1666->384|1870->567|1911->580|2028->670|2066->687|2119->713|2134->719|2173->737|2227->764|2266->782|2312->797|2345->803|2385->813
                  LINES: 27->1|31->4|31->4|34->1|36->4|36->6|39->9|39->9|39->9|41->11|42->12|42->12|44->14|44->14|46->16|46->16|46->16|48->18|49->19|54->24|55->25|58->28|58->28|60->30|60->30|60->30|60->30|60->30|62->32|64->34|67->37
                  -- GENERATED --
              */
          