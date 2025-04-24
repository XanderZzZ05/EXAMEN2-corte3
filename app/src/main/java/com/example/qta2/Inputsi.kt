package com.example.qta2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class inputsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inputsi) // Asegúrate de que el nombre del layout sea correcto

        // Referencias a los elementos del layout
        val inputText: EditText = findViewById(R.id.input_text) // Campo de entrada
        val solveButton: Button = findViewById(R.id.solve_button) // Botón para solucionar

        // Acción al pulsar el botón
        solveButton.setOnClickListener {
            val input = inputText.text.toString()

            // Lógica para manejar la cadena ingresada
            val resultado = intercambiarPalabras(input)
            if (resultado == "error") {
                Toast.makeText(this, "Por favor, ingresa exactamente 2 palabras.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Resultado: $resultado", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Función para intercambiar palabras
    private fun intercambiarPalabras(cadena: String): String {
        // Dividir la cadena en palabras
        val palabras = cadena.split(" ")

        // Validar si hay exactamente dos palabras
        return if (palabras.size != 2) {
            "error"
        } else {
            // Intercambiar las palabras
            "${palabras[1]} ${palabras[0]}"
        }
    }
}