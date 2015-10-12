
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object results_Scope0 {
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

class results extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, recommendations: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""
    """),format.raw/*4.43*/("""
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(title:String,recommendations:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(title,recommendations)

  def f:((String,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (title,recommendations) => apply(title,recommendations)

  def ref: this.type = this

}


}

/**/
object results extends results_Scope0.results
              /*
                  -- GENERATED --
                  DATE: Sun Oct 11 19:57:33 PDT 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/play2torial/app/views/results.scala.html
                  HASH: 91d975c0a8b6d0b4131421cc4e9ae14a2b10c102
                  MATRIX: 762->1|903->47|931->50|950->61|989->63|1017->111|1049->154|1080->156
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|35->4|36->5
                  -- GENERATED --
              */
          