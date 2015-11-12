
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[RequestHeader,play.api.UsefulException,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(request: RequestHeader, error: play.api.UsefulException)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.88*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.templates.main("ADMIN Oops, an error occurred")/*2.60*/ {_display_(Seq[Any](format.raw/*2.62*/("""
	"""),format.raw/*3.2*/("""<h1>ADMIN """),_display_(/*3.13*/Messages("error.unknown.title")),format.raw/*3.44*/("""</h1>
	<p>"""),_display_(/*4.6*/Messages("error.unknown.text", error.id)),format.raw/*4.46*/("""</p>
""")))}))
      }
    }
  }

  def render(request:RequestHeader,error:play.api.UsefulException,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(request,error)(messages)

  def f:((RequestHeader,play.api.UsefulException) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (request,error) => (messages) => apply(request,error)(messages)

  def ref: this.type = this

}


}

/**/
object error extends error_Scope0.error
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/errors/error.scala.html
                  HASH: 87149e36d1d820146832c2a132221bf7d9160e2a
                  MATRIX: 575->1|756->87|783->89|795->94|856->147|895->149|923->151|960->162|1011->193|1047->204|1107->244
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|27->3|27->3|27->3|28->4|28->4
                  -- GENERATED --
              */
          