package com.example.electronicmagazine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Administrator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_administrator)
    }

    fun onBack (view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun onEnter (view: View){
        val intent = Intent(this, OpenGroup::class.java)
        startActivity(intent)
    }

    fun onCreate(view: View){
        val intent = Intent(this, CreateGroup::class.java)
        startActivity(intent)
    }
}