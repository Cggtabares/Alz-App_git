package com.example.alz_app.Model

import android.location.Location

data class User(
    val uid: String,
    val name: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val type: String,
    val firstlocation: Location?,
    val cuidadorId: String?,
    val lastLocation: Location?

){

    fun toMap(): MutableMap<String, Any?>{
        return mutableMapOf(
            "uid" to this.uid,
            "name" to this.name,
            "lastName" to this.lastName,
            "email" to this.email,
            "phone" to this.phone,
            "type" to this.type,
            "location" to this.firstlocation,
            "lastLocation" to this.lastLocation,
            "cuidadorId" to this.cuidadorId
        )


    }





}