package com.example.android_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_week1.ui.theme.Android_week1Theme

class ScrolledListView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
Scroll()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Scroll() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ) {

        LazyColumn(){

            items(12){

                index ->  Text(text = "This is my content")

                androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.nike), contentDescription =null )

        }
//     to use image use this format
//            item {
//              Column{
//
//                Text(text = "Friday party")
//                androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.nike),
//                    contentDescription = null)
//
//                  Text(text = "Friday party")
//                  androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.nike),
//                      contentDescription = null)
//
//              }
//
//
//
//
//            }
            
            
        
    }
}



}


