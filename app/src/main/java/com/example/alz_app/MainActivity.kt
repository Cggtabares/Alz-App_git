package com.example.alz_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.alz_app.CareGiverScreen.CareGiverHomeScreen
import com.example.alz_app.CareGiverScreen.NotificationScreen
import com.example.alz_app.LoginScreens.CreateAccountScreen
import com.example.alz_app.LoginScreens.IngresarScreen
import com.example.alz_app.LoginScreens.LoginScreen
import com.example.alz_app.LoginScreens.MainViewModel
import com.example.alz_app.LoginScreens.ProfilePatient.PacientProfileScreen
import com.example.alz_app.LoginScreens.ProfilePatientSelected.PacientProfileSelectedScreen
import com.example.alz_app.Navigation.AppNavigation
import com.example.alz_app.Profile.CaregiverProfileScreen
import com.example.alz_app.ui.theme.AlzAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlzAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //PacientProfileScreen()
                    //CreateAccountScreen(MainViewModel())
                    //LoginScreen()
                    //IngresarScreen()
                    //PacientProfileScreen()
                    //CareGiverHomeScreen()
                    //PacientProfileSelectedScreen()
                    //CaregiverProfileScreen()
                    //NotificationScreen()
                    AppNavigation()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AlzAppTheme {
        //Greeting("Android")
    }
}