package com.solo4.mywishlist.login.di

import com.solo4.mywishlist.login.presentation.screen.login.LoginViewModel
import com.solo4.mywishlist.mviViewModelFactory
import org.koin.dsl.module

val viewModelModule = module {
    mviViewModelFactory { LoginViewModel(get()) }
}