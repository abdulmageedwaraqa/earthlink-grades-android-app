package com.example.abm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.abm.data.getGrades

var examID="";
class MainActivity : AppCompatActivity() {
     var url="https://localhost:44330/api/Grades"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.nav_host_fragment)

        var searchButton= findViewById<Button>(R.id.searchButton)

        findViewById<Button>(R.id.searchButton).setOnClickListener {
            examID= searchButton.text.toString()
            getGrades(url)
            navController.navigateUp() // to clear previous navigation history
            navController.navigate(R.id.action_FirstFragment_to_SecondFragment)

        }

        var registerButton =findViewById<TextView>(R.id.registerText)
        registerButton.setOnClickListener(){
            val intent = Intent(this, RegisterActivity::class.java)
            intent.putExtra("id", "1000")
            startActivity(intent)
        }


    }



}