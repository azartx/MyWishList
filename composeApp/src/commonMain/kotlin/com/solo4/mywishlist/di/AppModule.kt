package com.solo4.mywishlist.di

import org.koin.dsl.module

val appModule = module {
    includes(
        featureModule,
    )
}