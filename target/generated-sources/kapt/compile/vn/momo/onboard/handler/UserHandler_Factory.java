package vn.momo.onboard.handler;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import vn.momo.onboard.repositories.UserRepository;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UserHandler_Factory implements Factory<UserHandler> {
  private final Provider<UserRepository> userRepositoryProvider;

  public UserHandler_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public UserHandler get() {
    return new UserHandler(userRepositoryProvider.get());
  }

  public static UserHandler_Factory create(Provider<UserRepository> userRepositoryProvider) {
    return new UserHandler_Factory(userRepositoryProvider);
  }

  public static UserHandler newInstance(UserRepository userRepository) {
    return new UserHandler(userRepository);
  }
}
