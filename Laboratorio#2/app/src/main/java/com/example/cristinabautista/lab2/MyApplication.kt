/*
* Cristina Bautista
* Carne: 161260*/
package com.example.cristinabautista.lab2

import android.app.Application
import com.example.oscar.myfirstapp.MenuOrder

class MyApplication : Application() {
    private var order: MenuOrderImp = MenuOrderImp()


    fun getOrder(): MenuOrderImp {
        return this.order
    }
    fun setOrder(o: MenuOrderImp) {
        this.order = o
    }


}