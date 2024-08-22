package com.clinton.mvvmandrioid.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.navigation.NavDirections
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.clinton.mvvmandrioid.ui.theme.screen.Calculator.Calculatorscreen
import com.clinton.mvvmandrioid.ui.theme.screen.Login.Loginscreen
import com.clinton.mvvmandrioid.ui.theme.screen.Register.RegisterScreen

import com.clinton.mvvmandrioid.ui.theme.screen.home.HomeScreen
import com.clinton.mvvmandrioid.ui.theme.screen.intent.intentscreen
import com.clinton.mvvmandrioid.ui.theme.screen.intent.Simp

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController= rememberNavController(),startDirections:String= ROUTE_HOME) {

    NavHost(navController = navController,modifier=modifier, startDestination = startDirections,){

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            Loginscreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_CALCULATOR){
            Calculatorscreen(navController)}
        composable(ROUTE_INTENT){
            intentscreen(navController)
        }
        composable(ROUTE_SIMPLELIST){
            SimpileListView()
        }




    }

}