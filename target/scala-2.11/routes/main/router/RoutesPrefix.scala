
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/movie/cs490_movie_rec/conf/routes
// @DATE:Sun Nov 01 01:54:13 PDT 2015


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
