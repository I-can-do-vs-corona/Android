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
 * @param type 
 * @param title 
 * @param status 
 * @param detail 
 * @param instance 
 */

data class ProblemDetails (
    @Json(name = "type")
    val type: kotlin.String? = null,
    @Json(name = "title")
    val title: kotlin.String? = null,
    @Json(name = "status")
    val status: kotlin.Int? = null,
    @Json(name = "detail")
    val detail: kotlin.String? = null,
    @Json(name = "instance")
    val instance: kotlin.String? = null
) 



