
package views.html.account.reset

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object runAsk_Scope0 {
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

     object runAsk_Scope1 {
import helper._

class runAsk extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

implicit def /*2.2*/implicitFieldConstructor/*2.26*/ = {{
    FieldConstructor(twitterBootstrapInput.render)
}};
Seq[Any](format.raw/*4.2*/("""


"""),_display_(/*7.2*/main()/*7.8*/ {_display_(Seq[Any](format.raw/*7.10*/("""

    """),format.raw/*9.5*/("""<h3>"""),_display_(/*9.10*/Messages("resetpassword")),format.raw/*9.35*/("""</h3>

    """),_display_(/*11.6*/wflash()),format.raw/*11.14*/("""

    """),_display_(/*13.6*/Messages("resetpassword.mailsent")),format.raw/*13.40*/("""
    """),format.raw/*14.5*/("""<div class="form-actions">
        <a href=""""),_display_(/*15.19*/routes/*15.25*/.Application.index),format.raw/*15.43*/("""" class="btn btn-default">"""),_display_(/*15.70*/Messages("goback")),format.raw/*15.88*/("""</a>
    </div>

""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object runAsk extends runAsk_Scope0.runAsk_Scope1.runAsk
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 02:26:06 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/account/reset/runAsk.scala.html
                  HASH: e3d9bbb1e21551ceee08c55ecadf2d430bebf287
                  MATRIX: 881->18|913->42|1000->100|1029->104|1042->110|1081->112|1113->118|1144->123|1189->148|1227->160|1256->168|1289->175|1344->209|1376->214|1448->259|1463->265|1502->283|1556->310|1595->328|1643->346
                  LINES: 34->2|34->2|37->4|40->7|40->7|40->7|42->9|42->9|42->9|44->11|44->11|46->13|46->13|47->14|48->15|48->15|48->15|48->15|48->15|51->18
                  -- GENERATED --
              */
          