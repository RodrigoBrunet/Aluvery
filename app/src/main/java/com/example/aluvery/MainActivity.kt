package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.aluvery.screen.HomeScreen
import com.example.aluvery.ui.theme.AluveryTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                App()

            }
        }
    }

    @Composable
    fun App() {
        AluveryTheme {
            Surface {
                HomeScreen()
            }
        }
    }
}



