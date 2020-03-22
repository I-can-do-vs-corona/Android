# org.openapitools.client - Kotlin client library for Voitheia API

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MyRequestsApi* | [**myRequestsGet**](docs/MyRequestsApi.md#myrequestsget) | **GET** /MyRequests | Get all requests assigned to the logged in user
*MyRequestsApi* | [**myRequestsIdDelete**](docs/MyRequestsApi.md#myrequestsiddelete) | **DELETE** /MyRequests/{id} | Cancel a previously taken request
*MyRequestsApi* | [**myRequestsIdGet**](docs/MyRequestsApi.md#myrequestsidget) | **GET** /MyRequests/{id} | Get a specific request assigned to the logged in user
*MyRequestsApi* | [**myRequestsIdPatch**](docs/MyRequestsApi.md#myrequestsidpatch) | **PATCH** /MyRequests/{id} | Updates the status of a request. Currently only close is supported
*MyRequestsApi* | [**myRequestsPost**](docs/MyRequestsApi.md#myrequestspost) | **POST** /MyRequests | Add a request to the users personal request list.
*RequestApi* | [**requestGet**](docs/RequestApi.md#requestget) | **GET** /Request | Get all requests in a specific area if longitude and latitude is not given,  the registered address of the user is taken
*RequestApi* | [**requestIdDelete**](docs/RequestApi.md#requestiddelete) | **DELETE** /Request/{id} | Removes a request from the Database
*RequestApi* | [**requestIdGet**](docs/RequestApi.md#requestidget) | **GET** /Request/{id} | Get request by id
*RequestApi* | [**requestPost**](docs/RequestApi.md#requestpost) | **POST** /Request | Inserts a request to the database  Returns 201 if success  Returns 400 if the Request dto was malformed  Returns 424 if the Address was invalid
*UserApi* | [**apiUserLoggedInGet**](docs/UserApi.md#apiuserloggedinget) | **GET** /api/User/LoggedIn | Indicates whether or not a User is logged in
*UserApi* | [**apiUserLoginPost**](docs/UserApi.md#apiuserloginpost) | **POST** /api/User/Login | 
*UserApi* | [**apiUserRegisterPost**](docs/UserApi.md#apiuserregisterpost) | **POST** /api/User/Register | 



<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="bearerAuth"></a>
### bearerAuth

- **Type**: HTTP basic authentication

