package com.solo4.mywishlist.login.di

import com.solo4.mywishlist.login.presentation.screen.login.LoginViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { LoginViewModel(get()) }
}