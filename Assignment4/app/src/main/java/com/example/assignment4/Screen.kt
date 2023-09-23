package com.example.assignment4

sealed class Screen(val route:String){
    object Home:Screen(route="home_screen")
    object Res:Screen(route="restaurant_screen")
    object Res1:Screen(route="res1_screen")
    object Res2:Screen(route="res2_screen")
    object Res3:Screen(route="res3_screen")


}
