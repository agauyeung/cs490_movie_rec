
package views.html.account.settings

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object email_Scope0 {
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

class email extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[User,Form[controllers.account.settings.Email.AskForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User, askForm: Form[controllers.account.settings.Email.AskForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.73*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(/*7.6*/Messages("account.settings.email")),format.raw/*7.40*/("""

    """),_display_(/*9.6*/wflash()),format.raw/*9.14*/("""

    """),_display_(/*11.6*/form(controllers.account.settings.routes.Email.runEmail())/*11.64*/ {_display_(Seq[Any](format.raw/*11.66*/("""

        """),format.raw/*13.9*/("""<fieldset>
        """),_display_(/*14.10*/inputText(
            askForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            'class -> "form-control"
        )),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</fieldset>

        <div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(/*23.66*/Messages('validate')),format.raw/*23.86*/("""">
        </div>
    """)))}),format.raw/*25.6*/("""

""")))}))
      }
    }
  }

  def render(user:User,askForm:Form[controllers.account.settings.Email.AskForm]): play.twirl.api.HtmlFormat.Appendable = apply(user,askForm)

  def f:((User,Form[controllers.account.settings.Email.AskForm]) => play.twirl.api.HtmlFormat.Appendable) = (user,askForm) => apply(user,askForm)

  def ref: this.type = this

}


}

/**/
object email extends email_Scope0.email
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 06:30:29 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/account/settings/email.scala.html
                  HASH: 11e209819195ae4f964fdcf0b4fc3fb2ee467b5d
                  MATRIX: 809->1|990->72|1018->91|1045->93|1064->104|1103->106|1135->113|1189->147|1221->154|1249->162|1282->169|1349->227|1389->229|1426->239|1473->259|1657->422|1693->431|1833->544|1874->564|1927->587
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|37->7|39->9|39->9|41->11|41->11|41->11|43->13|44->14|49->19|50->20|53->23|53->23|55->25
                  -- GENERATED --
              */
          