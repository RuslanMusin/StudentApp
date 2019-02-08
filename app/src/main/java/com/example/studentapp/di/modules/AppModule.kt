package com.example.studentapp.di.modules

import com.example.studentapp.di.modules.main.MainActivityModule
import com.example.studentapp.di.scopes.ActivityScope
import com.example.studentapp.di.scopes.FragmentScope
import com.example.studentapp.ui.login.LoginActivity
import com.example.studentapp.ui.login.fragments.login.LoginFragment
import com.example.studentapp.ui.test.structure.repo.Repository
import com.example.studentapp.ui.test.structure.repo.RepositoryImpl
import com.example.studentapp.ui.test.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Module(includes = [AndroidSupportInjectionModule::class, RepositoryModule::class])
interface AppModule {
    @Singleton
    @Binds
    fun repository(repository: RepositoryImpl): Repository

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    fun mainActivityInjector(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector()
    fun loginActivityInjector(): LoginActivity

    @FragmentScope
    @ContributesAndroidInjector()
    fun loginFragmentInjector(): LoginFragment

}
