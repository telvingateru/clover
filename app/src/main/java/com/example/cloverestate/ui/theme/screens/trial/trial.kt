package com.example.cloverestate.ui.theme.screens.trial

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TrailScreen(navController: NavHostController) {

    Column {
        Card(modifier = Modifier
            .height(100.dp)
            .width(160.dp)
        )
        {
            val mContext = LocalContext.current

            Box (modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.room1),
                    contentDescription ="room",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,                    contentDescription = "favourite",
                    tint = Color.White,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(15.dp)

                )

            }

        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Colossium",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,

            )
        Spacer(modifier = Modifier.height(5.dp))

        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Available Houses",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
        )

        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "From Ksh.380,000",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            color = Color.Blue,
        )
        Spacer(modifier = Modifier.height(5.dp)

        Row{


            OutlinedButton(onClick = {
                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0111705928".toUri()
                val mContext = LocalContext.current

                mContext.startActivity(callIntent)
            }) {
                Text(text = "call")

            }
            Spacer(modifier = Modifier.width(5.dp))

            OutlinedButton(onClick = {
                val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0111705928".toUri()
                mContext.startActivity(callIntent)

            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp),
                shape = RoundedCornerShape(5.dp),
                border = BorderStroke(2.dp, Color.Red)

            ) {
                Text(text = "CALL", color = Color.Black)

            }
            Spacer(modifier = Modifier.height(15.dp))


        }



    }


}
    @Preview
    @Composable
    fun TrialScreenPreview(){
        TrailScreen(rememberNavController())
    }
