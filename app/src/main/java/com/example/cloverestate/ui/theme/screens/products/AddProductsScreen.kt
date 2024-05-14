package com.example.cloverestate.ui.theme.screens.products

import android.content.Context
import android.net.Uri
import android.provider.MediaStore
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cloverestate.R
import com.example.cloverestate.data.ProductViewModel
import com.example.cloverestate.ui.theme.Orange
import com.example.cloverestate.ui.theme.newWhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddProductsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Orange)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row {

            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "Grandeur Estate",
                textDecoration = TextDecoration.Underline,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontFamily = FontFamily.Serif,
                modifier = Modifier.padding(top = 20.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Add real estate details",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Image(

            painter = (painterResource(id = R.drawable.animate)),
            contentDescription = "home",
            modifier = Modifier
                .padding(top = 10.dp, bottom = 20.dp)
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop



        var name by remember { mutableStateOf("") }
        var category by remember { mutableStateOf("") }
        var town by remember { mutableStateOf("") }
        var  contact remember { mutableStateOf("") }
        val context = LocalContext.current


        OutlinedTextField(
            value = estate,
            onValueChange = { estate = it },
            label = {
                Text(
                    text = "real estate name *",
                    color = Color.Black
                )
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(

                focusedBorderColor = Color.Black,

                unfocusedBorderColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = category,
            onValueChange = { category = it },
            label = {
                Text(
                    text = "estate *",
                    color = Color.Black
                )
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(

                focusedBorderColor = Color.Black,

                unfocusedBorderColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = town,
            onValueChange = { town = it },
            label = {
                Text(
                    text = "Town *",
                    color = Color.Black
                )
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(

                focusedBorderColor = Color.Black,

                unfocusedBorderColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = contact,
            onValueChange = {
                contact = it
            },
            label = {
                Text(
                    text = "Contact *",
                    color = Color.Black
                )
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(10.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(

                focusedBorderColor = Color.Black,

                unfocusedBorderColor = Color.Black
            )
        )

        val customModifier = Modifier.padding(10.dp)
        Spacer(modifier = Modifier.height(50.dp))
        //---------------------IMAGE PICKER START-----------------------------------//

        ImagePicker(modifier=customModifier,context, navController, name.trim(), contact.trim(), county.trim(),town.trim())

        //---------------------IMAGE PICKER END-----------------------------------//

    }
}

@Composable
fun ImagePicker(modifier: Modifier = Modifier, context: Context,navController: NavHostController, name:String, contact:String, county:String,town:String) {
    var hasImage by remember { mutableStateOf(false) }
    var imageUri by remember { mutableStateOf<Uri?>(null) }

    val imagePicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent(),
        onResult = { uri ->
            hasImage = uri != null
            imageUri = uri
        }
    )

    Column(modifier = modifier,) {
        if (hasImage && imageUri != null) {
            val bitmap = MediaStore.Images.Media.
            getBitmap(context.contentResolver,imageUri)
            Image(bitmap = bitmap.asImageBitmap(), contentDescription = "Selected image",
                modifier = Modifier
                    .fillMaxWidth()

                    .size(300.dp)

                    .aspectRatio(1f)

                    .clip(RoundedCornerShape(16.dp))

                    .border(2.dp, Color.Black, RoundedCornerShape(16.dp))
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment =
            Alignment.CenterHorizontally,
        ){
            Button(
                onClick = {
                    imagePicker.launch("image/*")
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(newWhite),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 100.dp, end = 100.dp, top = 30.dp)
            ) {
                Text(
                    text = "Select Image",
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(5.dp))

            Button(onClick = {
                //-----------WRITE THE UPLOAD LOGIC HERE---------------//
                var autoshopRepository = TestViewModel(navController,context)
                autoshopRepository.uploadProduct(name, contact, county,town,imageUri!!)


            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(newWhite),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 100.dp, end = 100.dp)
            ) {
                Text(text = "Upload",
                    color = Color.Black
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AddProductsScreenPreview() {
    AddProductsScreen(rememberNavController())
}