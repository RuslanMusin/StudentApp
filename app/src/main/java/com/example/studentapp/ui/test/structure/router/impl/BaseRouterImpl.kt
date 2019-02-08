package com.example.studentapp.ui.test.structure.router.impl

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.example.studentapp.ui.base.BaseActivity

abstract class BaseRouterImpl<A : BaseActivity>(private val activity: A) {
    private val fragmentManager: FragmentManager

    init {
        this.fragmentManager = activity.supportFragmentManager
    }


    fun replaceFragment(content: Int, fragment: Fragment) {
        fragmentManager.beginTransaction()
            .add(content, fragment)
            .commit()
    }
}
