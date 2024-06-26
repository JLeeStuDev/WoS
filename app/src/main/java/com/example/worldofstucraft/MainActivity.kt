package com.example.worldofstucraft

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.worldofstucraft.ui.theme.WorldOfSTUcraftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldOfSTUcraftTheme {
                // Display the main menu screen
                MainMenuScreen(this)
            }
        }
    }
}

@Composable
fun MainMenuScreen(activity: Activity) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.mainmenu_bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        // Main Menu Layout
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Title of the Game

            Text(
                text = "World of STUcraft",
                style = MaterialTheme.typography.titleLarge.copy(
                    color = Color.White,
                    fontSize = 32.sp
                ),
                modifier = Modifier.padding(bottom = 32.dp)
            )

            // New Game Button
            Button(onClick = { /* Handle new game button click */ }) {
                Text("New Game")
            }

            Button(onClick = { /* Handle load game button click */ }) {
                Text("Load Game")
            }

            Button(onClick = { /* Handle options button click */ }) {
                Text("Options")
            }

            Button(onClick = { exitApp(activity) }) {
                Text("Exit")
            }
        }
    }
}

fun exitApp(activity: Activity) {
    activity.finish()
}