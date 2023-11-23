package com.example.alz_app.LoginScreens

import androidx.lifecycle.ViewModel
import com.example.alz_app.Model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class MainViewModel(
    private val firebaseAuth: FirebaseAuth,
    private val firestore: FirebaseFirestore
): ViewModel() {

    fun createNewUser(user : User){

        val collection = when(user.type){
            "Paciente" -> "pacientes"
            "Cuidador" -> "cuidadores"
            else -> null
        }

    }

}