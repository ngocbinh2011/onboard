package vn.momo.onboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lvn/momo/onboard/VertxServer;", "", "vertx", "Lio/vertx/core/Vertx;", "pingHandler", "Lvn/momo/onboard/handler/PingHandler;", "httpServer", "Lvn/momo/onboard/service/HttpServerVerticle;", "userHandler", "Lvn/momo/onboard/handler/UserHandler;", "(Lio/vertx/core/Vertx;Lvn/momo/onboard/handler/PingHandler;Lvn/momo/onboard/service/HttpServerVerticle;Lvn/momo/onboard/handler/UserHandler;)V", "start", "", "javadagger"})
public final class VertxServer {
    private final io.vertx.core.Vertx vertx = null;
    private final vn.momo.onboard.handler.PingHandler pingHandler = null;
    private final vn.momo.onboard.service.HttpServerVerticle httpServer = null;
    private final vn.momo.onboard.handler.UserHandler userHandler = null;
    
    @javax.inject.Inject()
    public VertxServer(@org.jetbrains.annotations.NotNull()
    io.vertx.core.Vertx vertx, @org.jetbrains.annotations.NotNull()
    vn.momo.onboard.handler.PingHandler pingHandler, @org.jetbrains.annotations.NotNull()
    vn.momo.onboard.service.HttpServerVerticle httpServer, @org.jetbrains.annotations.NotNull()
    vn.momo.onboard.handler.UserHandler userHandler) {
        super();
    }
    
    public final void start() {
    }
}