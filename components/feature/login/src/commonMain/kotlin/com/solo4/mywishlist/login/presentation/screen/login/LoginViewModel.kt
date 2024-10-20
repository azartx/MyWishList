package com.solo4.mywishlist.login.presentation.screen.login

import com.solo4.mywishlist.arch.mvi.MviViewModel
import com.solo4.mywishlist.login.presentation.screen.login.mvi.LoginIntent
import com.solo4.mywishlist.login.presentation.screen.login.mvi.LoginOutEffect
import com.solo4.mywishlist.login.presentation.screen.login.mvi.LoginReducer
import com.solo4.mywishlist.login.presentation.screen.login.mvi.LoginState

class LoginViewModel(
    reducer: LoginReducer
) : MviViewModel<LoginIntent, LoginState, LoginReducer, LoginOutEffect>(reducer) {

    fun onNicknameFieldUpdated(nickname: String) {
        sendIntent(LoginIntent.UpdateNickname(nickname))
    }
}