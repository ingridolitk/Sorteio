package com.ingrid.sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    var random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJogar = findViewById<Button>(R.id.btnJogar)
        val resultado = findViewById<TextView>(R.id.resultado)

        btnJogar.setOnClickListener() {
            resultado.text = (random.nextInt(11).toString())
        }
    }
}