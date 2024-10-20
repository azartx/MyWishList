package com.solo4.mywishlist.arch.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

abstract class MviViewModel<
        Intent : MviIntent,
        State : MviState,
        Reducer : MviReducer<Intent, State, OutEffect>,
        OutEffect : MviOutEffect
        >(
    private val reducer: Reducer
) : ViewModel() {

    val state: StateFlow<State> = reducer.state

    val outEffect: SharedFlow<OutEffect> = reducer.outEffect

    fun sendIntent(intent: Intent) {
        viewModelScope.launch {
            reducer.reduce(intent)
        }
    }

    suspend fun coSendIntent(intent: Intent) {
        reducer.reduce(intent)
    }
}