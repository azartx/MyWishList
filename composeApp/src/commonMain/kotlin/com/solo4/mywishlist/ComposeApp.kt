package com.solo4.mywishlist

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.rememberNavController
import com.solo4.mywishlist.presentation.navigation.AppNavigation
import org.koin.ext.getFullName
import org.koin.mp.KoinPlatformTools

@Composable
fun ComposeApp() {
    val navHostController = rememberNavController()
    LaunchedEffect("") {
        KoinPlatformTools.defaultContext()
            .get()
            .setProperty(navHostController::class.getFullName(), navHostController)
    }
    MaterialTheme {
        AppNavigation(rememberNavController())
    }
}