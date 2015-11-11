
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User = null, scripts: Html = Html(""))(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/Messages("title")),format.raw/*7.34*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*8.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css")),format.raw/*9.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("images/favicon.png")),format.raw/*10.97*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery/jquery-2.1.0.min.js")),format.raw/*11.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/bootstrap.js")),format.raw/*12.67*/("""" type="text/javascript"></script>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("stylesheets/font-awesome.min.css")),format.raw/*13.106*/("""">
        """),_display_(/*14.10*/scripts),format.raw/*14.17*/("""
    """),format.raw/*15.5*/("""</head>
    <body>

        <div ng-controller="MenuCtrl" class="navbar navbar-inverse navbar-default" role="navigation">

            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="fa fa-bars fa-lg fa-inverse"></span>
                </button>
                <a class="navbar-brand" href=""""),_display_(/*25.48*/routes/*25.54*/.Application.index()),format.raw/*25.74*/("""">
                    <i class="fa fa-rocket"></i> Project name
                </a>
                <ul class="nav navbar-nav navbar-right">
                    <li class=""><a href=""""),_display_(/*29.44*/routes/*29.50*/.Application.index()),format.raw/*29.70*/("""">Home</a></li>
                </ul>
            </div>
            """),_display_(/*32.14*/logged(user)),format.raw/*32.26*/("""
        """),format.raw/*33.9*/("""</div>

        <div class="container">
            <div class="row">
                """),_display_(/*37.18*/content),format.raw/*37.25*/("""
            """),format.raw/*38.13*/("""</div>
        </div>

        <hr>
        <div class="footer text-center">
            <div>
                <small>
                    Hello! I'm your friendly footer. If you're actually reading this, I'm impressed....
                    <a href="https://github.com/yesnault/PlayStartApp">Fork me on Github</a> <i class="fa fa-github fa-1"></i> <a href="https://github.com/yesnault/PlayStartApp">https://github.com/yesnault/PlayStartApp</a>
                </small>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(user:User,scripts:Html,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user,scripts)(content)

  def f:((User,Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user,scripts) => (content) => apply(user,scripts)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Nov 10 02:26:06 PST 2015
                  SOURCE: /Users/alphaneo1/movie/master/cs490_movie_rec/app/views/main.scala.html
                  HASH: e82ab65d12de636c45e1722f68450d5a055a11b3
                  MATRIX: 751->1|906->61|934->63|1011->114|1048->131|1136->193|1150->199|1209->238|1291->294|1305->300|1359->334|1447->395|1462->401|1515->433|1567->458|1582->464|1655->516|1739->573|1754->579|1813->617|1928->705|1943->711|2011->757|2050->769|2078->776|2110->781|2629->1273|2644->1279|2685->1299|2898->1485|2913->1491|2954->1511|3051->1581|3084->1593|3120->1602|3234->1689|3262->1696|3303->1709
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|46->15|56->25|56->25|56->25|60->29|60->29|60->29|63->32|63->32|64->33|68->37|68->37|69->38
                  -- GENERATED --
              */
          