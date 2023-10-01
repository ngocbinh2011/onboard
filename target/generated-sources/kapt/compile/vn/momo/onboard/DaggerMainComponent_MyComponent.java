package vn.momo.onboard;

import dagger.internal.Preconditions;
import javax.annotation.Generated;
import vn.momo.onboard.handler.PingHandler;
import vn.momo.onboard.handler.UserHandler;
import vn.momo.onboard.repositories.UserInMemoryRepository;
import vn.momo.onboard.service.HttpServerVerticle;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMainComponent_MyComponent implements MainComponent.MyComponent {
  private final VertxServerModule vertxServerModule;

  private DaggerMainComponent_MyComponent(VertxServerModule vertxServerModuleParam) {
    this.vertxServerModule = vertxServerModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MainComponent.MyComponent create() {
    return new Builder().build();
  }

  private UserHandler getUserHandler() {
    return new UserHandler(new UserInMemoryRepository());
  }

  @Override
  public VertxServer getServer() {
    return new VertxServer(
        VertxServerModule_ProvideVertxFactory.provideVertx(vertxServerModule),
        new PingHandler(),
        new HttpServerVerticle(),
        getUserHandler());
  }

  public static final class Builder {
    private VertxServerModule vertxServerModule;

    private Builder() {}

    public Builder vertxServerModule(VertxServerModule vertxServerModule) {
      this.vertxServerModule = Preconditions.checkNotNull(vertxServerModule);
      return this;
    }

    public MainComponent.MyComponent build() {
      if (vertxServerModule == null) {
        this.vertxServerModule = new VertxServerModule();
      }
      return new DaggerMainComponent_MyComponent(vertxServerModule);
    }
  }
}
