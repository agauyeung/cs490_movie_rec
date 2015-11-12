
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Option[User],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit loggedUser: Option[User], messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import views.html.tags.auth._
import controllers.routes
def /*6.2*/servicesString/*6.16*/(user: User) = {{ user.services match {
	case Nil => "none"
	case head :: Nil => head
	case init :+ last => init.mkString(", ") + " " + Messages("and") + " " + last
}}};
Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*10.3*/("""

"""),_display_(/*12.2*/views/*12.7*/.html.templates.default(title = "Home", loggedUser, tab = "index")/*12.73*/ {_display_(Seq[Any](format.raw/*12.75*/("""
		
		"""),format.raw/*14.3*/("""<h1 class="text-primary">"""),_display_(/*14.29*/Messages("index.title")),format.raw/*14.52*/("""</h1>
		
		<p class="lead">
			"""),_display_(/*17.5*/loggedUser/*17.15*/.map/*17.19*/ { user =>_display_(Seq[Any](format.raw/*17.29*/("""
				"""),_display_(/*18.6*/Html(Messages("index.intro.logged", user.fullName, routes.Application.myAccount, routes.Auth.signOut))),format.raw/*18.108*/("""
			""")))}/*19.5*/.getOrElse/*19.15*/ {_display_(Seq[Any](format.raw/*19.17*/("""
				"""),_display_(/*20.6*/Html(Messages("index.intro.notlogged", routes.Auth.signIn, routes.Auth.startSignUp, routes.Auth.forgotPassword))),format.raw/*20.118*/("""
			""")))}),format.raw/*21.5*/("""
		"""),format.raw/*22.3*/("""</p>
		<p>"""),_display_(/*23.7*/Html(Messages("index.explanation"))),format.raw/*23.42*/("""</p>
		<p>"""),_display_(/*24.7*/Messages("index.example")),format.raw/*24.32*/("""</p>
		<ul>
			<li><span class="text-info">service A</span>: """),_display_(/*26.51*/Messages("index.example.serviceA")),format.raw/*26.85*/("""</li>
			<li><span class="text-info">service A</span> """),_display_(/*27.50*/Messages("and")),format.raw/*27.65*/(""" """),format.raw/*27.66*/("""<span class="text-info">service B</span>: """),_display_(/*27.109*/Messages("index.example.serviceA_serviceB")),format.raw/*27.152*/("""</li>
			<li><span class="text-warning">master</span>: """),_display_(/*28.51*/Messages("index.example.master")),format.raw/*28.83*/("""</li>
		</ul>
		"""),_display_(/*30.4*/loggedUser/*30.14*/.map/*30.18*/ { user =>_display_(Seq[Any](format.raw/*30.28*/("""
			"""),format.raw/*31.4*/("""<p class="lead">"""),_display_(/*31.21*/Html(Messages("index.auth.status", s"""<span class="text-success">${user.fullName}</span>""", s"""<span class="text-info">${servicesString(user)}</span>"""))),format.raw/*31.178*/("""</p>
		""")))}),format.raw/*32.4*/("""
	
		"""),format.raw/*34.3*/("""<table class="table table-striped table-hover">
		  <thead>
		    <tr>
		      <th>"""),_display_(/*37.14*/Messages("index.table.section")),format.raw/*37.45*/("""</th>
		      <th>"""),_display_(/*38.14*/Messages("index.table.authobject")),format.raw/*38.48*/("""</th>
		      <th>"""),_display_(/*39.14*/Messages("index.table.services")),format.raw/*39.46*/("""</th>
					"""),_display_(/*40.7*/if(loggedUser.isDefined)/*40.31*/ {_display_(Seq[Any](format.raw/*40.33*/("""
						"""),format.raw/*41.7*/("""<th>"""),_display_(/*41.12*/Messages("index.table.allowed")),format.raw/*41.43*/("""</th>
					""")))}),format.raw/*42.7*/("""
		      """),format.raw/*43.9*/("""<th>"""),_display_(/*43.14*/Messages("index.table.go")),format.raw/*43.40*/("""</th>
		    </tr>
		  </thead>
		  <tbody>
			<tr>
				<td>Index</td>
				<td>None</td>
				<td>any</td>
				"""),_display_(/*51.6*/if(loggedUser.isDefined)/*51.30*/ {_display_(Seq[Any](format.raw/*51.32*/("""
					"""),format.raw/*52.6*/("""<td><span class="glyphicon glyphicon-ok"></span></td>
				""")))}),format.raw/*53.6*/("""
				"""),format.raw/*54.5*/("""<td><a href=""""),_display_(/*54.19*/routes/*54.25*/.Application.index),format.raw/*54.43*/("""">Index</a></td>
			</tr>
			<tr>
				<td>Service A area</td>
				<td>WithService("serviceA")</td>
				<td><span class="text-info">service A</span> or <span class="text-warning">master</span></td>
				"""),_display_(/*60.6*/loggedUser/*60.16*/.map/*60.20*/ { implicit user =>_display_(Seq[Any](format.raw/*60.39*/("""
					"""),format.raw/*61.6*/("""<td>
						"""),_display_(/*62.8*/withServiceOrElse("serviceA")/*62.37*/ {_display_(Seq[Any](format.raw/*62.39*/("""
							"""),format.raw/*63.8*/("""<span class="glyphicon glyphicon-ok"></span>
						""")))}/*64.8*/{_display_(Seq[Any](format.raw/*64.9*/("""
							"""),format.raw/*65.8*/("""<span class="glyphicon glyphicon-remove"></span>
						""")))}),format.raw/*66.8*/("""
					"""),format.raw/*67.6*/("""</td>
				""")))}),format.raw/*68.6*/("""
				"""),format.raw/*69.5*/("""<td><a href=""""),_display_(/*69.19*/routes/*69.25*/.Application.serviceA),format.raw/*69.46*/("""">Service A area</a></td>
			</tr>
			<tr>
				<td>Service A || Service B</td>
				<td>WithService("serviceA", "serviceB")</td>
				<td>(<span class="text-info">service A</span> or <span class="text-info">service B</span>) or <span class="text-warning">master</span></td>
				"""),_display_(/*75.6*/loggedUser/*75.16*/.map/*75.20*/ { implicit user =>_display_(Seq[Any](format.raw/*75.39*/("""
					"""),format.raw/*76.6*/("""<td>
						"""),_display_(/*77.8*/withServiceOrElse("serviceA", "serviceB")/*77.49*/ {_display_(Seq[Any](format.raw/*77.51*/("""
							"""),format.raw/*78.8*/("""<span class="glyphicon glyphicon-ok"></span>
						""")))}/*79.8*/{_display_(Seq[Any](format.raw/*79.9*/("""
							"""),format.raw/*80.8*/("""<span class="glyphicon glyphicon-remove"></span>
						""")))}),format.raw/*81.8*/("""
					"""),format.raw/*82.6*/("""</td>
				""")))}),format.raw/*83.6*/("""
				"""),format.raw/*84.5*/("""<td><a href=""""),_display_(/*84.19*/routes/*84.25*/.Application.serviceAorServiceB),format.raw/*84.56*/("""">Service A || Service B</a></td>
			</tr>
			<tr>
				<td>Service A && Service B</td>
				<td><span class="text-primary">WithServices</span>("serviceA", "serviceB")</td>
				<td>(<span class="text-info">service A</span> and <span class="text-info">service B</span>) or <span class="text-warning">master</span></td>
				"""),_display_(/*90.6*/loggedUser/*90.16*/.map/*90.20*/ { implicit user =>_display_(Seq[Any](format.raw/*90.39*/("""
					"""),format.raw/*91.6*/("""<td>
						"""),_display_(/*92.8*/withServicesOrElse("serviceA", "serviceB")/*92.50*/ {_display_(Seq[Any](format.raw/*92.52*/("""
							"""),format.raw/*93.8*/("""<span class="glyphicon glyphicon-ok"></span>
						""")))}/*94.8*/{_display_(Seq[Any](format.raw/*94.9*/("""
							"""),format.raw/*95.8*/("""<span class="glyphicon glyphicon-remove"></span>
						""")))}),format.raw/*96.8*/("""
					"""),format.raw/*97.6*/("""</td>
				""")))}),format.raw/*98.6*/("""
				"""),format.raw/*99.5*/("""<td><a href=""""),_display_(/*99.19*/routes/*99.25*/.Application.serviceAandServiceB),format.raw/*99.57*/("""">Service A && Service B</a></td>
			</tr>
			<tr>
				<td>Settings area</td>
				<td>WithService("master")</td>
				<td>only <span class="text-warning">master</span></td>
				"""),_display_(/*105.6*/loggedUser/*105.16*/.map/*105.20*/ { implicit user =>_display_(Seq[Any](format.raw/*105.39*/("""
					"""),format.raw/*106.6*/("""<td>
						"""),_display_(/*107.8*/withServiceOrElse("master")/*107.35*/ {_display_(Seq[Any](format.raw/*107.37*/("""
							"""),format.raw/*108.8*/("""<span class="glyphicon glyphicon-ok"></span>
						""")))}/*109.8*/{_display_(Seq[Any](format.raw/*109.9*/("""
							"""),format.raw/*110.8*/("""<span class="glyphicon glyphicon-remove"></span>
						""")))}),format.raw/*111.8*/("""
					"""),format.raw/*112.6*/("""</td>
				""")))}),format.raw/*113.6*/("""
				"""),format.raw/*114.5*/("""<td><a href=""""),_display_(/*114.19*/routes/*114.25*/.Application.settings),format.raw/*114.46*/("""">Settings area</a></td>
			</tr>
		</table>

	""")))}),format.raw/*118.3*/("""
	"""))
      }
    }
  }

  def render(loggedUser:Option[User],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply()(loggedUser,messages)

  def f:(() => (Option[User],Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (loggedUser,messages) => apply()(loggedUser,messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:46 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/index.scala.html
                  HASH: d34d9920dd4087d9113643e9cea9795d7d3d79c7
                  MATRIX: 542->1|732->120|754->134|951->58|979->118|1007->301|1036->304|1049->309|1124->375|1164->377|1197->383|1250->409|1294->432|1352->464|1371->474|1384->478|1432->488|1464->494|1588->596|1611->601|1630->611|1670->613|1702->619|1836->731|1871->736|1901->739|1938->750|1994->785|2031->796|2077->821|2166->883|2221->917|2303->972|2339->987|2368->988|2439->1031|2504->1074|2587->1130|2640->1162|2683->1179|2702->1189|2715->1193|2763->1203|2794->1207|2838->1224|3017->1381|3055->1389|3087->1394|3198->1478|3250->1509|3296->1528|3351->1562|3397->1581|3450->1613|3488->1625|3521->1649|3561->1651|3595->1658|3627->1663|3679->1694|3721->1706|3757->1715|3789->1720|3836->1746|3972->1856|4005->1880|4045->1882|4078->1888|4167->1947|4199->1952|4240->1966|4255->1972|4294->1990|4522->2192|4541->2202|4554->2206|4611->2225|4644->2231|4682->2243|4720->2272|4760->2274|4795->2282|4865->2334|4903->2335|4938->2343|5024->2399|5057->2405|5098->2416|5130->2421|5171->2435|5186->2441|5228->2462|5531->2739|5550->2749|5563->2753|5620->2772|5653->2778|5691->2790|5741->2831|5781->2833|5816->2841|5886->2893|5924->2894|5959->2902|6045->2958|6078->2964|6119->2975|6151->2980|6192->2994|6207->3000|6259->3031|6606->3352|6625->3362|6638->3366|6695->3385|6728->3391|6766->3403|6817->3445|6857->3447|6892->3455|6962->3507|7000->3508|7035->3516|7121->3572|7154->3578|7195->3589|7227->3594|7268->3608|7283->3614|7336->3646|7540->3823|7560->3833|7574->3837|7632->3856|7666->3862|7705->3874|7742->3901|7783->3903|7819->3911|7890->3963|7929->3964|7965->3972|8052->4028|8086->4034|8128->4045|8161->4050|8203->4064|8219->4070|8262->4091|8341->4139
                  LINES: 20->1|25->6|25->6|30->1|32->5|33->10|35->12|35->12|35->12|35->12|37->14|37->14|37->14|40->17|40->17|40->17|40->17|41->18|41->18|42->19|42->19|42->19|43->20|43->20|44->21|45->22|46->23|46->23|47->24|47->24|49->26|49->26|50->27|50->27|50->27|50->27|50->27|51->28|51->28|53->30|53->30|53->30|53->30|54->31|54->31|54->31|55->32|57->34|60->37|60->37|61->38|61->38|62->39|62->39|63->40|63->40|63->40|64->41|64->41|64->41|65->42|66->43|66->43|66->43|74->51|74->51|74->51|75->52|76->53|77->54|77->54|77->54|77->54|83->60|83->60|83->60|83->60|84->61|85->62|85->62|85->62|86->63|87->64|87->64|88->65|89->66|90->67|91->68|92->69|92->69|92->69|92->69|98->75|98->75|98->75|98->75|99->76|100->77|100->77|100->77|101->78|102->79|102->79|103->80|104->81|105->82|106->83|107->84|107->84|107->84|107->84|113->90|113->90|113->90|113->90|114->91|115->92|115->92|115->92|116->93|117->94|117->94|118->95|119->96|120->97|121->98|122->99|122->99|122->99|122->99|128->105|128->105|128->105|128->105|129->106|130->107|130->107|130->107|131->108|132->109|132->109|133->110|134->111|135->112|136->113|137->114|137->114|137->114|137->114|141->118
                  -- GENERATED --
              */
          