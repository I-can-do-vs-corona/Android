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
 * 
 * @param email 
 * @param firstName 
 * @param lastName 
 * @param password 
 * @param street 
 * @param city 
 * @param country 
 * @param zip 
 */

data class RegisterUserDTO (
    @Json(name = "email")
    val email: kotlin.String,
    @Json(name = "firstName")
    val firstName: kotlin.String,
    @Json(name = "lastName")
    val lastName: kotlin.String,
    @Json(name = "password")
    val password: kotlin.String,
    @Json(name = "street")
    val street: kotlin.String,
    @Json(name = "city")
    val city: kotlin.String,
    @Json(name = "country")
    val country: kotlin.String,
    @Json(name = "zip")
    val zip: kotlin.String? = null
) 



