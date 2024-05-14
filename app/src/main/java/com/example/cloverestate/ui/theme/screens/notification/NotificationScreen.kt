package com.example.cloverestate.ui.theme.screens.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.ui.theme.Orange

@Composable
fun NotificationScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize().background(Orange), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

    }

}
@Preview(showBackground = true)
@Composable
fun notificationscreenpreview(){
    NotificationScreen(rememberNavController())
}