# UserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiUserLoggedInGet**](UserApi.md#apiUserLoggedInGet) | **GET** /api/User/LoggedIn | Indicates whether or not a User is logged in
[**apiUserLoginPost**](UserApi.md#apiUserLoginPost) | **POST** /api/User/Login | 
[**apiUserRegisterPost**](UserApi.md#apiUserRegisterPost) | **POST** /api/User/Register | 


<a name="apiUserLoggedInGet"></a>
# **apiUserLoggedInGet**
> apiUserLoggedInGet()

Indicates whether or not a User is logged in

When the code reachis this function the user was successfully logged in through Windows authentication.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = UserApi()
try {
    apiInstance.apiUserLoggedInGet()
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiUserLoggedInGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiUserLoggedInGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiUserLoginPost"></a>
# **apiUserLoginPost**
> JwtDto apiUserLoginPost(credentialsDTO)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = UserApi()
val credentialsDTO : CredentialsDTO =  // CredentialsDTO | 
try {
    val result : JwtDto = apiInstance.apiUserLoginPost(credentialsDTO)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiUserLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiUserLoginPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentialsDTO** | **CredentialsDTO**|  | [optional]

### Return type

**JwtDto**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserRegisterPost"></a>
# **apiUserRegisterPost**
> JwtDto apiUserRegisterPost(registerUserDTO)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.voitheia.api.model.*

val apiInstance = UserApi()
val registerUserDTO : RegisterUserDTO =  // RegisterUserDTO | 
try {
    val result : JwtDto = apiInstance.apiUserRegisterPost(registerUserDTO)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#apiUserRegisterPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#apiUserRegisterPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerUserDTO** | **RegisterUserDTO**|  | [optional]

### Return type

**JwtDto**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/_*+json
 - **Accept**: text/plain, application/json, text/json

