package com.solo4.mywishlist.login.presentation.navigation

import androidx.navigation.NavHostController
import com.solo4.mywishlist.loginapi.LoginDestination

class LoginDestinationImpl(
    private val navHostController: NavHostController
) : LoginDestination {

    override fun navigate(destinationModel: Unit?) {
        navHostController.navigate(LoginRoute)
    }
}