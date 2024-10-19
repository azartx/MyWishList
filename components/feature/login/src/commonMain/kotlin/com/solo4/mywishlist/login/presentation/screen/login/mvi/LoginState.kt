package com.solo4.mywishlist.login.presentation.screen.login.mvi

import com.solo4.mywishlist.arch.mvi.MviState

sealed interface LoginState : MviState {

    val model: LoginStateModel

    data class NotAuthorized(override val model: LoginStateModel) : LoginState

    data class Loading(override val model: LoginStateModel) : LoginState

    data class ShouldRegister(override val model: LoginStateModel) : LoginState
}

data class LoginStateModel(
    val nickname: String
)