package com.example.assignment4

import DishPage
import HomePage
import LoginPage
import RestaurantCard
import SignupPage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment4.ui.theme.Assignment4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            Assignment4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenMain();
                }
            }
        }
    }
}

@Composable
fun ScreenMain(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Signup.route) {
            SignupPage(navController = navController)
        }
        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }
        composable(Routes.Home.route) {
            HomePage(navController = navController)
        }
        composable(Routes.Dish.route) {
            DishPage()
        }
        composable(Routes.Restaurant.route) {
            RestaurantCard(navController = navController)
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment4Theme {
        ScreenMain();
    }
}