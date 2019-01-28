package com.sample.navtoolbartitle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    lateinit var navController : NavController
    lateinit var drawerLayout : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById( R.id.drawerLayout )
        val toolbar = findViewById<Toolbar>( R.id.toolbar )
        navController = findNavController( R.id.navHostFragment )

        setSupportActionBar( toolbar )

        val appBarConfiguration = AppBarConfiguration( setOf( R.id.mainFragment ), drawerLayout )
        setupActionBarWithNavController( navController, appBarConfiguration )

    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp( navController, drawerLayout ) || super.onSupportNavigateUp()
    }
}
