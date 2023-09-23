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

@Composable
fun Res2(){
    Column(modifier=Modifier.background(Color.White)){

        Card(modifier=Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.pizzaone),
                    contentDescription = "Pizza picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading1(name = "Paneer Pizza")
                    Body1(content = "Made with delicious marinated paneer,capcisum,olives and corn")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹200",modifier=Modifier.padding(5.dp))
                        Text(text="Best seller",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button2()
                }
            }
        }
        Card(modifier=Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.chickenpiz),
                    contentDescription = "Chicken Pizza picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading2(name = "Chicken Pizza")
                    Body2(content = "Made with delicious marinated chicken,capcisum,olives and corn")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹250",modifier=Modifier.padding(5.dp))
                        Text(text="Best seller",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button2()
                }
            }
        }

        Card(modifier=Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.burger),
                    contentDescription = "Veg Burger Picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading2(name = "Veg Burger")
                    Body2(content = "Veg burger made with aloo patty,lettuce,tomato slices and layered with paprika sauce")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹150",modifier=Modifier.padding(5.dp))
                        Text(text="Must try",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button2()
                }
            }
        }

        Card(modifier=Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.chickenburg),
                    contentDescription = "Chicken Burger picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading2(name = "Chicken Burger")
                    Body2(content = "Burger made with Chicken patty,lettuce,tomato slices and paprika sauce")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹175",modifier=Modifier.padding(5.dp))
                        Text(text="Recommended",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button2()
                }
            }
        }

        Card(modifier=Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(10.dp),
            elevation= CardDefaults.cardElevation(10.dp),
            colors=CardDefaults.cardColors(containerColor=Color.White)) {
            Row(modifier = Modifier.padding(10.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.garlicbsticks),
                    contentDescription = "Garlic bread sticks picture",
                    modifier = Modifier.size(100.dp)
                )
                Column(modifier=Modifier.padding(5.dp)) {
                    Heading1(name = "Garlic Breadsticks")
                    Body1(content = "Made with fresh bread and stuffed with corn and cheese")
                    Row(modifier=Modifier.padding(10.dp)) {
                        Text(text = "₹125",modifier=Modifier.padding(5.dp))
                        Text(text="Recommended",modifier=Modifier.padding(5.dp), color = Color(0xFFfc8c03))
                        Text(text=" ✪✪✪✪",modifier=Modifier.padding(5.dp))
                    }
                    Button2()
                }
            }
        }
    }
}

@Composable
fun Heading2(name:String){
    Text(text=name,
        modifier=Modifier,
        fontSize=20.sp,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.Serif
    )
}

@Composable
fun Body2(content:String){
    Text(text=content,
        modifier=Modifier,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = FontFamily.Serif
    )
}

@Composable
fun Button2(){
    Button(onClick={/*TODO*/},
        modifier = Modifier.fillMaxWidth(0.5f))
    {
        Text(text = "Add to cart")
    }
}



@Preview
@Composable
fun Res2Preview(){
    Res2()
}