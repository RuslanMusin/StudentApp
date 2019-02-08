package com.example.studentapp.ui.test.structure.repo

import javax.inject.Inject


class RepositoryImpl @Inject
constructor() : Repository {

    override val value: String
        get() = "Repo is " + this
}