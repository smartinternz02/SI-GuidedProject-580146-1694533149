package com.example.assignment4

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController:NavHostController
){
    NavHost(navController =navController,
        startDestination = Screen.Home.route
    ){
        composable(route=Screen.Home.route){
            HomeScreen(navController=navController)
        }
        composable(route=Screen.Res.route){
            Restaurant(navController=navController)
        }
        composable(route=Screen.Res1.route){
           Res1()
        }
        composable(route=Screen.Res2.route){
            Res2()
        }
        composable(route=Screen.Res3.route){
            Res3()
        }
    }
}