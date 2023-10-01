package vn.momo.onboard.handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lvn/momo/onboard/handler/UserHandler;", "Lio/vertx/core/Handler;", "Lio/vertx/core/eventbus/Message;", "Lio/vertx/core/json/JsonObject;", "userRepository", "Lvn/momo/onboard/repositories/UserRepository;", "(Lvn/momo/onboard/repositories/UserRepository;)V", "handle", "", "event", "javadagger"})
public final class UserHandler implements io.vertx.core.Handler<io.vertx.core.eventbus.Message<io.vertx.core.json.JsonObject>> {
    private final vn.momo.onboard.repositories.UserRepository userRepository = null;
    
    @javax.inject.Inject()
    public UserHandler(@org.jetbrains.annotations.NotNull()
    vn.momo.onboard.repositories.UserRepository userRepository) {
        super();
    }
    
    @java.lang.Override()
    public void handle(@org.jetbrains.annotations.NotNull()
    io.vertx.core.eventbus.Message<io.vertx.core.json.JsonObject> event) {
    }
}