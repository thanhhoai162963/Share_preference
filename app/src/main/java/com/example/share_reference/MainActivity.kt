package com.example.share_reference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "sharePreference"
        val data = "database"
        val sharedPreferences = getSharedPreferences(name,Context.MODE_PRIVATE)
        with(sharedPreferences.edit()){
            putString("data","thanh")
            commit()
        }
        sharedPreferences.getString("data","1")
    }
}