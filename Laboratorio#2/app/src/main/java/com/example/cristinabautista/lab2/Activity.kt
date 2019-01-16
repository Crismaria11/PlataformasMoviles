package com.example.cristinabautista.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_restaurante)
    }

    val intent = Intent(this, ShowNameActivity::class.java)

}
