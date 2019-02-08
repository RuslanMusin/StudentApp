package com.example.studentapp.ui.test.ui

import android.os.Bundle
import com.example.studentapp.R
import com.example.studentapp.ui.test.structure.router.MainRouter
import javax.inject.Inject
import com.example.studentapp.ui.base.BaseActivity


class MainActivity : BaseActivity() {
    @Inject
    lateinit var router: MainRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        router!!.showSomeScreen(777)
    }


}