package com.example.studentapp.ui.test.structure.presenter

import com.example.studentapp.ui.test.structure.facade.Facade
import com.example.studentapp.ui.test.structure.router.MainRouter
import javax.inject.Inject
import javax.inject.Named


class MyPresenter @Inject
constructor(
    private val view: MyView,
    private val facade: Facade,
    private val router: MainRouter, @param:Named("someId") private val someId: Int
) {

    val value: String
        get() = "Presenter is " + this + "\n" + "SomeId: " + someId + "\nView is " + view + "\n" + facade.value

    fun doSometing() {
        view.onResult(value)
    }
}