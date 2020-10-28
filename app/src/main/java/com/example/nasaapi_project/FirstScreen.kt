package com.example.nasaapi_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
    }

    fun homeScreen(view: View){
        val change = Intent(this, MainActivity::class.java)
        startActivity(change)
    }

    fun galleryScreen(view: View){
        val change = Intent(this, SecondScreen::class.java)
        startActivity(change)
    }
}