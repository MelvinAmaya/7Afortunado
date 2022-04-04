package com.example.a7afortunado

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        btnCreador.setOnClickListener {
            val intent = Intent(this,layoutJugar::class.java)
            startActivity(intent)
        }

        btnJugar.setOnClickListener {

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btncomo.setOnClickListener {
            val intent = Intent(this,layoutComo::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        var buildre = AlertDialog.Builder(this)
        buildre.setTitle("Salir")
        buildre.setMessage("¿Quieres salir del Juego?")
        buildre.setPositiveButton("SI") { dialogInterface: DialogInterface, i: Int ->
            super.onBackPressed()
        }
        buildre.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->

        }
        buildre.show()

    }
}