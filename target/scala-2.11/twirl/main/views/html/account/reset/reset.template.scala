
package views.html.account.reset

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reset_Scope0 {
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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[controllers.account.Reset.ResetForm],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.account.Reset.ResetForm], token: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
def /*8.6*/scripts/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
        """),format.raw/*9.9*/("""<script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/password.js")),format.raw/*9.66*/("""" type="text/javascript"></script>
    """)))};implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""

    """),format.raw/*10.6*/("""

"""),_display_(/*12.2*/main(null, scripts)/*12.21*/ {_display_(Seq[Any](format.raw/*12.23*/("""

    """),format.raw/*14.5*/("""<h3>"""),_display_(/*14.10*/Messages("signup.reset.password")),format.raw/*14.43*/("""</h3>

    """),_display_(/*16.6*/wflash()),format.raw/*16.14*/("""

    """),format.raw/*18.5*/("""<div class="col col-lg-8">
        """),_display_(/*19.10*/Messages("resetpassword.new.password")),format.raw/*19.48*/("""

        """),_display_(/*21.10*/form(controllers.account.routes.Reset.runReset(token))/*21.64*/ {_display_(Seq[Any](format.raw/*21.66*/("""

            """),format.raw/*23.13*/("""<div class="form-group">
                """),_display_(/*24.18*/inputPassword(
                    resetForm("inputPassword"),
                    'placeholder -> Messages("password"),
                    '_label -> null,
                    'class -> "form-control"
                )),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""<h6>"""),_display_(/*30.22*/Messages("signup.generate.password")),format.raw/*30.58*/("""</h6>
                <input type="text" name="passwordGenerated" class="form-control">

            </div>

            <hr>

            <input type="submit" class="btn btn-primary" value=""""),_display_(/*37.66*/Messages("validate")),format.raw/*37.86*/("""">
            <a href=""""),_display_(/*38.23*/routes/*38.29*/.Application.index),format.raw/*38.47*/("""" class="btn btn-default">"""),_display_(/*38.74*/Messages("goback")),format.raw/*38.92*/("""</a>

        """)))}),format.raw/*40.10*/("""
    """),format.raw/*41.5*/("""</div>

""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(resetForm:Form[controllers.account.Reset.ResetForm],token:String): play.twirl.api.HtmlFormat.Appendable = apply(resetForm,token)

  def f:((Form[controllers.account.Reset.ResetForm],String) => play.twirl.api.HtmlFormat.Appendable) = (resetForm,token) => apply(resetForm,token)

  def ref: this.type = this

}


}

/**/
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 02:26:06 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/account/reset/reset.scala.html
                  HASH: 1b579ca6028500e5a822d0d19145fe8a88dc966f
                  MATRIX: 801->1|963->191|978->198|1058->202|1093->211|1133->225|1147->231|1204->268|1275->94|1307->118|1403->70|1431->89|1461->184|1494->308|1523->311|1551->330|1591->332|1624->338|1656->343|1710->376|1748->388|1777->396|1810->402|1873->438|1932->476|1970->487|2033->541|2073->543|2115->557|2184->599|2425->819|2470->836|2502->841|2559->877|2778->1069|2819->1089|2871->1114|2886->1120|2925->1138|2979->1165|3018->1183|3064->1198|3096->1203|3135->1212
                  LINES: 27->1|31->8|31->8|33->8|34->9|34->9|34->9|34->9|35->4|35->4|38->1|40->4|40->6|42->10|44->12|44->12|44->12|46->14|46->14|46->14|48->16|48->16|50->18|51->19|51->19|53->21|53->21|53->21|55->23|56->24|61->29|62->30|62->30|62->30|69->37|69->37|70->38|70->38|70->38|70->38|70->38|72->40|73->41|75->43
                  -- GENERATED --
              */
          