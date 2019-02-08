package com.example.studentapp.ui.login.fragments.login

import com.arellomobile.mvp.MvpView
import com.example.studentapp.model.user.Curator

interface LoginFragmentView: MvpView {

    fun showEmailError(hasError: Boolean)

    fun showPasswordError(hasError: Boolean)

    fun showError()

    fun createCookie(email: String, password: String)

    fun goToProfile(curator: Curator)
}