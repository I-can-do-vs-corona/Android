package com.voitheia.domain.user

import com.voitheia.api.model.RegisterUserDTO
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

class RegisterUser: AbstractBackendApi() {

    fun execute(registerUserDTO: RegisterUserDTO): Completable {
        return Completable.defer {
            Flowable.just(registerUserDTO)
                .observeOn(Schedulers.io())
                .map { userApi.apiUserRegisterPost(it) }
                .ignoreElements()
        }
    }
}