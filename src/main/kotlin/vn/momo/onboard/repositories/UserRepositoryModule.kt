package vn.momo.onboard.repositories

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface UserRepositoryModule {
    @Binds
    fun provideUserRepository(userRepository: UserInMemoryRepository): UserRepository
}