package com.android.vengateshm.composeromance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.android.vengateshm.compance.GradientCard
import com.android.vengateshm.compance.toColorFormat
import com.android.vengateshm.composeromance.ui.theme.ComposeRomanceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeRomanceTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    GradientCard(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp),
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color("#6DC8F3".toColorFormat()),
                                Color("#73A1F9".toColorFormat())
                            )
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxSize()
                        ) {
                            Text(text = "Title")
                            Text(text = "Description")
                        }
                    }
                }
            }
        }
    }
}