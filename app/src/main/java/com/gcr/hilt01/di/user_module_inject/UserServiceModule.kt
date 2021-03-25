package com.gcr.hilt01.di.user_module_inject

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
abstract class UserServiceModule {

    @Binds
    @ActivityScoped
    abstract fun bindUserService(
        userServiceImpl: UserServiceImp
    ): UserService

    @UserServiceUno
    @Binds
    @ActivityScoped
    abstract fun bindUserServicioUno(
        userServiceImpl: UserServiceImp
    ): UserService

    @UserServiceDos
    @Binds
    @ActivityScoped
    abstract fun bindsUserServicioDos(
        userServiceImpl: UserServiceImp
    ): UserService
}