package com.example.studentapp.repository.curator

import com.example.studentapp.api.services.CuratorService
import com.example.studentapp.model.user.Curator
import com.example.studentapp.utils.RxUtils
import io.reactivex.Single
import retrofit2.adapter.rxjava2.Result
import javax.inject.Inject

class CuratorRepositoryImpl @Inject constructor() :
    CuratorRepository {

    override lateinit var currentCurator: Curator

    @Inject lateinit var apiService: CuratorService

    override fun findById(id: String): Single<Result<Curator>> {
        return apiService.findById(id).compose(RxUtils.asyncSingle())
    }

    override fun findAll(): Single<Result<List<Curator>>> {
        return apiService.findAll().compose(RxUtils.asyncSingle())
    }

    override fun update(id: String, curator: Curator): Single<Result<Curator>> {
        return apiService.update(id, curator).compose(RxUtils.asyncSingle())
    }

}