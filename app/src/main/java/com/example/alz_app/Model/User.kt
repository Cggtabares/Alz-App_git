package com.example.alz_app.Model

import android.location.Location

data class User(
    val uid: String,
    val name: String,
    val lastName: String,
    val email: String,
    val phone: Int,
    val type: String,
    val location: Location,
    val cuidadorId: String,

){

}
