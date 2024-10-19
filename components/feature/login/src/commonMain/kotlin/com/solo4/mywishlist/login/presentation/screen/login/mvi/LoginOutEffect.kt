package com.solo4.mywishlist.login.presentation.screen.login.mvi

import com.solo4.mywishlist.arch.mvi.MviOutEffect

sealed interface LoginOutEffect : MviOutEffect {

    data object GoToRegistration : LoginOutEffect

    data object GoToHome : LoginOutEffect
}