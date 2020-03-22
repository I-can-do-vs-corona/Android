# MyRequestsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**myRequestsGet**](MyRequestsApi.md#myRequestsGet) | **GET** /MyRequests | Get all requests assigned to the logged in user
[**myRequestsIdDelete**](MyRequestsApi.md#myRequestsIdDelete) | **DELETE** /MyRequests/{id} | Cancel a previously taken request
[**myRequestsIdGet**](MyRequestsApi.md#myRequestsIdGet) | **GET** /MyRequests/{id} | Get a specific request assigned to the logged in user
[**myRequestsIdPatch**](MyRequestsApi.md#myRequestsIdPatch) | **PATCH** /MyRequests/{id} | Updates the status of a request. Currently only close is supported
[**myRequestsPost**](MyRequestsApi.md#myRequestsPost) | **POST** /MyRequests | Add a request to the users personal request list.


<a name="myRequestsGet"></a>
# **myRequestsGet**
> GetAllRequestResponse myRequestsGet()

Get all requests assigned to the logged in user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = MyRequestsApi()
try {
    val result : GetAllRequestResponse = apiInstance.myRequestsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyRequestsApi#myRequestsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyRequestsApi#myRequestsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetAllRequestResponse**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="myRequestsIdDelete"></a>
# **myRequestsIdDelete**
> myRequestsIdDelete(id)

Cancel a previously taken request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = MyRequestsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.myRequestsIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling MyRequestsApi#myRequestsIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyRequestsApi#myRequestsIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="myRequestsIdGet"></a>
# **myRequestsIdGet**
> GetRequestResponse myRequestsIdGet(id)

Get a specific request assigned to the logged in user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = MyRequestsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetRequestResponse = apiInstance.myRequestsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MyRequestsApi#myRequestsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyRequestsApi#myRequestsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |

### Return type

**GetRequestResponse**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="myRequestsIdPatch"></a>
# **myRequestsIdPatch**
> myRequestsIdPatch(id, patchRequestDto)

Updates the status of a request. Currently only close is supported

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = MyRequestsApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val patchRequestDto : PatchRequestDto =  // PatchRequestDto | 
try {
    apiInstance.myRequestsIdPatch(id, patchRequestDto)
} catch (e: ClientException) {
    println("4xx response calling MyRequestsApi#myRequestsIdPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyRequestsApi#myRequestsIdPatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.Int**|  |
 **patchRequestDto** | **PatchRequestDto**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="myRequestsPost"></a>
# **myRequestsPost**
> myRequestsPost(takeRequestDto)

Add a request to the users personal request list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = MyRequestsApi()
val takeRequestDto : TakeRequestDto =  // TakeRequestDto | The required data to take a request. Right now only the request id
try {
    apiInstance.myRequestsPost(takeRequestDto)
} catch (e: ClientException) {
    println("4xx response calling MyRequestsApi#myRequestsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MyRequestsApi#myRequestsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **takeRequestDto** | **TakeRequestDto**| The required data to take a request. Right now only the request id | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

