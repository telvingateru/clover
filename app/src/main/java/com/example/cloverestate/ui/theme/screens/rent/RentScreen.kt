package com.example.cloverestate.ui.theme.screens.rent

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.R

@Composable
fun RentScreen(navController: NavHostController){
   Column(modifier = Modifier.fillMaxSize()
   ) {
      Card (modifier = Modifier
         .padding(8.dp)
         .fillMaxWidth()
         .horizontalScroll(rememberScrollState())

      ){
         Row (modifier = Modifier
            .padding()
            .verticalScroll(rememberScrollState())

         ){
            Image(
               painter = painterResource(id = R.drawable.housea),
               contentDescription = "house",
               modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
               painter = painterResource(id = R.drawable.a),
               contentDescription = "house",
               modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
               painter = painterResource(id = R.drawable.b),
               contentDescription = "house",
               modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
               painter = painterResource(id = R.drawable.c),
               contentDescription = "house",
               modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
               painter = painterResource(id = R.drawable.d),
               contentDescription = "house",
               modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
               painter = painterResource(id = R.drawable.e),
               contentDescription = "house",
               modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(
               painter = painterResource(id = R.drawable.f),
               contentDescription = "house",
               modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))








         }

      }

      }

   }



@Preview
@Composable
fun RentScreenPreview(){
   RentScreen(rememberNavController())
}