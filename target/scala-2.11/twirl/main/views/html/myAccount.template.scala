
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myAccount_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class myAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[RequestHeader,User,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader, user: User, messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import controllers.routes

Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/views/*5.7*/.html.templates.logged(title = "My account", tab = "myaccount")/*5.70*/ {_display_(Seq[Any](format.raw/*5.72*/("""
	
	"""),_display_(/*7.3*/tags/*7.7*/.alertFromRequest(request, "success")),format.raw/*7.44*/("""
	
	"""),format.raw/*9.2*/("""<h1>"""),_display_(/*9.7*/Messages("myaccount.title")),format.raw/*9.34*/(""" """),format.raw/*9.35*/("""<a class="btn btn-default btn-sm pull-right" href=""""),_display_(/*9.87*/routes/*9.93*/.Auth.changePassword),format.raw/*9.113*/("""">"""),_display_(/*9.116*/Messages("changepass")),format.raw/*9.138*/("""</a></h1>
	
	<table class="table table-striped table-condensed">
		<tr>
			<td>"""),_display_(/*13.9*/Messages("field.email")),format.raw/*13.32*/("""</td>
			<td>"""),_display_(/*14.9*/user/*14.13*/.email),format.raw/*14.19*/("""</td>
		</tr>
		<tr>
			<td>"""),_display_(/*17.9*/Messages("field.firstname")),format.raw/*17.36*/("""</td>
			<td>"""),_display_(/*18.9*/user/*18.13*/.firstName),format.raw/*18.23*/("""</td>
		</tr>
		<tr>
			<td>"""),_display_(/*21.9*/Messages("field.lastname")),format.raw/*21.35*/("""</td>
			<td>"""),_display_(/*22.9*/user/*22.13*/.lastName),format.raw/*22.22*/("""</td>
		</tr>
		<tr>
			<td>"""),_display_(/*25.9*/Messages("field.services")),format.raw/*25.35*/("""</td>
			<td>"""),_display_(/*26.9*/user/*26.13*/.services.mkString(", ")),format.raw/*26.37*/("""</td>
		</tr>
	</table>
""")))}))
      }
    }
  }

  def render(request:RequestHeader,user:User,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply()(request,user,messages)

  def f:(() => (RequestHeader,User,Messages) => play.twirl.api.HtmlFormat.Appendable) = () => (request,user,messages) => apply()(request,user,messages)

  def ref: this.type = this

}


}

/**/
object myAccount extends myAccount_Scope0.myAccount
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:46 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/myAccount.scala.html
                  HASH: ba2e0d28dd7f5955d433e64baf14df2f60afab99
                  MATRIX: 556->1|743->68|771->97|798->99|810->104|881->167|920->169|950->174|961->178|1018->215|1048->219|1078->224|1125->251|1153->252|1231->304|1245->310|1286->330|1316->333|1359->355|1465->435|1509->458|1549->472|1562->476|1589->482|1644->511|1692->538|1732->552|1745->556|1776->566|1831->595|1878->621|1918->635|1931->639|1961->648|2016->677|2063->703|2103->717|2116->721|2161->745
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|28->5|30->7|30->7|30->7|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|32->9|36->13|36->13|37->14|37->14|37->14|40->17|40->17|41->18|41->18|41->18|44->21|44->21|45->22|45->22|45->22|48->25|48->25|49->26|49->26|49->26
                  -- GENERATED --
              */
          