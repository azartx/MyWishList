package com.solo4.mywishlist

import android.app.Application
import com.solo4.mywishlist.di.appModule
import org.koin.core.context.startKoin

class AndroidApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            modules(
                appModule,
            )
        }
    }
}