package com.example.studentapp.ui.theme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.studentapp.R

class  ThemeFragment: MvpAppCompatFragment(), ThemeView {

    @InjectPresenter
    lateinit var themePresenter: ThemePresenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_theme, container, false)
        return view
    }
}