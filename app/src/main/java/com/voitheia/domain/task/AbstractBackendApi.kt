package com.voitheia.domain.task

import com.voitheia.api.MyRequestsApi
import com.voitheia.api.RequestApi

abstract class AbstractBackendApi(val requestApi: RequestApi = RequestApi("https://activecruzer.azurewebsites.net/"),
                                  val myRequestsApi: MyRequestsApi = MyRequestsApi("https://activecruzer.azurewebsites.net/")) {
}