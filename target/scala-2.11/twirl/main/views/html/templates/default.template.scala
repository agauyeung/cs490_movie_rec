
package views.html.templates

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object default_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class default extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[String,Option[User],Boolean,String,Html,Html,Html,Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, loggedUser: Option[User], withMainTabs: Boolean = true, tab: String = "", styles: Html = Html(""), scripts: Html = Html(""), modals: Html = Html(""))(content: Html)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.tags.auth._
import controllers.routes
def /*6.2*/displayToggleLang/*6.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.23*/("""
	"""),_display_(/*7.3*/if(messages.lang.code == "en")/*7.33*/ {_display_(Seq[Any](format.raw/*7.35*/("""
		"""),format.raw/*8.3*/("""<li><a href=""""),_display_(/*8.17*/routes/*8.23*/.Application.selectLang("es")),format.raw/*8.52*/("""">Español</a></li>
	""")))}/*9.4*/else/*9.9*/{_display_(Seq[Any](format.raw/*9.10*/("""
		"""),format.raw/*10.3*/("""<li><a href=""""),_display_(/*10.17*/routes/*10.23*/.Application.selectLang("en")),format.raw/*10.52*/("""">English</a></li>
	""")))}),format.raw/*11.3*/("""
""")))};def /*14.2*/navbarContent/*14.15*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*14.19*/("""
	"""),_display_(/*15.3*/if(withMainTabs)/*15.19*/ {_display_(Seq[Any](format.raw/*15.21*/("""
		"""),format.raw/*16.3*/("""<ul class="nav navbar-nav">
			<li class=""""),_display_(/*17.16*/("active".when(tab == "index"))),format.raw/*17.47*/(""""><a href=""""),_display_(/*17.59*/routes/*17.65*/.Application.index),format.raw/*17.83*/("""">"""),_display_(/*17.86*/Messages("topbar.index")),format.raw/*17.110*/("""</a></li>
			"""),_display_(/*18.5*/loggedUser/*18.15*/.map/*18.19*/ { implicit user =>_display_(Seq[Any](format.raw/*18.38*/("""
				"""),_display_(/*19.6*/withService("serviceA")/*19.29*/ {_display_(Seq[Any](format.raw/*19.31*/("""
					"""),format.raw/*20.6*/("""<li class=""""),_display_(/*20.18*/("active".when(tab == "serviceA"))),format.raw/*20.52*/(""""><a href=""""),_display_(/*20.64*/routes/*20.70*/.Application.serviceA),format.raw/*20.91*/("""">A</a></li>
				""")))}),format.raw/*21.6*/("""
				"""),_display_(/*22.6*/withService("serviceA", "serviceB")/*22.41*/ {_display_(Seq[Any](format.raw/*22.43*/("""
					"""),format.raw/*23.6*/("""<li class=""""),_display_(/*23.18*/("active".when(tab == "serviceA_or_serviceB"))),format.raw/*23.64*/(""""><a href=""""),_display_(/*23.76*/routes/*23.82*/.Application.serviceAorServiceB),format.raw/*23.113*/("""">A || B</a></li>
				""")))}),format.raw/*24.6*/("""
				"""),_display_(/*25.6*/withServices("serviceA", "serviceB")/*25.42*/ {_display_(Seq[Any](format.raw/*25.44*/("""
					"""),format.raw/*26.6*/("""<li class=""""),_display_(/*26.18*/("active".when(tab == "serviceA_and_serviceB"))),format.raw/*26.65*/(""""><a href=""""),_display_(/*26.77*/routes/*26.83*/.Application.serviceAandServiceB),format.raw/*26.115*/("""">A && B</a></li>
				""")))}),format.raw/*27.6*/("""
				"""),_display_(/*28.6*/withService("master")/*28.27*/ {_display_(Seq[Any](format.raw/*28.29*/("""
					"""),format.raw/*29.6*/("""<li class=""""),_display_(/*29.18*/("active".when(tab == "settings"))),format.raw/*29.52*/(""""><a href=""""),_display_(/*29.64*/routes/*29.70*/.Application.settings),format.raw/*29.91*/("""">Settings</a></li>
				""")))}),format.raw/*30.6*/("""
				"""),format.raw/*31.5*/("""<li class=""""),_display_(/*31.17*/("active".when(tab == "myaccount"))),format.raw/*31.52*/(""""><a href=""""),_display_(/*31.64*/routes/*31.70*/.Application.myAccount),format.raw/*31.92*/("""">"""),_display_(/*31.95*/Messages("topbar.myaccount")),format.raw/*31.123*/("""</a></li>
			""")))}),format.raw/*32.5*/("""
		"""),format.raw/*33.3*/("""</ul>
	""")))}),format.raw/*34.3*/("""
	"""),format.raw/*35.2*/("""<ul class="nav navbar-nav navbar-right">
		"""),_display_(/*36.4*/loggedUser/*36.14*/.map/*36.18*/ { user =>_display_(Seq[Any](format.raw/*36.28*/("""
			"""),format.raw/*37.4*/("""<li class="navbar-text text-right" style="margin: 5px 15px">
				"""),_display_(/*38.6*/Html(Messages("topbar.hello", s"""<span class="text-success">${user.nick}</span>""", s"""<span class="text-info">${user.services.mkString(", ")}</span>"""))),format.raw/*38.162*/("""
			"""),format.raw/*39.4*/("""</li>
			"""),_display_(/*40.5*/displayToggleLang),format.raw/*40.22*/("""
			"""),format.raw/*41.4*/("""<li><a href=""""),_display_(/*41.18*/routes/*41.24*/.Auth.signOut),format.raw/*41.37*/("""">"""),_display_(/*41.40*/Messages("signout")),format.raw/*41.59*/("""</a></li>
		""")))}/*42.4*/.getOrElse/*42.14*/ {_display_(Seq[Any](format.raw/*42.16*/("""
			"""),_display_(/*43.5*/displayToggleLang),format.raw/*43.22*/("""
			"""),format.raw/*44.4*/("""<li class=""""),_display_(/*44.16*/("active".when(tab == "signin"))),format.raw/*44.48*/(""""><a href=""""),_display_(/*44.60*/routes/*44.66*/.Auth.signIn),format.raw/*44.78*/("""">"""),_display_(/*44.81*/Messages("signin")),format.raw/*44.99*/("""</a></li>
			<li class=""""),_display_(/*45.16*/("active".when(tab == "signup"))),format.raw/*45.48*/(""""><a href=""""),_display_(/*45.60*/routes/*45.66*/.Auth.startSignUp),format.raw/*45.83*/("""">"""),_display_(/*45.86*/Messages("signup")),format.raw/*45.104*/("""</a></li>
		""")))}),format.raw/*46.4*/("""
	"""),format.raw/*47.2*/("""</ul>
""")))};
Seq[Any](format.raw/*1.211*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*48.2*/("""

"""),_display_(/*50.2*/main(title, navbarContent, styles, scripts, modals)/*50.53*/(content)))
      }
    }
  }

  def render(title:String,loggedUser:Option[User],withMainTabs:Boolean,tab:String,styles:Html,scripts:Html,modals:Html,content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,loggedUser,withMainTabs,tab,styles,scripts,modals)(content)(messages)

  def f:((String,Option[User],Boolean,String,Html,Html,Html) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,loggedUser,withMainTabs,tab,styles,scripts,modals) => (content) => (messages) => apply(title,loggedUser,withMainTabs,tab,styles,scripts,modals)(content)(messages)

  def ref: this.type = this

}


}

