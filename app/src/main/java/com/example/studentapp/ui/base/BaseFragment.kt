package com.example.studentapp.ui.base

import dagger.android.support.AndroidSupportInjection
import android.os.Bundle
import android.support.v4.app.Fragment


abstract class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}