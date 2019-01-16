package com.example.cristinabautista.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val buttonShowHome = findViewById<Button>(R.id.button3)
        buttonShowHome.setOnClickListener{val intent = Intent(this, Activity::class.java)
        }
    }
}
