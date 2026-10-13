package com.example.jcandevformula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jcandevformula.c17_navigationbar.BottomNavigationBar
import com.example.jcandevformula.c17_navigationbar.screens.NavBarHomeScreen
import com.example.jcandevformula.ui.theme.JCAnDevFormulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JCAnDevFormulaTheme {

                BottomNavigationBar()

            }
        }
    }
}