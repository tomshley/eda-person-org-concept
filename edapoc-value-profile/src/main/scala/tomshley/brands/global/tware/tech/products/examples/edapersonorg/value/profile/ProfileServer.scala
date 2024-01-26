package tomshley.brands.global.tware.tech.products.examples.edapersonorg.value.profile

import com.tomshley.brands.global.tech.tware.products.hexagonal.lib.config.HexagonalConfigKeys
import com.tomshley.brands.global.tech.tware.products.hexagonal.lib.runmainasfuture.common.ServerProperties
import com.tomshley.brands.global.tech.tware.products.hexagonal.lib.runmainasfuture.http.AkkaHttpServer
import tomshley.brands.global.tware.tech.products.examples.edapersonorg.value.profile.app.RestHandler

object ProfileServer extends AkkaHttpServer {
  override lazy val serverProperties: ServerProperties =
    ServerProperties(
      hostnameOption = Some(HexagonalConfigKeys.SERVERS_HOSTNAME.toValue),
      portOption = Some(HexagonalConfigKeys.SERVERS_PORT.toValue.toInt)
    )

  addServices(RestHandler.routes *)
  run
}

