package com.example.nasaapi_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
    }

    fun firstScreen(view: View){
        val change = Intent(this, FirstScreen::class.java)
        startActivity(change)
    }
}