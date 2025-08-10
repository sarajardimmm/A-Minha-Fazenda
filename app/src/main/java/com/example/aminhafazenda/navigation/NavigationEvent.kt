package com.example.aminhafazenda.navigation

sealed class NavigationEvent {
    object NavigateToMainMenu : NavigationEvent()
    // Add other navigation events as needed
}
