
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/typesafe_activator_1.3.6/play2torial/conf/routes
// @DATE:Sun Oct 11 17:29:47 PDT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
