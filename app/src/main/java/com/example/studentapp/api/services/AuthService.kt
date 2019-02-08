package com.example.studentapp.api.services

import com.example.studentapp.model.auth.LoginResult
import com.example.studentapp.model.user.User
import io.reactivex.Single
import retrofit2.adapter.rxjava2.Result
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    @POST("login")
    fun login(@Body user: User): Single<Result<LoginResult>>
}