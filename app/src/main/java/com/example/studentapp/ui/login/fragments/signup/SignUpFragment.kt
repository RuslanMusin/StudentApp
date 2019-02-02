package com.example.studentapp.ui.login.fragments.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.studentapp.R
import com.example.studentapp.ui.login.fragments.login.LoginFragment.Companion.KEY
import com.example.studentapp.ui.login.fragments.login.LoginFragmentPresenter
import com.example.studentapp.ui.login.fragments.login.LoginFragmentView
import kotlinx.android.synthetic.main.fragment_theme.*

class SignUpFragment: MvpAppCompatFragment(), SignUpView {

    @InjectPresenter
    lateinit var signUpPresenter: SignUpPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        arguments?.let {
            btn_enter.text = it.getString(KEY)
        }

    }


}