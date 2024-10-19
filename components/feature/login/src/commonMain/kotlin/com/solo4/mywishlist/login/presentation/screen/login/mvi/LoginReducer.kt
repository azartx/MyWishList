package com.solo4.mywishlist.login.presentation.screen.login.mvi

import com.solo4.mywishlist.arch.mvi.MviReducer
import com.solo4.mywishlist.login.presentation.factory.LoginStateFactory
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginReducer(
    private val loginStateFactory: LoginStateFactory
): MviReducer<LoginIntent, LoginState, LoginOutEffect> {

    private val _state = MutableStateFlow(
        LoginState.NotAuthorized(loginStateFactory.createInitialStateModel())
    )
    override val state: StateFlow<LoginState> = _state.asStateFlow()

    private val _outEffect = MutableSharedFlow<LoginOutEffect>()
    override val outEffect: SharedFlow<LoginOutEffect> = _outEffect.asSharedFlow()

    override suspend fun reduce(intent: LoginIntent) {
        when (intent) {
            is LoginIntent.UpdateNickname -> updateNickname(intent.nickname)
            is LoginIntent.TryLogin -> Unit//login()
        }
    }

    private suspend fun updateNickname(nickname: String) {
        state {
            _state.emit(
                LoginState.NotAuthorized(
                    model = model.copy(
                        nickname = nickname
                    )
                )
            )
        }
    }
}