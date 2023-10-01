package vn.momo.onboard.service;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpServerVerticle_Factory implements Factory<HttpServerVerticle> {
  private static final HttpServerVerticle_Factory INSTANCE = new HttpServerVerticle_Factory();

  @Override
  public HttpServerVerticle get() {
    return new HttpServerVerticle();
  }

  public static HttpServerVerticle_Factory create() {
    return INSTANCE;
  }

  public static HttpServerVerticle newInstance() {
    return new HttpServerVerticle();
  }
}
