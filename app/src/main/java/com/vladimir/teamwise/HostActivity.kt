package com.vladimir.teamwise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.room.Room
import com.mapbox.mapboxsdk.Mapbox
import com.vladimir.teamwise.data.db.AppDatabase
import kotlinx.android.synthetic.main.activity_host.*

class HostActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)
        setSupportActionBar(toolbar)

        Mapbox.getInstance(applicationContext, getString(R.string.mapbox_access_token))
        initDatabase()
        initNavigation()
    }

    private fun initDatabase() {
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "teamwise.db"
        ).build()
    }

    private fun initNavigation() {
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment? ?: return
        val navController = host.navController
        bottom_nav.setupWithNavController(navController)
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        AppBarConfiguration(
            setOf(
                R.id.additionFragment,
                R.id.chatFragment,
                R.id.informationFragment,
                R.id.profileFragment,
                R.id.searchFragment
            )
        )
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
    }

}
