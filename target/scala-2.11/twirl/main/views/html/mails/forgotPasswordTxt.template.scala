
package views.html.mails

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object forgotPasswordTxt_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class forgotPasswordTxt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, link: String)(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""
"""),_display_(/*2.2*/Messages("mail.forgotpwd.prelink")),format.raw/*2.36*/("""

"""),_display_(/*4.2*/link),format.raw/*4.6*/("""

"""),_display_(/*6.2*/Messages("mail.forgotpwd.postlink")),format.raw/*6.37*/("""

"""),_display_(/*8.2*/Messages("mail.sign")))
      }
    }
  }

  def render(name:String,link:String,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(name,link)(messages)

  def f:((String,String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (name,link) => (messages) => apply(name,link)(messages)

  def ref: this.type = this

}


}

/**/
object forgotPasswordTxt extends forgotPasswordTxt_Scope0.forgotPasswordTxt
              /*
                  -- GENERATED --
                  DATE: Wed Nov 11 15:29:47 PST 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/mails/forgotPasswordTxt.scala.html
                  HASH: 89b93064b13e18238bd8b66ea4b36bd811e45c4b
                  MATRIX: 573->1|725->58|752->60|806->94|834->97|857->101|885->104|940->139|968->142
                  LINES: 20->1|25->1|26->2|26->2|28->4|28->4|30->6|30->6|32->8
                  -- GENERATED --
              */
          