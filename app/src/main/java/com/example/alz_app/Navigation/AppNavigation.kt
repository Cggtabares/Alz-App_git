package com.example.alz_app.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.alz_app.LoginScreens.IngresarScreen
import com.example.alz_app.LoginScreens.LoginScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = AppScreens.SelectionScreen.name
    ){
        composable(AppScreens.SelectionScreen.name){
            //LoginScreen(navController = navController)
        }
        composable(AppScreens.LoginScreen.name){
            //IngresarScreen(navController = navController)
        }


    }
}