package com.voitheia.domain.task

import com.voitheia.api.model.RequestDto
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class GetMyTasks: AbstractBackendApi() {

    fun execute(): Flowable<Array<RequestDto>> {
        return Flowable.defer {
            Flowable.just("tick")
                .observeOn(Schedulers.io())
                .map { myRequestsApi.myRequestsGet().requests }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(AndroidSchedulers.mainThread())
        }
    }

}