
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.6*/scripts/*3.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*3.17*/("""
        """),format.raw/*4.9*/("""<script src=""""),_display_(/*4.23*/routes/*4.29*/.Assets.at("javascripts/password.js")),format.raw/*4.66*/("""" type="text/javascript"></script>
    """)))};
Seq[Any](format.raw/*1.42*/("""

    """),format.raw/*5.6*/("""

"""),_display_(/*7.2*/main(null, scripts)/*7.21*/ {_display_(Seq[Any](format.raw/*7.23*/("""
    """),format.raw/*8.5*/("""<div class="span3">
            &nbsp;
    </div>

    <div class="span12">
        <div class="well">
        """),_display_(/*14.10*/createFormOnly(signupForm)),format.raw/*14.36*/("""
        """),format.raw/*15.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 02:26:06 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/account/signup/create.scala.html
                  HASH: edf139bb9099efe5a5493ac5d3259762da275761
                  MATRIX: 782->1|900->48|915->55|995->59|1030->68|1070->82|1084->88|1141->125|1220->41|1252->165|1280->168|1307->187|1346->189|1377->194|1516->306|1563->332|1599->341
                  LINES: 27->1|31->3|31->3|33->3|34->4|34->4|34->4|34->4|36->1|38->5|40->7|40->7|40->7|41->8|47->14|47->14|48->15
                  -- GENERATED --
              */
          