package com.example.assignment4

sealed class Routes(val route: String) {
    object Login : Routes("Login")
    object Signup : Routes("Signup")
    object Home : Routes("Home")
    object Dish : Routes("Dish")
    object Restaurant : Routes("Restaurant")
}