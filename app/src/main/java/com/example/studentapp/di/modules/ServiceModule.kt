package com.example.studentapp.di.modules

import com.example.studentapp.api.services.AuthService
import com.example.studentapp.api.services.CuratorService
import com.example.studentapp.model.user.Curator
import com.example.studentapp.utils.Const
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module(includes = [RetrofitModule::class])
public class ServiceModule {

    @Provides
    @Singleton
    fun provideAuthService(
        @Named("auth_retrofit") retrofit: Retrofit
    ): AuthService {
        return retrofit.create(AuthService::class.java)
    }

    @Provides
    @Singleton
    fun provideCuratorService(
        @Named("main_retrofit") retrofit: Retrofit
    ): CuratorService {
        return retrofit.create(CuratorService::class.java)
    }

}
