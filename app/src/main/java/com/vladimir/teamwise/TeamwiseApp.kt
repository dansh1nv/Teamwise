package com.vladimir.teamwise

import android.app.Application
import com.facebook.stetho.Stetho

class TeamwiseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)

    }
}