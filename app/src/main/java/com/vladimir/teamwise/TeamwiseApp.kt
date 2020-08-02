package com.vladimir.teamwise

import android.app.Application
import com.facebook.stetho.Stetho
import com.mapbox.mapboxsdk.Mapbox

class TeamwiseApp : Application(){
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        Mapbox.getInstance(applicationContext, getString(R.string.mapbox_access_token))
    }
}