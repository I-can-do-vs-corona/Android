package com.voitheia.domain.task

import io.reactivex.Completable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class RemoveMyTask : AbstractBackendApi() {

    fun execute(id: Int): Completable {
        return Completable.defer {
            Single.just(id)
                .observeOn(Schedulers.io())
                .map {
                    myRequestsApi.myRequestsIdDelete(it)
                }.ignoreElement()
        }
    }
}