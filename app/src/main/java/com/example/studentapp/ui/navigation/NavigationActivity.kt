package com.example.studentapp.ui.navigation

import android.os.Bundle
import android.os.PersistableBundle
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.studentapp.R

open class NavigationActivity: MvpAppCompatActivity(), NavigationView {

    @InjectPresenter
    lateinit var navigationPresenter: NavigationPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
    }

}