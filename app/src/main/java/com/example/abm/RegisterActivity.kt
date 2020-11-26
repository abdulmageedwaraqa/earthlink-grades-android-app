package com.example.abm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var registerButton =findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener(){
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("id", "1000")
        startActivity(intent)
        }
    }
}