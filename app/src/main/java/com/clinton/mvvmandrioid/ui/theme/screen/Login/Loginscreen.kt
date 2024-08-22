package com.clinton.mvvmandrioid.ui.theme.screen.Login

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.clinton.mvvmandrioid.navigation.ROUTE_HOME
import com.clinton.mvvmandrioid.navigation.ROUTE_REGISTER
import com.clinton.mvvmandrioid.ui.theme.screen.home.BottomBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Loginscreen(navController: NavHostController) {

    Scaffold(
        topBar = { TopAppBar(title = { Text("MIT MVVM 2024",
            color = Color.Blue,
            fontSize = 25.sp)})},
        content = {  var name by remember { mutableStateOf("") }
            var email by remember { mutableStateOf("") }


            Column (horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)){
                Text(text = "Login Here",
                    color = Color.DarkGray,
                    fontSize = 25.sp,
                    fontFamily = FontFamily.Cursive)

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

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()) {
                    Text(text = "Login")

                }
                TextButton(onClick = { navController.navigate(ROUTE_HOME) } ,
                    modifier = Modifier.width(200.dp)) {

                    Text(text = "Forgot password")


                }
                Button(onClick = {navController.navigate(ROUTE_REGISTER)} ,
                    modifier = Modifier.width(150.dp)) {
                    Text(text = "Register here!")

                }



            }},
        bottomBar = { BottomBar(navController)}
                            )




}

@Preview
@Composable
private fun Loginprev() {
    Loginscreen(rememberNavController())

}


