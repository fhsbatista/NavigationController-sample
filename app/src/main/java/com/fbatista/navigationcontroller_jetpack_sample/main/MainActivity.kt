package com.fbatista.navigationcontroller_jetpack_sample.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.fbatista.navigationcontroller_jetpack_sample.R

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun setNavController() {
        navController = Navigation.findNavController(this,
            R.id.nav_host
        )
    }
}
