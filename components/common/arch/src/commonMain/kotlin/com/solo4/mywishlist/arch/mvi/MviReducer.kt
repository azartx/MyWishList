package com.solo4.mywishlist.arch.mvi

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

interface MviReducer<Intent : MviIntent, State : MviState, OutEffect : MviOutEffect> {

    val state: StateFlow<State>

    val outEffect: SharedFlow<OutEffect>

    suspend fun reduce(intent: Intent)

    suspend fun state(stateHandle: suspend State.() -> Unit) {
        stateHandle.invoke(state.value)
    }
}