package com.example.cloverestate.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.ui.theme.screens.about.AboutScreen
import com.example.cloverestate.ui.theme.screens.home.HomeScreen
import com.example.cloverestate.ui.theme.screens.login.LoginScreen
import com.example.cloverestate.ui.theme.screens.map.Room2screen
uuuuuuuuuimport com.example.cloverestate.ui.theme.screens.notification.NotificationScreen
import com.example.cloverestate.ui.theme.screens.products.AddProductsScreen
import com.example.cloverestate.ui.theme.screens.products.ViewProductsScreen
import com.example.cloverestate.ui.theme.screens.rent.RentScreen
import com.example.cloverestate.ui.theme.screens.signup.SignupScreen
import com.example.cloverestate.ui.theme.screens.splash.SplashScreen
import com.example.cloverestate.ui.theme.screens.room1.Room1Screen
import com.example.cloverestate.ui.theme.screens.room3.Room3Screen
import com.example.realeatate.ui.theme.screens.buy.BuyScreen
import com.example.realestate.ui.theme.screens.mpesa.MpesaScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = LOGIN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }

        composable(ROUT_BUY){
            BuyScreen(navController = navController)
        }
        composable(ROUT_SPLASH){
            SplashScreen(navController = navController)

        }
        composable(ROUT_RENT){
            RentScreen(navController = navController)

        }
        composable(ROUT_MPESA){
            MpesaScreen(navController = navController)

        }
        composable(ROUT_NOTIFICATION){
            NotificationScreen(navController = navController)

        }
        composable(ROUT_ROOM1){
            Room1Screen(navController = navController)

        }
        composable(ROUT_ROOM2){
            Room2screen(navController = navController)

        }
        composable(ROUT_ROOM3){
            Room3Screen(navController = navController)

        }

        composable(ROUT_ABOUT){
            AboutScreen(navController = navController)

        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
    }
}


