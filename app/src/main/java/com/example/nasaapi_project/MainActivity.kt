package com.example.nasaapi_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextScreen(view: View) {
        val change = Intent(this, FirstScreen::class.java)
        startActivity(change)
        overridePendingTransition(R.anim.left_in, R.anim.fade_out)
    }
}