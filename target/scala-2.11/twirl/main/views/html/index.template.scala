
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import helper._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*4.2*/scripts/*4.9*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*4.13*/("""
    """),format.raw/*5.5*/("""<script src=""""),_display_(/*5.19*/routes/*5.25*/.Assets.at("javascripts/password.js")),format.raw/*5.62*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*2.78*/("""

"""),format.raw/*6.2*/("""

"""),_display_(/*8.2*/main(null, scripts)/*8.21*/ {_display_(Seq[Any](format.raw/*8.23*/("""

  """),_display_(/*10.4*/wflash()),format.raw/*10.12*/("""
  """),format.raw/*11.3*/("""<div class="col-lg-6">
     Welcome to our movie recommendation website.
  </div>

  <div class="col-lg-6">
    <div class="well">
      """),_display_(/*17.8*/login(loginForm)),format.raw/*17.24*/("""
    """),format.raw/*18.5*/("""</div>

    <div class="well">
      """),_display_(/*21.8*/account/*21.15*/.signup.createFormOnly(signupForm)),format.raw/*21.49*/("""
    """),format.raw/*22.5*/("""</div>
  </div>
""")))}))
      }
    }
  }

  def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,loginForm)

  def f:((Form[Application.Register],Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,loginForm) => apply(signupForm,loginForm)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 04:42:09 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/index.scala.html
                  HASH: ee4212a5487b471a851c5ccea10d78743bc5b831
                  MATRIX: 833->18|987->97|1001->104|1081->108|1112->113|1152->127|1166->133|1223->170|1298->94|1326->206|1354->209|1381->228|1420->230|1451->235|1480->243|1510->246|1674->384|1711->400|1743->405|1807->443|1823->450|1878->484|1910->489
                  LINES: 30->2|34->4|34->4|36->4|37->5|37->5|37->5|37->5|39->2|41->6|43->8|43->8|43->8|45->10|45->10|46->11|52->17|52->17|53->18|56->21|56->21|56->21|57->22
                  -- GENERATED --
              */
          