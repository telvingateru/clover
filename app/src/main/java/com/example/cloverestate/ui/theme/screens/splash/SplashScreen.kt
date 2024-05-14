package com.example.cloverestate.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.R
import com.example.cloverestate.navigation.LOGIN_URL
import com.example.cloverestate.ui.theme.Orange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController){

    androidx.compose.foundation.layout.Column (modifier = Modifier
        .background(Orange)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,) {

        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(6000)
            navController.navigate(LOGIN_URL)

        }


        Row {
            Box(modifier = Modifier.size(50.dp)) {
                Image(painter = painterResource(id = R.drawable.realestatesplash),
                    contentDescription ="",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(shape = CircleShape))

            }



            Text(
                text = "CloverEstate",
                fontSize = 40.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(start = 20.dp)
            )
        }



    }
}
@Preview(showBackground = true)
@Composable
fun splashscreenpreview(){
    SplashScreen(rememberNavController())
}