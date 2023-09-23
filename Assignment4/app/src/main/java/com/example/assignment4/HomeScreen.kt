package com.example.assignment4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.assignment4.ui.theme.Assignment4Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Column(modifier= Modifier
        .fillMaxSize()
        .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        var text by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        /*Text(text="Welcome to Nay",modifier=Modifier.fillMaxWidth(),fontSize=30.sp)*/
        Image(painter=painterResource(R.drawable.restauranttwo),contentDescription = "Restaurant picture"
            ,modifier=Modifier.
            size(300.dp))

        Text(text="Login Screen",
            modifier=Modifier.padding(16.dp),
            fontWeight= FontWeight.ExtraBold,
            fontSize = 30.sp)

        OutlinedTextField(
            value = text,
            onValueChange = { newText -> text = newText },
            label = {
                Text(text = "Username")
            },
            maxLines = 2,
            leadingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.AccountCircle,
                        contentDescription = "AccountCircle Icon"
                    )
                }

            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            )

        )
        OutlinedTextField(
            value = password,
            onValueChange = { newText -> password = newText },
            label = {
                Text(text = "Password")
            },
            maxLines = 2,
            leadingIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "Password Icon"
                    )
                }

            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Go
            )
        )
//        Button(modifier = Modifier
//            .fillMaxWidth(0.4f)
//            .clickable {
//                navController.navigate(route = Screen.Res.route)
//
//            }, onClick = {/*TODO*/}) {
//            Text(text = "Sign In")
//        }
        Button1(navController = navController)
    }
}

@Composable
fun Button1(navController: NavController){
    Button(onClick = {navController.navigate(route = Screen.Res.route)},
        modifier = Modifier.fillMaxWidth(0.4f)) {
        Text(text = "Login")
    }
}



//@Preview
//@Composable
//fun HomeScreenPreview(showBackground: Boolean =true){
//    HomeScreen(navController= NavController())
//}