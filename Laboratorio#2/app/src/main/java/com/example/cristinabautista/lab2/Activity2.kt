package com.example.cristinabautista.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val buttonShowHome2 = findViewById<Button>(R.id.button6)
        buttonShowHome2.setOnClickListener{val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

        val limpiar = findViewById<Button>(R.id.limPedido)

        limpiar.setOnClickListener{
            val z: MenuOrderImp = (this.application as MyApplication).getOrder()
            z.clear()
            val mensaje2: Toast = Toast.makeText(applicationContext,"Acabas de limpiar tu bella orden", Toast.LENGTH_LONG)
            mensaje2.show()
            var nuevaLista = (this.application as MyApplication).getOrder().menuOrder
            val lista: ListView = findViewById(R.id.nueva)
            val ArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nuevaLista)
            lista.adapter = ArrayAdapter
        }
    }
}
