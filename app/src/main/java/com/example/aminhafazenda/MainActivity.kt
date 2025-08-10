package com.example.aminhafazenda

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.castles.android.cbp.plugin.app.ui.navigation.AppNavHost
import com.castles.android.cbp.plugin.app.ui.navigation.MainNavigation

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            navController = rememberNavController() // Initialize NavController
            var startScreen = MainNavigation.Screen.ACTION_LIST.name

            AppNavHost(
                navController = navController,
                startScreen = startScreen
            )
        }
    }
}