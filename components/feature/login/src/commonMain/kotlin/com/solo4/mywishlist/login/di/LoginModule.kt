package com.solo4.mywishlist.login.di

import com.solo4.mywishlist.login.presentation.navigation.LoginDestinationImpl
import com.solo4.mywishlist.loginapi.LoginDestination
import org.koin.dsl.bind
import org.koin.dsl.module

val loginModule = module {
    factory { LoginDestinationImpl(get()) } bind LoginDestination::class
}