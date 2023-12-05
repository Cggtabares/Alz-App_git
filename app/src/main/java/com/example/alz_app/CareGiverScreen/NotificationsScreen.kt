package com.example.alz_app.CareGiverScreen

//Pantalla Home de Cuidador que aparecera al iniciar sesion, aqui se podra ver la lista de pacientes
//asignados al cuidador, asi como la ubicacion de cada uno de ellos


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen() {
    Scaffold(
        topBar = {
            TopAppBa()
        },
    ) { innerPadding ->
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxSize()
        ) {
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                ) {
                    Row {
                        Column(
                            Modifier.padding(start = 16.dp).height(60.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("El Paciente Iris Machado ha salido de la zona segura", Modifier.padding(bottom = 4.dp), maxLines = 2)


                        }
                    }
                }
            }
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                ) {
                    Row {
                       Column(
                            Modifier.padding(start = 16.dp).height(60.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("El Paciente Marina Andrade ha salido de la zona segura", Modifier.padding(bottom = 4.dp), maxLines = 2)


                        }
                    }
                }
            }
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                ) {
                    Row {
                        Column(
                            Modifier.padding(start = 16.dp).height(60.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("El Paciente Jorge Fernandez ha salido de la zona segura", Modifier.padding(bottom = 4.dp), maxLines = 2)

                        }
                    }
                }
            }
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                ) {
                    Row {
                        Column(
                            Modifier.padding(start = 16.dp).height(60.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("El Paciente Bailey Gonzalez ha salido de la zona segura", Modifier.padding(bottom = 4.dp), maxLines = 2)


                        }
                    }
                }
            }
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                ) {
                    Row {
                        Column(
                            Modifier.padding(start = 16.dp).height(60.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("El Paciente Jane Doe ha salido de la zona segura", Modifier.padding(bottom = 4.dp), maxLines = 2)

                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBa() {
    TopAppBar(
        title = {
            Text(
                text = "Notificaciones",
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(16.dp)
            )
        },
        //colors = TopAppBarDefaults.smallTopAppBarColors(
        //titleContentColor = Color.White,
        //navigationIconContentColor = Color.White,
        //actionIconContentColor = Color.White//),
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    Modifier.size(150.dp)
                )
            }
        },
    )

}


@Preview(showBackground = true)
@Composable
fun NotificationsScreenPreview() {
    NotificationScreen()
}