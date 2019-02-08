package com.example.studentapp.repository.auth

import com.example.studentapp.model.auth.LoginResult
import com.example.studentapp.model.user.User
import io.reactivex.Single
import retrofit2.adapter.rxjava2.Result

interface AuthRepository {

    fun login(user: User): Single<Result<LoginResult>>
    fun logout(): Single<Result<Void>>
}