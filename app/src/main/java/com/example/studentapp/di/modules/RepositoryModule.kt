package com.example.studentapp.di.modules

import com.example.studentapp.di.modules.main.MainActivityModule
import com.example.studentapp.di.scopes.ActivityScope
import com.example.studentapp.repository.auth.AuthRepository
import com.example.studentapp.repository.auth.AuthRepositoryImpl
import com.example.studentapp.repository.curator.CuratorRepository
import com.example.studentapp.repository.curator.CuratorRepositoryImpl
import com.example.studentapp.ui.test.structure.repo.Repository
import com.example.studentapp.ui.test.structure.repo.RepositoryImpl
import com.example.studentapp.ui.test.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Module(includes = [ServiceModule::class])
interface RepositoryModule {

    @Singleton
    @Binds
    fun curatorRepository(repository: CuratorRepositoryImpl): CuratorRepository

    @Singleton
    @Binds
    fun authRepository(repository: AuthRepositoryImpl): AuthRepository

}