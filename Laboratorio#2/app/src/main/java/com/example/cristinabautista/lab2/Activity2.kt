package com.example.cristinabautista.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val buttonShowHome2 = findViewById<Button>(R.id.button6)
        buttonShowHome2.setOnClickListener{val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }
    }
}
