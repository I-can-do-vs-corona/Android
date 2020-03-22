package com.voitheia.domain.user

import com.voitheia.api.MyRequestsApi
import com.voitheia.api.RequestApi
import com.voitheia.api.UserApi

abstract class AbstractBackendApi(val userApi: UserApi = UserApi("https://activecruzer.azurewebsites.net/")) {
}