package com.example.cloverestate.ui.theme.screens.home

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
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
import com.example.cloverestate.navigation.ADD_PRODUCTS_URL
import com.example.cloverestate.navigation.ROUT_ABOUT
import com.example.cloverestate.navigation.ROUT_BUY
import com.example.cloverestate.navigation.ROUT_MPESA
import com.example.cloverestate.navigation.ROUT_NOTIFICATION
import com.example.cloverestate.navigation.ROUT_ROOM1
import com.example.cloverestate.ui.theme.Orange

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter","ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController){
    var selected by remember { mutableIntStateOf(0) }
    val value = Scaffold(
        bottomBar = {
            NavigationBar {
                bottomNavItems.forEachIndexed { index, bottomNavItem ->
                    NavigationBarItem(
                        selected = index == selected,
                        onClick = {
                            selected = index
                            navController.navigate(bottomNavItem.route)
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    if (bottomNavItem.badges != 0) {
                                        Badge {
                                            Text(text = bottomNavItem.badges.toString())
                                        }
                                    } else if (bottomNavItem.hasNews) {
                                        Badge()
                                    }
                                }
                            ) {
                                Icon(
                                    imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                    contentDescription = bottomNavItem.title
                                )
                            }

                        },
                        label = {
                            Text(text = bottomNavItem.title)
                        })
                }
            }
        },


        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "home"
                    )
                }
            }
        },
        //Content Section
        content = @Composable {


            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //TOPAPPBAR
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Orange)
                ) {


                    TopAppBar(title = @Composable {


                        Row {
                            Box(modifier = Modifier.size(50.dp)) {
                                Image(
                                    painter = painterResource(id = R.drawable.animate),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clip(shape = CircleShape)
                                )

                            }



                            Text(
                                text = "CloverEstate",
                                fontSize = 30.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 20.dp, top = 10.dp)
                            )
                            Spacer(modifier = Modifier.width(20.dp))
                            val mContext = LocalContext.current
                            IconButton(onClick = {
                                navController.navigate(ROUT_ABOUT)

                            }) {
                                Icon(
                                    imageVector = Icons.Default.Info,
                                    contentDescription = "About",
                                    tint = Color.White
                                )
                            }

                            IconButton(onClick = { navController.navigate(ROUT_NOTIFICATION) }) {
                                Icon(
                                    imageVector = Icons.Default.Notifications,
                                    contentDescription = "notification",
                                    tint = Color.White
                                )
                            }
                        }

                    }, colors = TopAppBarDefaults.mediumTopAppBarColors(Orange))


                    //ENDOFTOPAPPBAR

                    Card(
                        modifier = Modifier.clickable { navController.navigate(ROUT_ROOM1) },
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {}
                    Row {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.housea),
                                contentDescription = "kjgkb",
                                modifier = Modifier.size(width = 180.dp, height = 140.dp),
                                contentScale = ContentScale.Crop
                            )
                            Icon(
                                imageVector = Icons.Default.FavoriteBorder,
                                contentDescription = "favourite",
                                tint = Color.White,
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(15.dp)

                            )
                        }

                        Spacer(modifier = Modifier.width(7.dp))

                        Column {
                            Text(
                                text = "5brdm Maisonette in Kiamunyu Estate fo sale",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                            Text(
                                text = "Ksh 18,500,000",
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )

                        }
                        Row {
                            OutlinedButton(onClick = {
                                val callIntent= Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:0111705928".toUri()
                                val mContext = LocalContext.current

                                mContext.startActivity(callIntent)
                            }) {
                                Text(text = "call")

                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            OutlinedButton(onClick = { navController.navigate(ROUT_MPESA) }) {
                                Text(text = "BUY", color = Color.Black)
                            }
                            Spacer(modifier = Modifier.width(5.dp))
                            OutlinedButton(onClick = { navController.navigate(ADD_PRODUCTS_URL) }) {
                                Text(text = "SELL", color = Color.Black)
                            }

                        }
                    }

                }
            }


        }


        val bottomNavItems = listOf (
            BottomNavItem(
                title = "Home",
                route = "home",
                selectedIcon = Icons.Filled.Home,
                unselectedIcon = Icons.Outlined.Home,
                hasNews = false,
                badges = 0
            ),



    BottomNavItem(
        title = "Rent",
        route="Rent",
        selectedIcon=Icons.Filled.Star,
        unselectedIcon=Icons.Outlined.Person,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "Sell",
        route="add_products",
        selectedIcon=Icons.Filled.ShoppingCart,
        unselectedIcon=Icons.Outlined.Face,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val  :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon :ImageVector,
    val hasNews :Boolean,
    val badges :Int
)



    @Preview
    @Composable
fun HomeScreenPreview(){
            HomeScreen(navController = rememberNavController())

}