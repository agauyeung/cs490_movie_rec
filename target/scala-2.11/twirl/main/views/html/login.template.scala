
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, regForm: Form[Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/base(title)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""	"""),format.raw/*5.63*/("""

    """),format.raw/*7.41*/("""
     """),_display_(/*8.7*/form(action = routes.Application.authenticated(), 'id -> "regForm")/*8.74*/ {_display_(Seq[Any](format.raw/*8.76*/("""
        """),format.raw/*9.9*/("""<html>
            <body>
                <header>
                    <a href=""""),_display_(/*12.31*/routes/*12.37*/.Application.index),format.raw/*12.55*/("""" id="logo"><span>Welcome</span>hello</a>
                </header>
                
                """),_display_(/*15.18*/helper/*15.24*/.form(routes.Application.authenticate)/*15.62*/ {_display_(Seq[Any](format.raw/*15.64*/("""
                   """),format.raw/*16.20*/("""<h1>Sign in</h1>
                
                   <p>
                       <input type="email" name="email" placeholder="Email" value=""""),_display_(/*19.85*/form("email")/*19.98*/.value),format.raw/*19.104*/("""">
                   </p>
                   <p>
                       <input type="password" name="password" placeholder="Password">
                   </p>
                   <p>
                       <button type="submit">Login</button>
                   </p>
                """)))}),format.raw/*27.18*/("""
            
            """),format.raw/*29.13*/("""</body>
        </html>
        """)))}),format.raw/*31.10*/("""
    """)))}))
      }
    }
  }

  def render(title:String,regForm:Form[Login]): play.twirl.api.HtmlFormat.Appendable = apply(title,regForm)

  def f:((String,Form[Login]) => play.twirl.api.HtmlFormat.Appendable) = (title,regForm) => apply(title,regForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Nov 01 01:31:29 PDT 2015
                  SOURCE: /Users/alphaneo1/movie/cs490_movie_rec/app/views/login.scala.html
                  HASH: 9cb55994353902a094760be23aac9d903413f6e9
                  MATRIX: 757->1|904->38|932->57|959->59|978->70|1017->72|1045->120|1078->162|1110->169|1185->236|1224->238|1259->247|1367->328|1382->334|1421->352|1550->454|1565->460|1612->498|1652->500|1700->520|1868->661|1890->674|1918->680|2233->964|2287->990|2351->1023
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|35->5|37->7|38->8|38->8|38->8|39->9|42->12|42->12|42->12|45->15|45->15|45->15|45->15|46->16|49->19|49->19|49->19|57->27|59->29|61->31
                  -- GENERATED --
              */
          