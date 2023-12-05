package com.example.alz_app.LoginScreens.ProfilePatientSelected

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.maps.model.CameraPosition
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState


@Composable
fun PacientProfileSelectedScreen() {

    Scaffold(
        topBar = { MyTopAppBarProfile() },
    ) { innerPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
                .fillMaxWidth()

        ) {

            item {
                NameField()
            }
            item {
                LastNameField()
            }
            item {
                EmailField()
            }
            item {
                PhoneField()
            }
            item {
                CuidadorField()
            }
            item {
                MapField()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBarProfile() {
    TopAppBar(
        title = {
            Text(
                text = "Perfil Paciente",
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        },
        //colors = TopAppBarDefaults.smallTopAppBarColors(
        //titleContentColor = Color.White,
        //navigationIconContentColor = Color.White,
        //actionIconContentColor = Color.White//),
        navigationIcon = {
            IconButton(onClick = {
                //navController.navigate(AppScreens.PatientListScreen.name)
            }) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    Modifier.size(150.dp)
                )
            }
        },
    )
}

@Composable
fun NameField(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 16.dp, start = 8.dp)){
        Text(text = "Nombre Paciente:  Jane", fontSize = 20.sp)
    }
}

@Composable
fun LastNameField(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, start = 8.dp)){
        Text(text = "Apellido Paciente:  Doe", fontSize = 20.sp)
    }
}

@Composable
fun EmailField(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, start = 8.dp)){
        Text(text = "Correo Paciente:  JaneDoe@CORREO.COM", fontSize = 20.sp)
    }
}

@Composable
fun PhoneField(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, start = 8.dp)){
        Text(text = "Telefono Paciente:  04145555555", fontSize = 20.sp)
    }
}

@Composable
fun CuidadorField(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 8.dp, start = 8.dp)){
        Text(text = "Cuidador Paciente:  Joe Doe", fontSize = 20.sp)
    }
}

@Composable
fun MapField(){
    val location = com.google.android.gms.maps.model.LatLng(10.46855, -66.9727669)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(location, 10f)
    }
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(300.dp)){
        GoogleMap(
            modifier = Modifier,
            cameraPositionState = cameraPositionState,
            //properties = MapProperties(isMyLocationEnabled = true)
        ){
            Marker(
                state = MarkerState(position = location),
                title = "Singapore")
        }
    }
}

@Preview
@Composable
fun PreviewProfileScreen() {
    PacientProfileSelectedScreen()
}