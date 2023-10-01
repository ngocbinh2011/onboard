package vn.momo.onboard

import io.vertx.core.Vertx
import vn.momo.onboard.config.EventBusPathConfig
import vn.momo.onboard.handler.PingHandler
import vn.momo.onboard.handler.UserHandler
import vn.momo.onboard.service.HttpServerVerticle
import javax.inject.Inject

class VertxServer @Inject constructor(
    private val vertx: Vertx,
    private val pingHandler: PingHandler,
    private val httpServer: HttpServerVerticle,
    private val userHandler: UserHandler
) {

    fun start() {
        vertx.deployVerticle(httpServer)

        vertx.eventBus().consumer(EventBusPathConfig.PING_PATH, pingHandler::handle)

        vertx.eventBus().consumer(EventBusPathConfig.USER_INFO, userHandler::handle)
    }
}