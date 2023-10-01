package vn.momo.onboard.repositories

import io.vertx.core.Future
import io.vertx.core.Promise
import vn.momo.onboard.model.User

interface UserRepository {
    fun getById(userId: Int): Future<User>
}