/**/
object default extends default_Scope0.default
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 18:35:11 PST 2015
                  SOURCE: /Users/alphaneo1/nmovie/cs490_movie_rec/app/views/templates/default.scala.html
                  HASH: 840d549216e3e2a6b2f4eff72be3759217fd0551
                  MATRIX: 598->1|940->272|965->289|1045->293|1073->296|1111->326|1150->328|1179->331|1219->345|1233->351|1282->380|1320->402|1331->407|1369->408|1399->411|1440->425|1455->431|1505->460|1556->481|1581->486|1603->499|1684->503|1713->506|1738->522|1778->524|1808->527|1878->570|1930->601|1969->613|1984->619|2023->637|2053->640|2099->664|2139->678|2158->688|2171->692|2228->711|2260->717|2292->740|2332->742|2365->748|2404->760|2459->794|2498->806|2513->812|2555->833|2603->851|2635->857|2679->892|2719->894|2752->900|2791->912|2858->958|2897->970|2912->976|2965->1007|3018->1030|3050->1036|3095->1072|3135->1074|3168->1080|3207->1092|3275->1139|3314->1151|3329->1157|3383->1189|3436->1212|3468->1218|3498->1239|3538->1241|3571->1247|3610->1259|3665->1293|3704->1305|3719->1311|3761->1332|3816->1357|3848->1362|3887->1374|3943->1409|3982->1421|3997->1427|4040->1449|4070->1452|4120->1480|4164->1494|4194->1497|4232->1505|4261->1507|4331->1551|4350->1561|4363->1565|4411->1575|4442->1579|4534->1645|4712->1801|4743->1805|4779->1815|4817->1832|4848->1836|4889->1850|4904->1856|4938->1869|4968->1872|5008->1891|5039->1904|5058->1914|5098->1916|5129->1921|5167->1938|5198->1942|5237->1954|5290->1986|5329->1998|5344->2004|5377->2016|5407->2019|5446->2037|5498->2062|5551->2094|5590->2106|5605->2112|5643->2129|5673->2132|5713->2150|5756->2163|5785->2165|5832->210|5860->270|5888->483|5917->2172|5946->2175|6006->2226
                  LINES: 20->1|25->6|25->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|31->10|32->11|33->14|33->14|35->14|36->15|36->15|36->15|37->16|38->17|38->17|38->17|38->17|38->17|38->17|38->17|39->18|39->18|39->18|39->18|40->19|40->19|40->19|41->20|41->20|41->20|41->20|41->20|41->20|42->21|43->22|43->22|43->22|44->23|44->23|44->23|44->23|44->23|44->23|45->24|46->25|46->25|46->25|47->26|47->26|47->26|47->26|47->26|47->26|48->27|49->28|49->28|49->28|50->29|50->29|50->29|50->29|50->29|50->29|51->30|52->31|52->31|52->31|52->31|52->31|52->31|52->31|52->31|53->32|54->33|55->34|56->35|57->36|57->36|57->36|57->36|58->37|59->38|59->38|60->39|61->40|61->40|62->41|62->41|62->41|62->41|62->41|62->41|63->42|63->42|63->42|64->43|64->43|65->44|65->44|65->44|65->44|65->44|65->44|65->44|65->44|66->45|66->45|66->45|66->45|66->45|66->45|66->45|67->46|68->47|70->1|72->5|73->12|75->48|77->50|77->50
                  -- GENERATED --
              */
          