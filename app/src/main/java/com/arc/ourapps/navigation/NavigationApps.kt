package com.arc.ourapps.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arc.ourapps.screen.LoginScreen
import com.arc.ourapps.screen.MainScreen
import com.arc.ourapps.screen.RegisterScreen
import com.arc.ourapps.screen.detail.*

@Composable
fun NavigationApps() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.LoginScreen.name
    ){
        composable(NavigationRoute.LoginScreen.name){
            LoginScreen(navController)
        }
        composable(NavigationRoute.RegisterScreen.name){
            RegisterScreen(navController)
        }
        composable(NavigationRoute.MainScreen.name){
            MainScreen(navController)
        }
        //The Lord Of The Rings
        composable(NavigationRoute.TheLordOfTheRingsA.name){
            TheLordOfTheRingsA(navController)
        }
        composable(NavigationRoute.TheLordOfTheRingsB.name){
            TheLordOfTheRingsB(navController)
        }
        composable(NavigationRoute.TheLordOfTheRingsC.name){
            TheLordOfTheRingsC(navController)
        }
        //The Hobbit
        composable(NavigationRoute.TheHobbitA.name){
            TheHobbitA(navController)
        }
        composable(NavigationRoute.TheHobbitB.name){
            TheHobbitB(navController)
        }
        composable(NavigationRoute.TheHobbitC.name){
            TheHobbitC(navController)
        }
    }
}