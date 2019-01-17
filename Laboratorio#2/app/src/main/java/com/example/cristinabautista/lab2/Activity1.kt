package com.example.cristinabautista.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val lista: ListView = findViewById<ListView>(R.id.foodLIst)

        var foodList = ArrayList<String>()
        foodList.add("Helado")
        foodList.add("Pastel")
        foodList.add("Pie")
        foodList.add("Donas")
        foodList.add("Flan")

        val ArrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, foodList)

        lista.adapter = ArrayAdapter

        val buttonShowHome = findViewById<Button>(R.id.button3)
        buttonShowHome.setOnClickListener{val intent = Intent(this, Activity::class.java)
            startActivity(intent)
        }
    }
}
