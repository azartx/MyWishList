package com.solo4.mywishlist.login.di

import com.solo4.mywishlist.login.presentation.factory.LoginStateFactory
import org.koin.dsl.module

val factoryModule = module {
    factory { LoginStateFactory() }
}