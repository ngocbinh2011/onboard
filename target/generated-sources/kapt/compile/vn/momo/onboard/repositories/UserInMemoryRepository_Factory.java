package vn.momo.onboard.repositories;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserInMemoryRepository_Factory implements Factory<UserInMemoryRepository> {
  private static final UserInMemoryRepository_Factory INSTANCE =
      new UserInMemoryRepository_Factory();

  @Override
  public UserInMemoryRepository get() {
    return new UserInMemoryRepository();
  }

  public static UserInMemoryRepository_Factory create() {
    return INSTANCE;
  }

  public static UserInMemoryRepository newInstance() {
    return new UserInMemoryRepository();
  }
}
