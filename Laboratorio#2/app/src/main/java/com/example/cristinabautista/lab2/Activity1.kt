package com.example.cristinabautista.lab2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val lista: ListView = findViewById<ListView>(R.id.foodLIst)

        val foodList = arrayOf("Helado", "Pastel", "Pie", "Donas", "Flan")/*<String>()
        foodList.add("Helado")
        foodList.add("Pastel")
        foodList.add("Pie")
        foodList.add("Donas")
        foodList.add("Flan")*/

        /*val ArrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foodList)*/

        /*lista.adapter = ArrayAdapter*/

        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foodList)
        lista.adapter = adapter

        val buttonShowHome = findViewById<Button>(R.id.button3)
        buttonShowHome.setOnClickListener{val intent = Intent(this, Activity::class.java)
            startActivity(intent)
        }

        lista.isClickable = true

        lista.onItemClickListener = AdapterView.OnItemClickListener{ arg0, arg1, position, arg3 ->
            val r: MenuOrderImp = (this.application as MyApplication).getOrder()
            r.add(foodList.get(position))

            val mensaje: Toast = Toast.makeText(applicationContext,"Acabas de agregar: " +foodList.get(position)+ " a tu bella orden", Toast.LENGTH_LONG)
            mensaje.show()
        }


    }
}
