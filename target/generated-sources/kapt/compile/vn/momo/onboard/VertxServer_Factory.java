package vn.momo.onboard;

import dagger.internal.Factory;
import io.vertx.core.Vertx;
import javax.annotation.Generated;
import javax.inject.Provider;
import vn.momo.onboard.handler.PingHandler;
import vn.momo.onboard.handler.UserHandler;
import vn.momo.onboard.service.HttpServerVerticle;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VertxServer_Factory implements Factory<VertxServer> {
  private final Provider<Vertx> vertxProvider;

  private final Provider<PingHandler> pingHandlerProvider;

  private final Provider<HttpServerVerticle> httpServerProvider;

  private final Provider<UserHandler> userHandlerProvider;

  public VertxServer_Factory(
      Provider<Vertx> vertxProvider,
      Provider<PingHandler> pingHandlerProvider,
      Provider<HttpServerVerticle> httpServerProvider,
      Provider<UserHandler> userHandlerProvider) {
    this.vertxProvider = vertxProvider;
    this.pingHandlerProvider = pingHandlerProvider;
    this.httpServerProvider = httpServerProvider;
    this.userHandlerProvider = userHandlerProvider;
  }

  @Override
  public VertxServer get() {
    return new VertxServer(
        vertxProvider.get(),
        pingHandlerProvider.get(),
        httpServerProvider.get(),
        userHandlerProvider.get());
  }

  public static VertxServer_Factory create(
      Provider<Vertx> vertxProvider,
      Provider<PingHandler> pingHandlerProvider,
      Provider<HttpServerVerticle> httpServerProvider,
      Provider<UserHandler> userHandlerProvider) {
    return new VertxServer_Factory(
        vertxProvider, pingHandlerProvider, httpServerProvider, userHandlerProvider);
  }

  public static VertxServer newInstance(
      Vertx vertx,
      PingHandler pingHandler,
      HttpServerVerticle httpServer,
      UserHandler userHandler) {
    return new VertxServer(vertx, pingHandler, httpServer, userHandler);
  }
}
