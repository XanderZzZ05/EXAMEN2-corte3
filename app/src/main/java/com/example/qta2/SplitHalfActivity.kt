package com.example.qta2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SplitHalfActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split_half)

        val etInput = findViewById<EditText>(R.id.etInput)
        val btnSolve = findViewById<Button>(R.id.btnSolve)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSolve.setOnClickListener {
            val input = etInput.text.toString().trim()

            if (input.isEmpty()) {
                Toast.makeText(this, "Por favor ingresa una cadena", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val result = splitAndSwap(input)
            tvResult.text = result
            tvResult.visibility = TextView.VISIBLE
        }
    }

    private fun splitAndSwap(input: String): String {
        val length = input.length
        val splitPoint = (length + 1) / 2 // Para longitud impar, primera mitad es más grande

        val firstHalf = input.substring(0, splitPoint)
        val secondHalf = if (splitPoint < length) input.substring(splitPoint) else ""

        return secondHalf + firstHalf
    }
}