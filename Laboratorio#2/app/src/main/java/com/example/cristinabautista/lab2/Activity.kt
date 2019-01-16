package com.example.cristinabautista.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_restaurante)

        val buttonShowMenu = findViewById<Button>(R.id.button)
        buttonShowMenu.setOnClickListener{val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

        val buttonShowPedido = findViewById<Button>(R.id.button2)
        buttonShowPedido.setOnClickListener{val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

    }
}
