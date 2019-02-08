package com.example.studentapp.di.modules.main

import dagger.android.ContributesAndroidInjector
import com.example.studentapp.di.scopes.ActivityScope
import com.example.studentapp.ui.test.structure.presenter.MyView
import com.example.studentapp.ui.test.ui.MyFragment
import dagger.Binds
import dagger.Module
import javax.inject.Singleton
import dagger.android.support.AndroidSupportInjectionModule
import dagger.Provides
import javax.inject.Named

@Module
abstract class MyFragmentModule {

    @Binds
    abstract fun myView(myFragment: MyFragment): MyView

    @Module
    companion object {

        @JvmStatic
        @Provides
        @Named("someId")
        fun provideSomeId(myFragment: MyFragment): Int {
            return myFragment.someId
        }
    }

}