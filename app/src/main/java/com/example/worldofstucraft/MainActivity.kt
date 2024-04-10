package com.example.worldofstucraft

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.worldofstucraft.ui.theme.WorldOfSTUcraftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorldOfSTUcraftTheme {
                // Display the main menu screen
                MainMenuScreen()
            }
        }
    }
}

@Composable
fun MainMenuScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        // Main Menu Layout
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Title of the Game
            Text(
              text = "World of STUcraft",
              style = MaterialTheme.typography.titleLarge,
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

            Button(onClick = { /* Handle exit button click */ }) {
                Text("Exit")
            }
        }
    }
}