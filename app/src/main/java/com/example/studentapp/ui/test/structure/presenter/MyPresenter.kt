package com.example.studentapp.ui.test.structure.presenter

import com.example.studentapp.ui.test.structure.facade.Facade
import com.example.studentapp.ui.test.structure.repo.Repository
import com.example.studentapp.ui.test.structure.router.MainRouter
import javax.inject.Inject
import javax.inject.Named


class MyPresenter @Inject
constructor() {

    @Inject
    lateinit var repository: Repository

    fun getVal(): String {
        return repository.value
    }
}