package com.example.alz_app.CareGiverScreen

//Pantalla Home de Cuidador que aparecera al iniciar sesion, aqui se podra ver la lista de pacientes
//asignados al cuidador, asi como la ubicacion de cada uno de ellos


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDefaults.contentColor
import androidx.compose.material3.TabRowDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CareGiverHomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar()
        },
        floatingActionButton =  {
            FloatingActionButton()
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
                        IconButton(onClick = {
                            //navController.navigate(AppScreens.ProfilePatientsScreen.name)
                            //esta funcion debe llevar a la pantalla de perfil del paciente
                        }) {
                            Icon(
                                imageVector = Icons.Filled.AccountCircle,
                                contentDescription = "Account", Modifier.size(200.dp),
                            )
                        }
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Jane Doe", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Bailey Gonzalez", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Jorge Fernandez", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Marina Andrade", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Iris Machado", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Benjamin Mejias", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Jane Doe", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Baldwin Green", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

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
                        Column(
                            Modifier.padding(start = 8.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text("Bambi Cierva", Modifier.padding(bottom = 4.dp))
                            Text("Joe Doe")

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun FloatingActionButton() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        shape = CircleShape,
        containerColor = Color.DarkGray,
        contentColor = Color.White,
        //backgroundColor = MaterialTheme.colors.primary,
        //elevation = FloatingActionButtonDefaults.elevation(8.dp),
        content = {
            Icon(
                imageVector = Icons.Filled.Notifications,
                contentDescription = "Notifications",
                modifier = Modifier.size(50.dp)
            )
        }
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar() {
    TopAppBar(
        title = {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.size(50.dp))
               /* IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back",
                        Modifier.size(150.dp)
                    )
                }*/
                Text("Lista de Pacientes")
                Spacer(modifier = Modifier.size(80.dp))
                IconButton(onClick = {
                    //navController.navigate(AppScreens.ProfileCareGiversScreen.name)
                }) {
                    Icon(
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "Account", Modifier.fillMaxSize()//.size(100.dp),
                    )
                }

            }
        })
}




@Preview(showBackground = true)
@Composable
fun PatientListAdminHomePreview() {
    CareGiverHomeScreen()
}