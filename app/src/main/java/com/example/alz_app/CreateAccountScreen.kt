package com.example.alz_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Crear cuenta") }) },
    ){
        innerPadding -> LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(innerPadding).fillMaxWidth().fillMaxSize()
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
                label = { Text("Contraseña") },
            )
        }
        item {
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text("Repetir contraseña") },
            )
        }
        item {
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text("Código postal") },
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
                content = { Text("Crear cuenta")},
                    modifier =Modifier.width(260.dp),
            )
        }
    }
    }
}


@Preview(showBackground = true)
@Composable
fun CreateAccountScreenPreview() {
    CreateAccountScreen()
}



