package com.example.alz_app.LoginScreens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.maps.model.CameraPosition
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateAccountScreen(MainViewModel: MainViewModel ) {
    val name: String by MainViewModel.name.observeAsState(initial = "")
    val lastname: String by MainViewModel.lastname.observeAsState(initial = "")

    val email : String by MainViewModel.email.observeAsState(initial ="")
    val password : String by MainViewModel.password.observeAsState(initial ="")

    val phone: String by MainViewModel.phone.observeAsState(initial = "")
    val type: String by MainViewModel.type.observeAsState(initial = "")
    var location by rememberSaveable { mutableStateOf("") }

    val isCreateEnable:Boolean by MainViewModel.isCreateEnable.observeAsState(initial = false)





    Scaffold(
        topBar = { MyTopAppBarCreateAccount() },
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
                FieldCreateName(name = name, onTextChanged = { MainViewModel.onCreateAccountChange(email = email, password = password, name = it, lastname = lastname, phone = phone, type = type) })

            }
            item {
                FieldCreateLastName(lastname = lastname, onTextChanged = { MainViewModel.onCreateAccountChange(email = email, password = password, name = name, lastname = it, phone = phone, type = type) })

            }
            item {
                FieldCreateEmail(email = email, onTextChanged = { MainViewModel.onCreateAccountChange(email = it, password = password, name = name, lastname = lastname, phone = phone, type = type)})

            }
            item {
                FieldCreatePassword(password = password, onTextChanged = { MainViewModel.onCreateAccountChange(email = email, password = it, name = name, lastname = lastname, phone = phone, type = type) })

            }
            item {
                FieldCreatePhone(phone = phone, onTextChanged = { MainViewModel.onCreateAccountChange(email = email, password = password, name = name, lastname = lastname, phone = it, type = type) })

            }
            item {
                FieldCreateTypeDropdownMenu(type = type, onUpdateType = { newType -> MainViewModel.onUpdateType(newType) })
            }
            item{
                //AcquireLocationButton()
            }
            item {
                FieldCreateGoogleMap(location = location)
            }

            item {

                CreateAccountButton(isCreateEnable = isCreateEnable, onClic = {MainViewModel.createUser(email = email, password = password)})
            }
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBarCreateAccount() {
    TopAppBar(
        title = {
            Text(
                text = "Crear Cuenta",
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
        }, actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Account",
                    Modifier.size(150.dp)
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldCreateName(name: String, onTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = name,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Nombre") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldCreateLastName(lastname: String, onTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = lastname,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Apellido") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),

        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldCreateEmail(email: String, onTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = email,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Correo Electronico") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),


        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldCreatePassword(password: String, onTextChanged: (String) -> Unit) {
    var passwordVisibility by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = password,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Contraseña") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        trailingIcon = {
            val imagen = if (passwordVisibility) {
                Icons.Filled.VisibilityOff
            } else {
                Icons.Filled.Visibility
            }
            IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                Icon(imageVector = imagen, contentDescription = "Password Visibility")

            }
        },
        visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),

        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldCreatePhone(phone: String, onTextChanged: (String) -> Unit) {
    OutlinedTextField(
        value = phone,
        onValueChange = { onTextChanged(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Telefono") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),

        )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FieldCreateTypeDropdownMenu(type: String, onUpdateType: (String) -> Unit){

    var isExpanded by rememberSaveable { mutableStateOf(false) }
    var typeUser by rememberSaveable { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
        //.padding(top = 8.dp)
        , contentAlignment = Alignment.Center
    ) {
        ExposedDropdownMenuBox(expanded = isExpanded, onExpandedChange = { isExpanded = it }) {
            TextField(
                value = typeUser,
                onValueChange = {},
                readOnly = true,
                label = { Text("Tipo de usuario") },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                },
                colors = ExposedDropdownMenuDefaults.textFieldColors(),
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
            ExposedDropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = false }
            ) {
                DropdownMenuItem(
                    text = {
                        Text(text = "Paciente")
                    },
                    onClick = {
                        typeUser = "Paciente"
                        isExpanded = false
                        onUpdateType(typeUser)
                    }
                )
                DropdownMenuItem(
                    text = {
                        Text(text = "Cuidador")
                    },
                    onClick = {
                        typeUser = "Cuidador" // Update local state
                        isExpanded = false
                        onUpdateType(typeUser)
                    }
                )
            }
        }
    }
}

@Composable
fun AcquireLocationButton(onClic: () -> Unit){
    Button(
        shape = RoundedCornerShape(10.dp),
        onClick = onClic,
        content = {
            Text(
                "Obtener ubicacion",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )
        },
        //enabled = ,
        modifier = Modifier
            .fillMaxWidth(),
    )
}


@Composable
fun FieldCreateGoogleMap(location: String) {
    val location = com.google.android.gms.maps.model.LatLng(1.35, 103.87)
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


@Composable
fun CreateAccountButton(isCreateEnable: Boolean,
                        onClic: () -> Unit,
)
{
    Button(
        shape = RoundedCornerShape(10.dp),
        onClick = onClic,
        content = {
            Text(
                "Crear cuenta",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
            )
        },
        enabled = isCreateEnable,
        modifier = Modifier
            //.padding(top = 32.dp)
            .fillMaxWidth()
            .height(60.dp),
    )
}



@Preview(showBackground = true)
@Composable
fun CreateAccountScreenPreview() {
    //CreateAccountScreen()
}


