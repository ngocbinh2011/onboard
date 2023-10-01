package vn.momo.onboard.handler

import io.vertx.core.Handler
import io.vertx.core.Promise
import io.vertx.core.eventbus.Message
import io.vertx.core.json.Json
import io.vertx.core.json.JsonObject
import vn.momo.onboard.model.User
import vn.momo.onboard.repositories.UserRepository
import javax.inject.Inject

class UserHandler @Inject constructor(
    private val userRepository: UserRepository
) : Handler<Message<JsonObject>> {
    override fun handle(event: Message<JsonObject>) {
        var body = event.body()
        var action = body.getString("action")

        when (action) {
            "GET" -> {
                var userId = body.getInteger("user_id", -1)
                println("Start get: ${System.currentTimeMillis()}" )
                userRepository.getById(userId)
                    .onSuccess{user ->
                        event.reply(user.toString() )
                    }
                    .onFailure { ex ->
                        event.fail(404, ex.message)
                    }
                println("End get: ${System.currentTimeMillis()}" )

            }

            "POST" -> {

            }

            "DELETE" -> {

            }

        }
    }

}