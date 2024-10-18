package com.solo4.mywishlist.di

import com.solo4.mywishlist.login.di.loginModule
import org.koin.dsl.module

val featureModule = module {
    includes(
        loginModule,
    )
}