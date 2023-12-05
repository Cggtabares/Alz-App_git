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
    ) {
        composable(AppScreens.SelectionScreen.name) {
            //LoginScreen(navController = navController)
        }
        composable(AppScreens.LoginScreen.name) {
            //IngresarScreen(navController = navController)
        }
        composable(AppScreens.CreateAccountScreen.name) {
            //CreateAccountScreen(navController = navController)
        }
        //if (user.type == "Paciente") {
        composable(AppScreens.ProfilePatientsScreen.name) {
            //ProfilePatientsScreen(navController = navController)
        }
        //} else{
                composable(AppScreens.PatientListScreen.name) {
                    //PatientListScreen(navController = navController)
                }

        //}
        composable(AppScreens.ProfileCareGiversScreen.name) {
            //ProfileCareGiversScreen(navController = navController)
        }
        composable(AppScreens.NotificationsCareGiversProfileScreen.name) {
            //NotificationsTCareGiversProfileScreen(navController = navController)
        }
        composable(AppScreens.ProfileCareGiversSelectedScreen.name) {
            //ProfileCareGiversSelectedScreen(navController = navController)
        }


    }
}





/*



if (user.type == "Paciente"){
    PacientProfileScreen()
    }
    else{
        PatientList ()
    }
 */