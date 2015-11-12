
package views.html.tags

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object alertFromRequest_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class alertFromRequest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[RequestHeader,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(request: RequestHeader, key: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/request/*2.9*/.flash.get(key).map/*2.28*/ { msg =>_display_(Seq[Any](format.raw/*2.37*/(""" """),_display_(/*2.39*/alert(msg, key)),format.raw/*2.54*/(""" """)))}))
      }
    }
  }

  def render(request:RequestHeader,key:String): play.twirl.api.HtmlFormat.Appendable = apply(request,key)

  def f:((RequestHeader,String) => play.twirl.api.HtmlFormat.Appendable) = (request,key) => apply(request,key)

  def ref: this.type = this

}


}

/**/
object alertFromRequest extends alertFromRequest_Scope0.alertFromRequest
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/tags/alertFromRequest.scala.html
                  HASH: 6c6819750a1461aef6107f954a8b0e7db2f71c0d
                  MATRIX: 568->1|700->38|727->40|741->47|768->66|814->75|842->77|877->92
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          