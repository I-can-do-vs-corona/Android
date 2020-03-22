/**
* Voitheia API
* Api for Voitheia. Developed for the WeVsVirus hackathon
*
* The version of the OpenAPI document: v1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.voitheia.api.model


import com.squareup.moshi.Json

/**
* The type of the request
* Values: shopping,childcare,medical,petcare,other
*/

enum class RequestType(val value: kotlin.String){


    @Json(name = "Shopping")
    shopping("Shopping"),


    @Json(name = "Childcare")
    childcare("Childcare"),


    @Json(name = "Medical")
    medical("Medical"),


    @Json(name = "Petcare")
    petcare("Petcare"),


    @Json(name = "Other")
    other("Other");



}

