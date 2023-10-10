package com.example.ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        textViewResultado = findViewById(R.id.textViewResult)

        val buttonGuardar: Button = findViewById(R.id.button)
        buttonGuardar.setOnClickListener {
            guardarTexto()
        }
    }

    private fun guardarTexto() {
        val textoIngresado = editText.text.toString()
        textViewResultado.text = "Resultado: $textoIngresado"
    }
}
