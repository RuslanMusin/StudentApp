package com.example.studentapp.ui.test.structure.router.impl

import com.example.studentapp.R
import com.example.studentapp.ui.base.BaseActivity
import com.example.studentapp.ui.test.structure.router.MainRouter
import com.example.studentapp.ui.test.ui.MainActivity
import com.example.studentapp.ui.test.ui.MyFragment
import javax.inject.Inject

class MainRouterImpl @Inject
constructor(activity: MainActivity) : BaseRouterImpl<MainActivity>(activity), MainRouter {


    override fun showSomeScreen(id: Int) {
        /*replaceFragment(R.id.content, MyFragment.create(id))*/
    }
}