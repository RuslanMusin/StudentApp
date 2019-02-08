package com.example.studentapp.ui.test.structure.facade

import com.example.studentapp.ui.test.structure.repo.Repository
import javax.inject.Inject


class FacadeImpl @Inject
constructor(private val repository: Repository) : Facade {

    override val value: String
        get() = "Facade is " + this + "\n" + repository.value
}