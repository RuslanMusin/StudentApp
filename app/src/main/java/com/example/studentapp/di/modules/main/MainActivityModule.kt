package com.example.studentapp.di.modules.main

import dagger.android.ContributesAndroidInjector
import com.example.studentapp.di.scopes.FragmentScope
import dagger.Binds
import com.example.studentapp.di.scopes.ActivityScope
import com.example.studentapp.ui.test.structure.facade.Facade
import com.example.studentapp.ui.test.structure.facade.FacadeImpl
import com.example.studentapp.ui.test.structure.router.MainRouter
import com.example.studentapp.ui.test.structure.router.impl.MainRouterImpl
import com.example.studentapp.ui.test.ui.MyFragment
import dagger.Module


@Module
interface MainActivityModule {
    @ActivityScope
    @Binds
    fun facade(facade: FacadeImpl): Facade

    @ActivityScope
    @Binds
    fun router(mainRouter: MainRouterImpl): MainRouter

    @FragmentScope
    @ContributesAndroidInjector(modules = arrayOf(MyFragmentModule::class))
    fun myFragment(): MyFragment
}