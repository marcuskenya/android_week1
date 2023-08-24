package com.example.android_week1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_week1.ui.theme.Android_week1Theme

class Signup_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
  SignupInterface()
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun SignupInterface() {

    val FirstName by remember {
        mutableStateOf("")
    }
    val LastName by remember {
        mutableStateOf("")
    }
    val Phone by remember {
        mutableStateOf("")
    }
    val Email by remember {
        mutableStateOf("")
    }
    val Password by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()
        , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "Welcome , please Sign Up", color = Color.Black, fontSize = 20.sp)

        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            value = FirstName,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="usernameicon" )},
            onValueChange = { FirstName },
            label = { Text(text = "FirstName") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            value = LastName,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="usernameicon" )},
            onValueChange = { LastName },
            label = { Text(text = "LastName") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            value = Phone,
            leadingIcon = { Icon(Icons.Default.Phone, contentDescription ="usernameicon" )},
            onValueChange = { Phone },
            label = { Text(text = "Phone") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            value = Email,
            leadingIcon = { Icon(Icons.Default.Email, contentDescription ="usernameicon" )},
            onValueChange = { Email },
            label = { Text(text = "Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))

        TextField(
            value = Password,
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="passwordicon" ) },
            onValueChange = { Password },
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth())
        {
            Text(text ="Create Account" )
        }
    }









}


