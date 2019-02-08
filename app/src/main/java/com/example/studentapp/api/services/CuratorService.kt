package com.example.studentapp.api.services

import com.example.studentapp.model.user.Curator
import io.reactivex.Single
import retrofit2.adapter.rxjava2.Result
import retrofit2.http.*

interface CuratorService {

    @POST("logout")
    fun logout(): Single<Result<Void>>

    @GET("curators/{curator_id}")
    fun findById(
        @Path(value = "curator_id") id: String
    ): Single<Result<Curator>>

    @GET("curators")
    fun findAll(): Single<Result<List<Curator>>>

    @PUT("curators/{curator_id}")
    fun update(
        @Path(value = "curator_id") id: String,
        @Body curator: Curator
    ): Single<Result<Curator>>

}