package com.solo4.mywishlist.login.presentation.factory

import com.solo4.mywishlist.login.presentation.screen.login.mvi.LoginStateModel

class LoginStateFactory {

    fun createInitialStateModel(): LoginStateModel {
        return LoginStateModel(
            nickname = ""
        )
    }
}