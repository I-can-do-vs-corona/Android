# RequestApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**requestGet**](RequestApi.md#requestGet) | **GET** /Request | Get all requests in a specific area if longitude and latitude is not given,  the registered address of the user is taken
[**requestIdDelete**](RequestApi.md#requestIdDelete) | **DELETE** /Request/{id} | Removes a request from the Database
[**requestIdGet**](RequestApi.md#requestIdGet) | **GET** /Request/{id} | Get request by id
[**requestPost**](RequestApi.md#requestPost) | **POST** /Request | Inserts a request to the database  Returns 201 if success  Returns 400 if the Request dto was malformed  Returns 424 if the Address was invalid


<a name="requestGet"></a>
# **requestGet**
> GetAllRequestResponse requestGet(longitude, latitude, amount, metersPerimeter)

Get all requests in a specific area if longitude and latitude is not given,  the registered address of the user is taken

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = RequestApi()
val longitude : kotlin.Double = 1.2 // kotlin.Double | Longitude in degrees, if this is not passed, the users address is taken
val latitude : kotlin.Double = 1.2 // kotlin.Double | Latitude in degrees, if this is not passed, the users address is taken
val amount : kotlin.Int = 56 // kotlin.Int | How many requests to retrieve
val metersPerimeter : kotlin.Int = 56 // kotlin.Int | Which perimeter should be kept in considoration
try {
    val result : GetAllRequestResponse = apiInstance.requestGet(longitude, latitude, amount, metersPerimeter)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestApi#requestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestApi#requestGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **kotlin.Double**| Longitude in degrees, if this is not passed, the users address is taken | [optional]
 **latitude** | **kotlin.Double**| Latitude in degrees, if this is not passed, the users address is taken | [optional]
 **amount** | **kotlin.Int**| How many requests to retrieve | [optional] [default to 10]
 **metersPerimeter** | **kotlin.Int**| Which perimeter should be kept in considoration | [optional] [default to 2000]

### Return type

**GetAllRequestResponse**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="requestIdDelete"></a>
# **requestIdDelete**
> requestIdDelete(id)

Removes a request from the Database

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = RequestApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.requestIdDelete(id)
} catch (e: ClientException) {
    println("4xx response calling RequestApi#requestIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestApi#requestIdDelete")
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

<a name="requestIdGet"></a>
# **requestIdGet**
> GetRequestResponse requestIdGet(id)

Get request by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = RequestApi()
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    val result : GetRequestResponse = apiInstance.requestIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestApi#requestIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestApi#requestIdGet")
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

<a name="requestPost"></a>
# **requestPost**
> CreateRequestResponseDto requestPost(createRequestDto)

Inserts a request to the database  Returns 201 if success  Returns 400 if the Request dto was malformed  Returns 424 if the Address was invalid

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = RequestApi()
val createRequestDto : CreateRequestDto =  // CreateRequestDto | 
try {
    val result : CreateRequestResponseDto = apiInstance.requestPost(createRequestDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequestApi#requestPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestApi#requestPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createRequestDto** | **CreateRequestDto**|  | [optional]

### Return type

**CreateRequestResponseDto**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

