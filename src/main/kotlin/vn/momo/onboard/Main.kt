package vn.momo.onboard

import dagger.Component
import dagger.Module
import dagger.Provides
import io.vertx.core.Promise
import io.vertx.core.Vertx
import io.vertx.core.http.HttpServer
import io.vertx.kotlin.core.json.json
import vn.momo.onboard.repositories.UserRepositoryModule
import vn.momo.onboard.service.HttpServerVerticle
import java.util.concurrent.CompletableFuture


class MainComponent {
    @Component(
        modules = [
            VertxServerModule::class,
            UserRepositoryModule::class
        ]
    )
    interface MyComponent {
        fun getServer(): VertxServer
    }
}

@Module
class VertxServerModule {
    @Provides
    fun provideVertx(): Vertx = Vertx.vertx()
}


fun main() {
    val mainComponent = DaggerMainComponent_MyComponent.builder().build()
    val server = mainComponent.getServer()
    server.start()

}
