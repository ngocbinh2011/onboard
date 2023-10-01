package vn.momo.onboard.handler

import io.vertx.core.Handler
import io.vertx.core.eventbus.Message
import javax.inject.Inject


class PingHandler @Inject constructor() : Handler<Message<String>> {
    override fun handle(event: Message<String>) {
        event.reply(
            "PONG"
        )
    }
}