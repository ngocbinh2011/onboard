package vn.momo.onboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lvn/momo/onboard/MainComponent;", "", "()V", "MyComponent", "javadagger"})
public final class MainComponent {
    
    public MainComponent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lvn/momo/onboard/MainComponent$MyComponent;", "", "getServer", "Lvn/momo/onboard/VertxServer;", "javadagger"})
    @dagger.Component(modules = {vn.momo.onboard.VertxServerModule.class, vn.momo.onboard.repositories.UserRepositoryModule.class})
    public static abstract interface MyComponent {
        
        @org.jetbrains.annotations.NotNull()
        public abstract vn.momo.onboard.VertxServer getServer();
    }
}