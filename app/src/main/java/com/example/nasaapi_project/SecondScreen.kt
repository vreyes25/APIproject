package com.example.nasaapi_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nasaapi_project.adapters.AlphaAdapters
import com.example.nasaapi_project.model.CharItem

class SecondScreen : AppCompatActivity() {
    private var recyclerView:RecyclerView ? = null
    private var gridLayoutManager:GridLayoutManager ? = null
    private var charItem:ArrayList<CharItem> ? = null
    private var alphaAdapters:AlphaAdapters ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        recyclerView = findViewById(R.id.recycler_view_gallery)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 2, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        charItem = ArrayList()
        charItem = setAlphas()
        alphaAdapters = AlphaAdapters(applicationContext, charItem!!)
        recyclerView?.adapter = alphaAdapters
    }

    fun firstScreen(view: View){
        val change = Intent(this, FirstScreen::class.java)
        startActivity(change)
        overridePendingTransition(R.anim.right_in, R.anim.right_out)
    }

    private fun setAlphas() : ArrayList<CharItem>{

        var arrayList: ArrayList<CharItem> = ArrayList()

        arrayList.add(CharItem(R.drawable.universe1, "New Galaxy"))
        arrayList.add(CharItem(R.drawable.universe2, "Andromeda"))
        arrayList.add(CharItem(R.drawable.universe3, "Orbit Fire"))
        arrayList.add(CharItem(R.drawable.universe4, "Gravity Shine"))
        arrayList.add(CharItem(R.drawable.universe5, "Nebulosa Way"))
        arrayList.add(CharItem(R.drawable.universe6, "Hans Luminosity"))
        arrayList.add(CharItem(R.drawable.universe7, "Spectral Cosmos"))
        arrayList.add(CharItem(R.drawable.universe8, "Falling Sky"))
        arrayList.add(CharItem(R.drawable.universe9, "Jess Storm"))
        arrayList.add(CharItem(R.drawable.universe10, "Stars Rain"))
        arrayList.add(CharItem(R.drawable.universe11, "New Galaxy"))
        arrayList.add(CharItem(R.drawable.universe12, "Andromeda"))
        arrayList.add(CharItem(R.drawable.universe13, "Orbit Fire"))
        arrayList.add(CharItem(R.drawable.universe14, "Gravity Shine"))
        arrayList.add(CharItem(R.drawable.universe15, "Nebulosa Way"))
        arrayList.add(CharItem(R.drawable.universe16, "Hans Luminosity"))
        arrayList.add(CharItem(R.drawable.universe17, "Spectral Cosmos"))
        arrayList.add(CharItem(R.drawable.universe18, "Falling Sky"))
        arrayList.add(CharItem(R.drawable.universe19, "Jess Storm"))
        arrayList.add(CharItem(R.drawable.universe20, "Stars Rain"))

        return arrayList
    }

    fun imageSelected(view: View) {
        val change = Intent(this, ThirdScreen::class.java)
        startActivity(change)
        overridePendingTransition(R.anim.slide_up, R.anim.slide_off)
    }
}