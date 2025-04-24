package com.example.qta2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.qta2.logintod

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Vincula este archivo con el layout 'activity_main.xml'

        // Botón de Iniciar Sesión
        val iniciarSesionBtn = findViewById<Button>(R.id.login_button)

        // Acción al pulsar el botón
        iniciarSesionBtn.setOnClickListener {
            // Navegar hacia la actividad de Login (LoginActivity)
            val intent = Intent(this, logintod::class.java)
            startActivity(intent)
        }
    }
}