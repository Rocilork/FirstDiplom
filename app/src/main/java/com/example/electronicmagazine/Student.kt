package com.example.electronicmagazine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val button: Button = findViewById(R.id.buttonEnter)
        val log: EditText = findViewById(R.id.login)
        val pass: EditText = findViewById(R.id.password)

        button.setOnClickListener {

        }
    }

    fun onBack (view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}