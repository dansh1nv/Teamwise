package com.vladimir.teamwise

import android.app.Application
import com.facebook.stetho.Stetho
import com.mapbox.mapboxsdk.Mapbox
import com.parse.Parse

class TeamwiseApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        Mapbox.getInstance(applicationContext, getString(R.string.mapbox_access_token))
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        )
    }
}