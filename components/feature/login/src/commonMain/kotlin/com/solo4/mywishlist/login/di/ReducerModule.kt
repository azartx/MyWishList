package com.solo4.mywishlist.login.di

import com.solo4.mywishlist.login.presentation.screen.login.mvi.LoginReducer
import org.koin.dsl.module

val reducerModule = module {
    factory { LoginReducer(get()) }
}