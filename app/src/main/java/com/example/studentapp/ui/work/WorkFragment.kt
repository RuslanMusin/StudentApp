package com.example.studentapp.ui.work

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.studentapp.R
import com.example.studentapp.ui.login.fragments.login.LoginFragment
import com.example.studentapp.ui.login.fragments.login.LoginFragmentArgs

class WorkFragment: MvpAppCompatFragment(), WorkView {

    @InjectPresenter
    lateinit var workPresenter: WorkPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_work, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.let {
            val sageArgs = LoginFragmentArgs.fromBundle(it)
            sageArgs.argument
        }
    }
}