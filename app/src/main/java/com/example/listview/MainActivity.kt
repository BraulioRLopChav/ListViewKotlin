package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var listPaises: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarComponentes()
        listPaises.setOnItemClickListener { parent, view, position, id ->
            val strModal = "Selecciono el pais " + parent.getItemAtPosition(position).toString()
            Toast.makeText(this@MainActivity, strModal, Toast.LENGTH_SHORT).show()
        }
    }

    private fun iniciarComponentes() {
        listPaises = findViewById(R.id.listPaises)
        val adaptador = ArrayAdapter(
            this@MainActivity,
            android.R.layout.simple_expandable_list_item_1,
            resources.getStringArray(R.array.arrayPaises)
        )
        listPaises.adapter = adaptador
    }
}
