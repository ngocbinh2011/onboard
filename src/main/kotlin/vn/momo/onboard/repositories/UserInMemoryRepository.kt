package vn.momo.onboard.repositories

import io.vertx.core.CompositeFuture
import io.vertx.core.Future
import io.vertx.core.Promise
import vn.momo.onboard.model.User
import java.util.concurrent.CompletableFuture
import javax.inject.Inject

class UserInMemoryRepository @Inject constructor() : UserRepository {
    companion object {
        @JvmStatic
        private val userMap: Map<Int, User> = HashMap()

        init {
            userMap.plus(1 to User(1, "BinhCN", 20))
        }
    }


    override fun getById(userId: Int): Future<User> {
        userMap.plus(1 to User(1, "BinhCN", 20))

        return Future.future<User> { promise ->
            CompletableFuture.runAsync({
                Thread.sleep(5000)
                if (!userMap.containsKey(userId))
                    promise.fail("User not exists with id=$userId")
                else
                    promise.complete(User(1, "BinhCN", 20))
            })
        }
    }

}