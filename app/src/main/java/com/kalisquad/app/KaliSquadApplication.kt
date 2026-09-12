package com.kalisquad.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class KaliSquadApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
