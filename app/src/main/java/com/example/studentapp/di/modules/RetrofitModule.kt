package com.example.studentapp.di.modules

import com.example.studentapp.utils.Const.BASE_URL
import com.example.studentapp.utils.Const.TIME_FORMAT
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import retrofit2.Retrofit
import com.google.gson.Gson
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import com.google.gson.GsonBuilder
import io.reactivex.schedulers.Schedulers
import retrofit2.Converter
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory.createWithScheduler
import javax.inject.Named


@Module(includes = [OkHttpClientModule::class])
public class RetrofitModule {

    @Provides
    @Singleton
    @Named("main_retrofit")
    fun provideMainRetrofit(
        @Named("main") okHttpClient: OkHttpClient,
        builder: Retrofit.Builder
    ): Retrofit {
        return builder
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .build()
    }

    @Provides
    @Singleton
    @Named("auth_retrofit")
    fun provideAuthRetrofit(
        @Named("auth") okHttpClient: OkHttpClient,
        builder: Retrofit.Builder
    ): Retrofit {
        return builder
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofitBuilder(converterFactory: GsonConverterFactory): Retrofit.Builder {
        return Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(converterFactory)
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder()
            .setDateFormat(TIME_FORMAT)
            .create()
    }

    @Provides
    @Singleton
    fun provideConverterFactory(gson: Gson): GsonConverterFactory {
        return GsonConverterFactory.create(gson)
    }

}