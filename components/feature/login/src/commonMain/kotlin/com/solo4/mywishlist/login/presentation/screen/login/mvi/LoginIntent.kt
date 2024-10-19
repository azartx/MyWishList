package com.solo4.mywishlist.login.presentation.screen.login.mvi

import com.solo4.mywishlist.arch.mvi.MviIntent

sealed interface LoginIntent : MviIntent {

    data class UpdateNickname(val nickname: String) : LoginIntent

    data object TryLogin : LoginIntent
}