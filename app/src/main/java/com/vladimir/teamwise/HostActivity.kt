package com.vladimir.teamwise

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.room.Room
import com.mapbox.mapboxsdk.Mapbox
import com.vladimir.teamwise.data.db.AppDatabase
import com.vladimir.teamwise.databinding.HostActivityBinding
import com.vladimir.teamwise.platform.Constants.TEAMWISE_DB

class HostActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: HostActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.host_activity)
        binding = HostActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Mapbox.getInstance(applicationContext, getString(R.string.mapbox_access_token))
        initDatabase()
        initNavigation()
        initNavigation()
    }

    private fun initDatabase() {
        val db =
            Room.databaseBuilder(applicationContext, AppDatabase::class.java, TEAMWISE_DB).build()
    }

    private fun initNavigation() {
        val host: NavHostFragment = supportFragmentManager
            .findFragmentById(R.id.mainHostFragment) as NavHostFragment
        navController = host.navController
        appBarConfiguration = AppBarConfiguration(navController.graph)

        setupBottomNavMenu(navController)
    }

    private fun setupBottomNavMenu(navController: NavController) {
        binding.bottomNavView.setupWithNavController(navController)
    }
}
