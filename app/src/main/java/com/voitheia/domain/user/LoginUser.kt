package com.voitheia.domain.user

import com.voitheia.api.model.CredentialsDTO
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.openapitools.client.infrastructure.ApiClient

class LoginUser : AbstractBackendApi() {

    fun execute(credentialsDTO: CredentialsDTO): Single<String> {
        return Single.defer {
            Single.just(credentialsDTO)
                .observeOn(Schedulers.io())
                .map { userApi.apiUserLoginPost(it).token!! }
                .doOnSuccess { ApiClient.accessToken = it }
                .observeOn(AndroidSchedulers.mainThread())
        }
    }
}