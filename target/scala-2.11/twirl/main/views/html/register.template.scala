
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/base(title)/*3.13*/ {_display_(Seq[Any](format.raw/*3.15*/("""	"""),format.raw/*3.63*/("""

    """),format.raw/*5.41*/("""
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Wed Sep 30 15:39:59 PDT 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/play2torial/app/views/register.scala.html
                  HASH: c35b9566ffdb0056fe3827269d5bbad1ffd7fbe4
                  MATRIX: 751->1|861->16|889->19|908->30|947->32|975->80|1008->122|1039->124
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|36->5|37->6
                  -- GENERATED --
              */
          