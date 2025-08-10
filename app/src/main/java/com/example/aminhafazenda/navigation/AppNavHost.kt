package com.castles.android.cbp.plugin.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import com.castles.android.cbp.plugin.app.ui.navigation.MainNavigation.Screen
import com.example.aminhafazenda.ui.actionList.ActionListCompose
import com.example.aminhafazenda.ui.actionList.ActionListViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startScreen: String
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startScreen
    ) {
        composable(Screen.ACTION_LIST.name) {
            val actionListViewModel: ActionListViewModel = viewModel()
            ActionListCompose(navController, actionListViewModel)
        }

    }
}

