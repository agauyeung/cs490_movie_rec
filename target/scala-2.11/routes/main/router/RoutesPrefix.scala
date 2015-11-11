
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alphaneo1/movie/master/cs490_movie_rec/conf/routes
// @DATE:Tue Nov 10 03:24:49 PST 2015


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
