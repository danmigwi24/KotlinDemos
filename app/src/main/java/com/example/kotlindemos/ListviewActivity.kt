package com.example.kotlindemos

import android.graphics.ColorSpace
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.kotlindemos.adapters.MyListViewAdapter
import com.example.kotlindemos.models.Model

class ListviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val lv = findViewById<ListView>(R.id.listview)

        val list = mutableListOf<Model>()


        list.add(Model("BraceLet Lucy", "$12000 ", R.drawable.brace1))
        list.add(Model("BraceLet Sarah", "$4000", R.drawable.brace))
        list.add(Model("Golden BraceLet", "Price @ $8000", R.drawable.brace2))
        list.add(Model("BraceLet Aduke", "Price @ $6000", R.drawable.brace3))
        list.add(Model("BraceLet with Chain", "Price @ $2000", R.drawable.brace4))
        list.add(Model("BraceLet Maria", "Price @ $4000", R.drawable.brace5))
        list.add(Model("BraceLet Miriam and Elizabeth", "Price @ $5000", R.drawable.brace6))
        list.add(Model("BraceLet Resheeda", "Price @ $4000", R.drawable.brace7))
        list.add(Model("BraceLet Khar", "Price @ $5000", R.drawable.brace8))

        lv.adapter = MyListViewAdapter(this, R.layout.list_row_layout, list)

        lv.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, l ->
            if (position == 0) {
                Toast.makeText(this, "Bracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 1) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 2) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 3) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 4) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 5) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 6) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 7) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
            if (position == 8) {
                Toast.makeText(this, "Brracelet $l is at position $position", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}
