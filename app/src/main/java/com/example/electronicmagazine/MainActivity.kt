package com.example.electronicmagazine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val mainIntent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(mainIntent)
            finish()
        }, 5000)
    }
}