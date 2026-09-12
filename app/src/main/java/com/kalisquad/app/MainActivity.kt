package com.kalisquad.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.kalisquad.app.ui.KaliSquadApp
import com.kalisquad.app.ui.theme.KaliSquadTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KaliSquadTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    KaliSquadApp()
                }
            }
        }
    }
}
