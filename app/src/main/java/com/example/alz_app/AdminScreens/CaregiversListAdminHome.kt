package com.example.alz_app.AdminScreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaregiversListAdminHomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Cuidadores")
                    Spacer(modifier = Modifier.size(32.dp))
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = "Account", Modifier.fillMaxSize()//.size(100.dp),
                        )
                    }
                }
            })
        },
    ) { innerPadding ->
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxSize()
        ) {
            item {  //esta lista debe ser llanada desde la base de datos y colocando una funcion que llene esta lista, donde solo habra un itempero que de ahi se multiplicara
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                ) {
                    Row {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

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
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(Modifier.padding(start = 8.dp), verticalArrangement = Arrangement.Center) {
                            Text("Nombre Apellido Cuidador", Modifier.padding(bottom = 4.dp), )
                            Text("Numero de pacientes asignados")

                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CaregiversListAdminHomePreview() {
    CaregiversListAdminHomeScreen()
}