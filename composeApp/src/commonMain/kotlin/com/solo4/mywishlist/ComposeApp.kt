package com.solo4.mywishlist

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.solo4.mywishlist.presentation.navigation.AppNavigation

@Composable
fun ComposeApp() {
    MaterialTheme {
        AppNavigation(rememberNavController())
    }
}