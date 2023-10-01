package vn.momo.onboard;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.vertx.core.Vertx;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class VertxServerModule_ProvideVertxFactory implements Factory<Vertx> {
  private final VertxServerModule module;

  public VertxServerModule_ProvideVertxFactory(VertxServerModule module) {
    this.module = module;
  }

  @Override
  public Vertx get() {
    return provideVertx(module);
  }

  public static VertxServerModule_ProvideVertxFactory create(VertxServerModule module) {
    return new VertxServerModule_ProvideVertxFactory(module);
  }

  public static Vertx provideVertx(VertxServerModule instance) {
    return Preconditions.checkNotNull(
        instance.provideVertx(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
