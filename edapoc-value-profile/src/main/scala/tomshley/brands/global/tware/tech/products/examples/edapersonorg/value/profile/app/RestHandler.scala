package tomshley.brands.global.tware.tech.products.examples.edapersonorg.value.profile.app

import akka.http.scaladsl.server.Directives.{complete, get, path, post}
import akka.http.scaladsl.server.{Directives, Route}
import com.tomshley.brands.global.tech.tware.products.hexagonal.lib.runmainasfuture.http.routing.AkkaRestHandler

object RestHandler extends RestHandler

sealed trait RestHandler extends AkkaRestHandler {
  private val heartbeatGet: Route =
    get {
      path("heartbeat") {
        complete("true")
      }
    }
  override lazy val routes: Seq[Route] = Seq(heartbeatGet)
}
