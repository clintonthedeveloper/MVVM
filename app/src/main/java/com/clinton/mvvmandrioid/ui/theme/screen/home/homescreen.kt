package com.clinton.mvvmandrioid.ui.theme.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.clinton.mvvmandrioid.navigation.ROUTE_CALCULATOR
import com.clinton.mvvmandrioid.navigation.ROUTE_INTENT
import com.clinton.mvvmandrioid.navigation.ROUTE_LOGIN
import com.clinton.mvvmandrioid.navigation.ROUTE_REGISTER


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {  },


                    content = {   Column(modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White),


                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Top) {
                        Text(text = "clinton App",
                            color = Color.Black,
                            fontSize = 60.sp,
                            fontFamily = FontFamily.Cursive
                        )
                        Spacer(modifier = Modifier.height(50.dp))
                        Text(text = "This Is My First App",
                            color = Color.Black,
                            fontFamily = FontFamily.Monospace,
                            fontSize = 30.sp,
                        )
                        Spacer(modifier = Modifier.height(40.dp))
                        Button(onClick = { navController.navigate(ROUTE_LOGIN) },
                            modifier = Modifier.width(250.dp),
                            border = BorderStroke(5.dp,Color.Black)) {
                            Text(text = "login",
                                color = Color.Yellow,



                                )}
                        Spacer(modifier = Modifier.height(50.dp))
                        Button(onClick = { navController.navigate(ROUTE_REGISTER) },
                            modifier = Modifier.width(150.dp),
                            border = BorderStroke(5.dp, Color.Black)
                        ) {
                            Text(text = "Register",
                                color = Color.Yellow)

                        }
                        Spacer(modifier = Modifier.height(50.dp))
                        Button(onClick = { navController.navigate(ROUTE_CALCULATOR) },
                            modifier = Modifier.width(150.dp),
                            border = BorderStroke(5.dp, Color.Black)
                        ) {
                            Text(text = "Calculator",
                                color = Color.Yellow)

                        }
                        Spacer(modifier = Modifier.height(50.dp))
                        Button(onClick = { navController.navigate(ROUTE_INTENT )},
                            modifier = Modifier.width(150.dp),
                            border = BorderStroke(5.dp, Color.Black)
                        ) {
                            Text(text = "Intent",
                                color = Color.Yellow)

                        }



                    }
                    },
                        bottomBar = { BottomBar(navController) }
                            )





        }
@Composable
fun BottomBar(navController:NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            onClick = {
                selectedIndex.value = 0
                navController.navigate(ROUTE_REGISTER)
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "Favorite") },
            selected = (selectedIndex.value == 1),
            onClick = {
                selectedIndex.value = 1

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person,"")
        },
            label = { Text(text = "Profile") },
            selected = (selectedIndex.value == 2),
            onClick = {
                selectedIndex.value = 2
            })
    }
}


    


@Preview
@Composable
private fun Homeprev() {
    HomeScreen(rememberNavController())

}