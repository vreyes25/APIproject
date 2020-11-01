package com.example.nasaapi_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_first_screen.*

class FirstScreen : AppCompatActivity() {
    private var daysCounter = 365
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)
        txt_days.text = getString(R.string.daysCounter, daysCounter)
    }

    fun homeScreen(view: View){
        val change = Intent(this, MainActivity::class.java)
        startActivity(change)
        overridePendingTransition(R.anim.right_in, R.anim.right_out)
    }

    fun galleryScreen(view: View){
        val change = Intent(this, SecondScreen::class.java)
        startActivity(change)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }

    fun lessCounter(view: View) {
        if (daysCounter > 0){
            daysCounter--
        }
        txt_days.text = getString(R.string.daysCounter, daysCounter)
    }

    fun plusCounter(view: View){
        if (daysCounter < 365){
            daysCounter++
        }
        txt_days.text = getString(R.string.daysCounter, daysCounter)
    }
}