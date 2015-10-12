
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
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

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
        
        <b>Movie Recommendation System</b>
        <hr>
    </head>
    <body>
        Current Page:&#09;<i>"""),_display_(/*16.31*/title),format.raw/*16.36*/("""</i>
        <hr>
        Menu:&#09;&#09;
        <a href="recommended">Recommended For You</a>
        &#09;&#09;|&#09;&#09;
        <a href="history">Rating History</a>
        &#09;&#09;|&#09;&#09;
        <a href="register">User Registration</a>
        <hr>
        
        """),_display_(/*26.10*/content),format.raw/*26.17*/("""
        
    """),format.raw/*28.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Wed Sep 30 17:16:49 PDT 2015
                  SOURCE: /home/agauyeung/typesafe_activator_1.3.6/play2torial/app/views/base.scala.html
                  HASH: 71b074ff65b67861cba47085984d690bb66c046e
                  MATRIX: 748->1|873->31|901->33|988->94|1013->99|1101->161|1115->167|1177->208|1264->269|1278->275|1338->314|1390->339|1405->345|1467->386|1647->539|1673->544|1981->825|2009->832|2050->846
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|47->16|47->16|57->26|57->26|59->28
                  -- GENERATED --
              */
          