package com.example.qta2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class inputsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputsi)

        // Referencias a los elementos del layout
        val inputText: EditText = findViewById(R.id.input_text)
        val solveButton: Button = findViewById(R.id.solve_button)

        // Acción al pulsar el botón
        solveButton.setOnClickListener {
            val input = inputText.text.toString().trim()

            // Lógica para manejar la cadena ingresada
            if (input.isEmpty()) {
                Toast.makeText(this, "Por favor, ingresa una cadena de caracteres", Toast.LENGTH_SHORT).show()
            } else {
                val resultado = dividirMitades(input)
                Toast.makeText(this, "Resultado: $resultado", Toast.LENGTH_LONG).show()
            }
        }
    }

    // Función para dividir la cadena en dos mitades e intercambiarlas
    private fun dividirMitades(cadena: String): String {
        val longitud = cadena.length
        val mitad = (longitud + 1) / 2 // Para cadenas impares, la primera mitad será más grande

        val primeraMitad = cadena.substring(0, mitad)
        val segundaMitad = if (mitad < longitud) cadena.substring(mitad) else ""

        return segundaMitad + primeraMitad
    }
}