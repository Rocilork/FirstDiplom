package com.example.electronicmagazine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun onStudent (view: View){
        val intent = Intent(this, Student::class.java)
        startActivity(intent)
    }

    fun onCurator (view: View){
        val intent = Intent(this, Curator::class.java)
        startActivity(intent)
    }

    fun onAdministrator (view: View){
        val intent = Intent(this, Administrator::class.java)
        startActivity(intent)
    }
}