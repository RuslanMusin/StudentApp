package com.example.studentapp.ui.login.fragments.login

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.studentapp.R
import com.example.studentapp.utils.Const.TAG
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : MvpAppCompatFragment(), LoginFragmentView, View.OnClickListener {

    @InjectPresenter
    lateinit var loginFragmentPresenter: LoginFragmentPresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        setListeners()
    }

    private fun setListeners() {
        val args = Bundle()
        args.putString(KEY, "Button")
        btn_enter.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.loginAction, args)
        )
        btn_sign_up.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {

            R.id.btn_enter -> login(v)

            R.id.btn_sign_up -> signUp(v)
        }
    }

    private fun login(v: View) {
        Log.d(TAG,"login")
        val args = Bundle()
        args.putString(KEY, "Button")
        Navigation.createNavigateOnClickListener(R.id.signUpAciton, args)
        Log.d(TAG,"loginAfter")
    }

    private fun signUp(v: View) {
        val options = NavOptions.Builder().apply {
            setEnterAnim(R.anim.slide_in_right)
            setExitAnim(R.anim.slide_out_left)
            setPopEnterAnim(R.anim.slide_in_left)
            setPopExitAnim(R.anim.slide_out_right)
        }.build()

        val args = Bundle()
        args.putString(KEY, "Button")
        findNavController(v).navigate(R.id.signUpFragment, args, options)
    }

    companion object {

        const val KEY = "TITLE"
    }
}