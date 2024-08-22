package com.clinton.mvvmandrioid.ui.theme.screen.Register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.clinton.mvvmandrioid.navigation.ROUTE_HOME
import com.clinton.mvvmandrioid.navigation.ROUTE_LOGIN

@Composable
fun RegisterScreen(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpass by remember { mutableStateOf("") }
    var isRegistration by remember { mutableStateOf(true) }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(Color.White),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Register",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 24.dp))


        OutlinedTextField(value =name,
            onValueChange = {name=it},
            label = { Text(text ="name")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))

        OutlinedTextField(value =email,
            onValueChange = {email=it},
            label = { Text(text ="email")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))

        OutlinedTextField(value =password,
            onValueChange = {password=it},
            label = { Text(text ="password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))

        OutlinedTextField(value =confirmpass,
            onValueChange = {confirmpass=it},
            label = { Text(text ="confirm pass")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp))

        Button(onClick = { navController.navigate(ROUTE_HOME)},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()) {
            Text(text = "Register")

        }
        TextButton(onClick = { navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Already have an account")

        }









}



}

@Preview
@Composable
private fun Registerprev() {
    RegisterScreen(rememberNavController())

}