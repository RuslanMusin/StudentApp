package com.example.studentapp.di.components

import android.content.Context
import dagger.BindsInstance
import com.example.studentapp.di.modules.AppModule
import com.example.studentapp.ui.base.App
import com.example.studentapp.ui.login.fragments.login.LoginFragmentPresenter
import com.example.studentapp.ui.test.structure.repo.Repository
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun context(context: Context): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

    fun inject(presenter: LoginFragmentPresenter)

    fun getRepo(): Repository
}