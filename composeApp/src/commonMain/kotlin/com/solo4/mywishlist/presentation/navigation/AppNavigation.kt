package com.solo4.mywishlist.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.solo4.mywishlist.login.presentation.navigation.LoginRoute
import com.solo4.mywishlist.login.screen.LoginScreen

@Composable
fun AppNavigation(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = LoginRoute,
    ) {
        composable<LoginRoute> {
            LoginScreen()
        }
    }
}