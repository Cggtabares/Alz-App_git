package com.example.alz_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsPatientAdminHomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Row(horizontalArrangement = Arrangement.End,) {
                    Text("Nombre Apellido U1")
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
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxSize()
        ) {
                    item {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text("Nombre") },
                        )
                    }
                    item {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text("Apellido") },
                        )
                    }
                    item {
                      //dropdownlist
                    }
                    item {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text("Correo electrónico") },
                        )
                    }
                    item {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text("Teléfono") },
                        )
                    }
                    item {
                        OutlinedTextField(
                            value = "",
                            onValueChange = { },
                            label = { Text("Dirección") },
                        )
                    }
                    item {
                        Button(
                            shape = RoundedCornerShape(10.dp),
                            onClick = { /* Submit form */ },
                            content = { Text("Aceptar") },
                            modifier = Modifier
                                .width(260.dp)
                                .padding(top = 32.dp)
                        )
                    }

                }
            }
        }




@Preview(showBackground = true)
@Composable
fun DetailsPatientAdminHomeScreenPreview() {
    DetailsPatientAdminHomeScreen()
}