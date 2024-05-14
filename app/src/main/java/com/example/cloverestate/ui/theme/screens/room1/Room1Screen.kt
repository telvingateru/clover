package com.example.cloverestate.ui.theme.screens.room1

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.R
import com.example.cloverestate.navigation.ADD_PRODUCTS_URL
import com.example.cloverestate.navigation.HOME_URL
import com.example.cloverestate.navigation.LOGIN_URL
import com.example.cloverestate.navigation.ROUT_MPESA
import com.example.cloverestate.ui.theme.Orange
import com.example.cloverestate.ui.theme.screens.home.HomeScreen


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Room1Screen(navController: NavHostController) {

    BackHandler {
        navController . popBackStack()
    }
    Scaffold (

        topBar = {
                TopAppBar(
                        title = {
                            Text(text = "Clover Estates")
                        },
                        navigationIcon = {
                            IconButton(onClick = {
                                navController.navigate(HOME_URL) {
                                    popUpTo(ADD_PRODUCTS_URL) { inclusive = true }
                                }
                            }) {
                                Icon(
                                    Icons.Filled.ArrowBack,
                                    "backIcon",
                                    tint = Color.White
                                )
                            }
                        },


                        colors = topAppBarColors(
                            containerColor = Color(0xFFBEEBFF),


                            titleContentColor = Color.White,
                        ),
                    )
                },
        content = @Composable {

            Column(
                modifier = Modifier.fillMaxSize()
            ) {


                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                ) {
                    Spacer(modifier = Modifier.width(10.dp))
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.h2),
                            contentDescription = "house",
                            modifier = Modifier.size(width = 400.dp, height = 350.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.f),
                            contentDescription = "house",
                            modifier = Modifier.size(width = 300.dp, height = 250.dp),
                            contentScale = ContentScale.Crop
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.c),
                            contentDescription = "house",
                            modifier = Modifier.size(width = 300.dp, height = 250.dp),
                            contentScale = ContentScale.Crop
                        )
                    }


                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Buy at Ksh 12,450,000",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row {
                    Text(
                        text = "Rent at Ksh 30,000/month",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "PROPERTIES",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    color = Orange,
                    fontFamily = FontFamily.Serif
                )
                Spacer(modifier = Modifier.height(10.dp))

                Column {
                    Text(text = "1. One bedroom")
                    Text(text = "2. 24/7 survailance")
                    Text(text = "3. Electric fence")
                    Text(text = "4. Two bathrooms")
                }
                Spacer(modifier = Modifier.height(30.dp))
                Spacer(modifier = Modifier.width(46.dp))

                OutlinedButton(
                    onClick = {
                        navController.navigate(ROUT_MPESA)
                    },
                    shape = RoundedCornerShape(5.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black),
                    border = BorderStroke(2.dp, Color.Gray),
                    modifier = Modifier
                        .width(300.dp)
                        .height(50.dp)

                ) {
                    Text(
                        text = "Buy",
                        color = Orange,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 33.sp
                    )
                }


            }


        }
    )

        }


@Composable
@Preview(showBackground = true)
fun Room1ScreenPreview(){
    Room1Screen(navController = rememberNavController())

}
