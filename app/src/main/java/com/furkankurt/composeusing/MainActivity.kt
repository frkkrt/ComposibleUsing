package com.furkankurt.composeusing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.furkankurt.composeusing.ui.theme.ComposeUsingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

}

@Composable
fun MainScreen() {
    //Column , Row , Box
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        CustomText(text = "Hello Android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello World")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Hello Kotlin")
        Spacer(modifier = Modifier.padding(5.dp))

        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )  {
            CustomText(text = "Test1")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Test2")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "Test3")
        }

    }
}
@Composable
fun CustomText(text :String)
{
    Text(modifier = Modifier
        .clickable {
            println("hello android clicked")
        }
        .background(Color.Green)
        .padding(top = 10.dp, start = 1.dp, end = 5.dp, bottom = 25.dp)
        //.width(250.dp)
        //.height(200.dp)
        //.size(width=50.dp, height = 50.dp)
        //.fillMaxSize(0.5f)
        .width(100.dp)
        ,text = text,
        color = Color.White,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  MainScreen()
}