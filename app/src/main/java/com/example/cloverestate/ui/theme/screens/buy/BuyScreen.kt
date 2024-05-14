package com.example.realeatate.ui.theme.screens.buy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.R
import com.example.cloverestate.navigation.ROUT_MPESA
import com.example.cloverestate.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BuyScreen(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize()) {

        val context = LocalContext.current

        var firstname by remember{ mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var contacts by remember { mutableStateOf("") }

        Box(
            modifier = Modifier.fillMaxWidth()


        )
        {
            Image(painter = painterResource(id = R.drawable.regicon),
                contentDescription = "This is an icon on register",
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 20.dp)
                    .size(100.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,


            )

        }
        Text(
            text = "create an account",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))




        TextField(
            value = firstname,
            onValueChange = { firstname = it},
            placeholder = { Text(text = "Firstname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )

        TextField(value = lastname,
            onValueChange = { firstname = it},
            placeholder = { Text(text = "Lasttname") },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )

        TextField(value = email,
            onValueChange = { email = it},
            placeholder = { Text(text = "Email") },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )

        TextField(value = password,
            onValueChange = { password = it},
            placeholder = { Text(text = "password") },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "lock")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),


            )

        TextField(value = contacts,
            onValueChange = { contacts= it},
            placeholder = { Text(text = "Contact") },
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription = "Person")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_MPESA)
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Orange),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)

        ) {
            Text(text = "Mpesa")
        }

    }

}




@Preview
@Composable
fun BuyScreenPreview(){
    BuyScreen(rememberNavController())
}