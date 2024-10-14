package com.example.mvvmproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.ui.tooling.preview.Preview
import com.example.mvvmproject.ui.theme.MVVMProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMProjectTheme {
                Surface {
                    MainScreen()
                }
            }
        }
    }
}
