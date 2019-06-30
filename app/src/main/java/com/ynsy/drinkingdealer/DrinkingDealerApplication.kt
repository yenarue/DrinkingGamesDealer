package com.ynsy.drinkingdealer

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DrinkingDealerApplication : Application() {

    val applicationModule = module {
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DrinkingDealerApplication)
            modules(applicationModule)
        }
    }
}