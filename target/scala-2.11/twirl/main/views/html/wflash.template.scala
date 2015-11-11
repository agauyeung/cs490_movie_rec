
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object wflash_Scope0 {
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

     object wflash_Scope1 {
import helper._
import helper.twitterBootstrap._

class wflash extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*4.2*/flash/*4.7*/.map/*4.11*/ {/*5.5*/case (key, value) =>/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
        """),format.raw/*6.9*/("""<p class="">
            <span class="label label-"""),_display_(/*7.39*/key),format.raw/*7.42*/("""">"""),_display_(/*7.45*/value),format.raw/*7.50*/("""</span>
        </p>
    """)))}}))
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
object wflash extends wflash_Scope0.wflash_Scope1.wflash
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 06:30:29 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/wflash.scala.html
                  HASH: 9b7ab5c75c228502b7bc6bc76d6833155333d608
                  MATRIX: 907->53|919->58|931->62|940->69|968->89|1007->91|1042->100|1119->151|1142->154|1171->157|1196->162
                  LINES: 36->4|36->4|36->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|38->7
                  -- GENERATED --
              */
          