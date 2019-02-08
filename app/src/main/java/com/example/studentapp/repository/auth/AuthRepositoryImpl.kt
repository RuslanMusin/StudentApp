package com.example.studentapp.repository.auth

import com.example.studentapp.api.services.AuthService
import com.example.studentapp.api.services.CuratorService
import com.example.studentapp.model.auth.LoginResult
import com.example.studentapp.model.user.User
import com.example.studentapp.utils.RxUtils
import io.reactivex.Single
import retrofit2.adapter.rxjava2.Result
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor() : AuthRepository {

    @Inject lateinit var authService: AuthService
    @Inject lateinit var curatorService: CuratorService

    override fun login(user: User): Single<Result<LoginResult>> {
        return authService
            .login(user)
            .compose(RxUtils.asyncSingle())
    }

    override fun logout(): Single<Result<Void>> {
        return curatorService
            .logout()
            .compose(RxUtils.asyncSingle())
    }
}
