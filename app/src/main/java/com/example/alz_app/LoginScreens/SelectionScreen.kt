package com.example.alz_app.LoginScreens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.alz_app.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() { //se debe agregar navController: NavHostController

        Scaffold(
            //topBar = { TopAppBar(title = { Text("") }) },
        ) { innerPadding ->
            Box() {
                Image(
                    painter = painterResource(R.drawable.oldies),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop,
                    alpha = 0.5f

                )
            Column(
                Modifier
                    .padding(innerPadding)
                    .fillMaxWidth()
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Image(
                    painter = painterResource(id = R.drawable.alzlogo),
                    contentDescription = "Logo Alz-App", Modifier.size(200.dp),
                )
                Column(
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Button(
                        shape = RoundedCornerShape(10.dp), onClick = { /*TODO*/ },
                        modifier = Modifier.width(260.dp)
                    ) {
                        Text("Ingresar")
                    }
                    Button(
                        shape = RoundedCornerShape(10.dp), onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(260.dp)
                            .padding(top = 32.dp)
                    ) {
                        Text("Crear Cuenta")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen() //se debe agregar navController
}