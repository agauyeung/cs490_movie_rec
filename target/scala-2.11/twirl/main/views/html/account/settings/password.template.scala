
package views.html.account.settings

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object password_Scope0 {
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

class password extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/index(user)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),_display_(/*7.6*/Messages("account.settings.password")),format.raw/*7.43*/("""

    """),_display_(/*9.6*/wflash()),format.raw/*9.14*/("""

    """),_display_(/*11.6*/form(controllers.account.settings.routes.Password.runPassword())/*11.70*/ {_display_(Seq[Any](format.raw/*11.72*/("""
        """),format.raw/*12.9*/("""<div class="form-actions">
            <input type="submit" class="btn btn-primary" value=""""),_display_(/*13.66*/Messages("reset")),format.raw/*13.83*/("""">
        </div>
    """)))}),format.raw/*15.6*/("""

""")))}))
      }
    }
  }

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object password extends password_Scope0.password
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 02:26:06 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/account/settings/password.scala.html
                  HASH: 222a9f9bc78c7f67bfebf3159debec44c0193cad
                  MATRIX: 766->1|888->13|916->32|943->34|962->45|1001->47|1033->54|1090->91|1122->98|1150->106|1183->113|1256->177|1296->179|1332->188|1451->280|1489->297|1542->320
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|37->7|39->9|39->9|41->11|41->11|41->11|42->12|43->13|43->13|45->15
                  -- GENERATED --
              */
          