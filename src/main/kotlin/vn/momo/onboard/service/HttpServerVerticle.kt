package vn.momo.onboard.service

import io.vertx.core.*
import io.vertx.core.eventbus.EventBus
import io.vertx.core.json.JsonObject
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import vn.momo.onboard.config.EventBusPathConfig
import vn.momo.onboard.model.User
import javax.inject.Inject

class HttpServerVerticle @Inject constructor() : AbstractVerticle() {
    override fun start() {
        if (vertx == null)
            return
        val server = vertx.createHttpServer()

        val router = Router.router(vertx)
        router.get("/api/v1/ping").handler(this::ping)
           router.get("/api/v1/user/:userId").handler(this::getUserInfo)
        server
            .requestHandler(router)
            .listen(8080, "localhost")
            .onSuccess {
                println("Server started!")
            }
            .onFailure {
                println("Server start fail!")
            }
    }

    fun ping(context: RoutingContext) {
        vertx.eventBus()
            .request<String>(EventBusPathConfig.PING_PATH, "Ping") { reply ->
                if (reply.succeeded()) {
                    val httpResponse = context.response()
                    httpResponse.setStatusCode(200)
                    httpResponse.setStatusMessage("Success")
                    httpResponse.end(reply.result().body())
                }
            }
    }

    fun getUserInfo(context: RoutingContext) {
        val data: JsonObject = JsonObject()
        data.put("action", "GET")
        data.put("user_id", context.pathParam("userId").toInt())
        println("Get userInfo " + data)

        vertx.eventBus()
            .request<String>(EventBusPathConfig.USER_INFO, data, { reply ->
                if (reply.succeeded()) {
                    context.response().end(reply.result().body())
                } else {
                    context.response().setStatusCode(404)
                    context.response().end(reply.cause().message)
                }
            })
    }
}