package com.example.alz_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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
fun IngresarScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Ingresar") }) },
    ) { innerPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .fillMaxSize()
        ) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.alzlogo),
                    contentDescription = "Logo Alz-App", Modifier.size(200.dp),
                )
            }
            item {
                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text("Correo electrónico") }
                )
            }
            item {
                Spacer(modifier = Modifier.size(16.dp))
            }
            item {
                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text("Contraseña") },
                )
            }
            item {
                Button(
                    shape = RoundedCornerShape(10.dp),
                    onClick = { /* Submit form */ },
                    content = { Text("Ingresar") },
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
fun IngresarScreenPreview() {
    IngresarScreen()
}


