package com.example.loginscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginscreen.ui.theme.LoginscreenTheme
import com.google.android.gms.wallet.button.ButtonConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                SimpleText()
                SimpleTextField()
                Password()
                Column (modifier = Modifier.fillMaxSize(1f) ,verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally) {
                    SimpleButton()
                }
            }
        }
    }
}

@Composable
fun SimpleText(){

    Text(text = "Login", modifier = Modifier.padding(16.dp),
        fontFamily= FontFamily.SansSerif,
        fontSize=32.sp
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleTextField(){
    var text by remember{mutableStateOf("")}
    TextField(value = text , onValueChange = {newText -> text = newText }, label = {Text(text = "Enter Username")}  )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Password(){
    var text by remember{mutableStateOf("")}
    TextField(value = text , onValueChange = {it -> text = it }, label = {Text(text = "Enter Password")}  )
}


@Composable
fun SimpleButton(){

   Button(modifier = Modifier.padding(16.dp), onClick = { /*TODO*/ }) {
        Text(text = "Submit")
    }


}


@Preview
@Composable
fun SimpleTextPreview(){
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        SimpleText()
        SimpleTextField()
        Password()


        Column (modifier = Modifier.fillMaxSize(1f) ,verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            SimpleButton()

        }
    }
}
