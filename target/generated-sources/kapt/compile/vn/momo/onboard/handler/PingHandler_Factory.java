package vn.momo.onboard.handler;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PingHandler_Factory implements Factory<PingHandler> {
  private static final PingHandler_Factory INSTANCE = new PingHandler_Factory();

  @Override
  public PingHandler get() {
    return new PingHandler();
  }

  public static PingHandler_Factory create() {
    return INSTANCE;
  }

  public static PingHandler newInstance() {
    return new PingHandler();
  }
}
