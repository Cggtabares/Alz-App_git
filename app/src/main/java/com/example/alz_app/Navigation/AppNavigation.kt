package com.example.alz_app.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = AppScreens.CreateUserScreen.name
    ){
        composable(AppScreens.CreateUserScreen.name){
            //CreateAccountScreen(navController = navController)
        }
        composable(AppScreens.LoginScreen.name){
            //AppLoginScreen(navController = navController)
        }

    }
}