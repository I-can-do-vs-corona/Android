package com.voitheia.domain.task

import com.voitheia.api.RequestApi
import com.voitheia.api.model.CreateRequestDto
import com.voitheia.api.model.CreateRequestResponseDto
import com.voitheia.api.model.TakeRequestDto
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class CreateTask: AbstractBackendApi() {

    fun execute(createRequestDto: CreateRequestDto): Flowable<CreateRequestResponseDto> {
        return Flowable.defer {
            Flowable.just(createRequestDto)
                .observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .map {
                    requestApi.requestPost(it)
                }.doOnNext {
                    myRequestsApi.myRequestsPost(TakeRequestDto(it.id))
                }
        }
    }
}