
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/agauyeung/typesafe_activator_1.3.6/cs490_movie_rec/conf/routes
// @DATE:Wed Nov 04 19:58:04 PST 2015


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
