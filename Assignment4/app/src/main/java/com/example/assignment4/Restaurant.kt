package com.example.assignment4

import android.graphics.Paint.Align
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Restaurant(navController: NavController){
    Column(modifier= Modifier
        .padding(10.dp)
        .background(Color.White)){
        Box(modifier=Modifier.fillMaxWidth().background(color=Color(0xFFEB61FF)),
            contentAlignment = Alignment.TopCenter){
            Column(){
                Text(text="Hello there!")
                Text(text="Restaurants in your area")
            }
        }
      Card(modifier= Modifier
          .fillMaxWidth()
          .height(150.dp)
          .padding(10.dp)
          ,elevation= CardDefaults.cardElevation(10.dp),
         // border = BorderStroke(1.dp,Color.Black),
          colors=CardDefaults.cardColors(containerColor=Color.White)
      ) {
          Row(modifier = Modifier.padding(10.dp)) {
              Image(
                  painter = painterResource(id = R.drawable.dominos),
                  contentDescription = "Dominos Logo",
                  modifier = Modifier.size(100.dp)
              )
              Column(
                  modifier = Modifier,
                  verticalArrangement = Arrangement.Top,
                  horizontalAlignment = Alignment.End
              ) {
                  Heading(name = "Dominos")
                  Body(content = " 1.5 kms | 30 minutes(approx)")
                  Res1(navController = navController)
              }
          }
      }
        Card(modifier= Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(10.dp)
            ,elevation= CardDefaults.cardElevation(10.dp),
            // border = BorderStroke(1.dp,Color.Black),
            colors=CardDefaults.cardColors(containerColor=Color.White)
        ) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.pizzahut),
                    contentDescription = "PizzaHut Logo",
                    modifier = Modifier.size(100.dp)
                )
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.End
                ) {
                    Heading(name = "PizzaHut")
                    Body(content = " 3 kms | 45 minutes(approx)")
                    Res2(navController = navController)
                }
            }
        }
        Card(modifier= Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(10.dp)
            ,elevation= CardDefaults.cardElevation(10.dp),
            // border = BorderStroke(1.dp,Color.Black),
            colors=CardDefaults.cardColors(containerColor=Color.White)
        ) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.subway),
                    contentDescription = "Subway Logo",
                    modifier = Modifier.size(100.dp)
                )
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.End
                ) {
                    Heading(name = "Subway")
                    Body(content = " 4 kms | 50-60 minutes(approx)")
                    Res3(navController = navController)
                }
            }
        }
    }
}

@Composable
fun Heading(name:String){
    Text(text=name,
        modifier=Modifier,
        fontSize=20.sp,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Serif
    )
}

@Composable
fun Body(content:String){
    Text(text=content,
        modifier=Modifier,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily.Serif
    )
}

@Composable
fun Res1(navController:NavController){
    Button(onClick={navController.navigate(route = Screen.Res1.route)},
        modifier = Modifier.fillMaxWidth(0.7f))
    {
        Text(text = "View menu")
    }
}

@Composable
fun Res2(navController:NavController){
    Button(onClick={navController.navigate(route = Screen.Res2.route)},
        modifier = Modifier.fillMaxWidth(0.7f))
    {
        Text(text = "View menu")
    }
}

@Composable
fun Res3(navController:NavController){
    Button(onClick={navController.navigate(route = Screen.Res3.route)},
        modifier = Modifier.fillMaxWidth(0.7f))
    {
        Text(text = "View menu")
    }
}

/*@Preview
@Composable
fun RestaurantPreview(showBackground:Boolean=true){
    Restaurant(navController= NavController())
}*/