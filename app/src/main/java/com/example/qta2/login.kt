package com.example.qta2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class logintod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logintod) // Asegúrate de tener un archivo de layout correspondiente

        // Referencias a los elementos del layout
        val editTextInput1: EditText = findViewById(R.id.email) // Campo de entrada 1
        val editTextInput2: EditText = findViewById(R.id.password) // Campo de entrada 2
        val buttonSubmit: Button = findViewById(R.id.login_button) // Botón para enviar

        // Acción al pulsar el botón
        buttonSubmit.setOnClickListener {
            val input1 = editTextInput1.text.toString()
            val input2 = editTextInput2.text.toString()

            // Lógica para manejar los datos ingresados
            if (input1.isNotEmpty() && input2.isNotEmpty()) {
                // Aquí puedes agregar la lógica que deseas realizar con los datos
                Toast.makeText(this, "Datos ingresados: $input1 y $input2", Toast.LENGTH_SHORT).show()

                // Navegar a la actividad de entrada (Inputsi)
                val intent = Intent(this, inputsi::class.java)
                startActivity(intent) // Iniciar la actividad de entrada
                finish() // Opcional: finalizar la actividad de inicio de sesión
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}