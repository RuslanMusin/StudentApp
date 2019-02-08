package com.example.studentapp.ui.login.fragments.login

import android.content.Context
import android.content.SharedPreferences
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
import com.example.studentapp.model.user.Curator
import com.example.studentapp.ui.base.BaseFragment
import com.example.studentapp.utils.Const.TAG
import com.example.studentapp.utils.Const.USER_DATA_PREFERENCES
import com.example.studentapp.utils.Const.USER_PASSWORD
import com.example.studentapp.utils.Const.USER_USERNAME
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : BaseFragment(), LoginFragmentView, View.OnClickListener {

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

   /* private fun setListeners() {
        val args = Bundle()
        args.putString(KEY, "Button")
        btn_enter.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.loginAction, args)
        )
        btn_sign_up.setOnClickListener(this)
    }*/

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

    private fun checkUserSession() {
        activity?.getSharedPreferences(USER_DATA_PREFERENCES, Context.MODE_PRIVATE)?.let {
            if (it.contains(USER_USERNAME)) {
                val email: String = it.getString(USER_USERNAME, "")
                val password: String = it.getString(USER_PASSWORD, "")
                loginFragmentPresenter.signIn(email, password)
            }
        }
    }

    override fun showEmailError(hasError: Boolean) {
        if(hasError) {
            ti_email.error = getString(R.string.enter_correct_name)
        } else {
            ti_email.error = null
        }

    }

    override fun showPasswordError(hasError: Boolean) {
        if(hasError) {
            ti_password.error = getString(R.string.enter_correct_password)
        } else {
            ti_password.error = null
        }

    }

    private fun setListeners() {
        btn_enter.setOnClickListener(this)
        iv_cover.setOnClickListener(this)
        tv_name.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when (view.id) {

            R.id.btn_enter -> {
                val username = et_email.getText().toString();
                val password = et_password.getText().toString();
                loginFragmentPresenter.signIn(username, password)
            }

            R.id.tv_name -> {
                et_email.setText("Феликс.Туполев.Ипатович")
                et_password.setText("Феликс.Туполев.Ипатович")

            }

            R.id.iv_cover -> {
                et_email.setText("Прохор.Куклев.Брониславович")
                et_password.setText("Прохор.Куклев.Брониславович")
            }

            R.id.btn_sign_up -> signUp(view)
        }
    }

    override fun goToProfile(curator: Curator) {
        Log.d(TAG,"login")
        val args = Bundle()
        args.putString(KEY, "Button")
        Navigation.createNavigateOnClickListener(R.id.signUpAciton, args)
        Log.d(TAG,"loginAfter")
    }

    override fun showError() {
        ti_email.error = getString(R.string.enter_correct_name)
        ti_password.error = getString(R.string.enter_correct_password)
    }

    override fun createCookie(email: String, password: String) {
        activity?.getSharedPreferences(USER_DATA_PREFERENCES, Context.MODE_PRIVATE)?.let {
            if (!it.contains(USER_USERNAME)) {
                val editor = it.edit()
                editor.putString(USER_USERNAME, email)
                editor.putString(USER_PASSWORD, password)
                editor.apply()
            }
        }
    }

    companion object {

        const val KEY = "TITLE"
    }
}