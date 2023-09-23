package com.example.assignment4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Res3(){
    Column(modifier=Modifier.background(Color.White)){
        Card(modifier= Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.pattysandwich),
                    contentDescription = "Subway Sandwich picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading1(name = "Patty Sandwich")
                    Body1(content = "Made with aloo patty,capsicum,cucumber,lettuce and customizable sauce order")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹135",modifier=Modifier.padding(5.dp))
                        Text(text="Best seller",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button3()
                }
            }
        }

        Card(modifier= Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.shammi),
                    contentDescription = "Veg Shammi Sandwich",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading3(name = "Veg Shammi Sandwich")
                    Body3(content = "Made with delicious marinated vegetables, paneer,olives, shammi patty and customizable sauce order")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹190",modifier=Modifier.padding(5.dp))
                        Text(text="Best seller",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button3()
                }
            }
        }


        Card(modifier= Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.chicksandwich),
                    contentDescription = "chicken Sandwich Picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading3(name = "Oven Roast Chicken Sandwich")
                    Body3(content = "Made with marinated and roasted chicken,lettuce and customizable sauce order ")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹250",modifier=Modifier.padding(5.dp))
                        Text(text="Must try",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button3()
                }
            }
        }

        Card(modifier= Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.chopsub),
                    contentDescription = "Chop Chicken Subway picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading3(name = "Chop Chicken Subway")
                    Body3(content = "Made with chopped chicken,lettuce,tomato and customizable sauce order")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹225",modifier=Modifier.padding(5.dp))
                        Text(text="Recommended",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button3()
                }
            }
        }
        Card(modifier= Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.subcook),
                    contentDescription = "Cookies picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading3(name = "Chocolate Chip Cookies")
                    Body3(content = "Freshly made chocolate chip cookies")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹135",modifier=Modifier.padding(5.dp))
                        Text(text="Recommended",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button3()
                }
            }
        }
    }
}

@Composable
fun Heading3(name:String){
    Text(text=name,
        modifier=Modifier,
        fontSize=20.sp,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Serif
    )
}

@Composable
fun Body3(content:String){
    Text(text=content,
        modifier=Modifier,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily.Serif
    )
}

@Composable
fun Button3(){
    Button(onClick={/*TODO*/},
        modifier = Modifier.fillMaxWidth(0.5f))
    {
        Text(text = "Add to cart")
    }
}



@Preview
@Composable
fun Res3Preview(){
    Res3()
}