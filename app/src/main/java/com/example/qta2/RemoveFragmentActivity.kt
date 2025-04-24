package com.example.qta2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RemoveFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remove_fragment)

        val etInput = findViewById<EditText>(R.id.etInput)
        val btnSolve = findViewById<Button>(R.id.btnSolve)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSolve.setOnClickListener {
            val input = etInput.text.toString().trim()

            if (input.isEmpty()) {
                showToast("Por favor ingresa una cadena")
                return@setOnClickListener
            }

            if (input.count { it == 'h' || it == 'H' } < 2) {
                showToast("La cadena debe tener al menos 2 letras 'h'")
                return@setOnClickListener
            }

            val result = removeFragment(input)
            tvResult.text = "[$result]"
            tvResult.visibility = TextView.VISIBLE
        }
    }

    private fun removeFragment(input: String): String {
        val firstH = input.indexOfFirst { it == 'h' || it == 'H' }
        val lastH = input.indexOfLast { it == 'h' || it == 'H' }

        return input.substring(0, firstH) + input.substring(lastH + 1)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}