
package views.html.tags

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signInHelper_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signInHelper extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<div id="signin-helper">
	<p class="text-info"><strong class="text-primary">Helper:</strong> click an user to fill the sign in form</p>
	<table class="table table-striped table-hover">
	  <thead>
	    <tr>
	      <th>Email</th>
	      <th>Password</th>
	    </tr>
	  </thead>
	  <tbody>
		"""),_display_(/*12.4*/User/*12.8*/.users.values.map/*12.25*/ { user =>_display_(Seq[Any](format.raw/*12.35*/("""
			"""),format.raw/*13.4*/("""<tr>
				<td class="email">"""),_display_(/*14.24*/user/*14.28*/.email),format.raw/*14.34*/("""</td>
				<td class="pwd">123123</td>
			</tr>
		""")))}),format.raw/*17.4*/("""
	"""),format.raw/*18.2*/("""</table>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object signInHelper extends signInHelper_Scope0.signInHelper
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/tags/signInHelper.scala.html
                  HASH: d7fba5d4d248c95f97d655b6c2338cbdcf7385b1
                  MATRIX: 539->1|635->3|662->4|978->294|990->298|1016->315|1064->325|1095->329|1150->357|1163->361|1190->367|1270->417|1299->419
                  LINES: 20->1|25->1|26->2|36->12|36->12|36->12|36->12|37->13|38->14|38->14|38->14|41->17|42->18
                  -- GENERATED --
              */
          