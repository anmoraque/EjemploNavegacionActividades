package com.anmoraque.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
Navegacion entre actividades simples
y pasando informacion
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Creo una clave para el mensaje a mandar
        val MENSAJE = "mensaje"
        //Inicializamos el boton
        val boton = findViewById<Button>(R.id.boton)
        //Hacemos el listener
        boton.setOnClickListener {
            //Hacemos el Intent a otra actividad
            var intent = Intent (this, ActividadB::class.java)
            //Mandamos informacion a la otra actividad ej. un String (Clave, valor)
            intent.putExtra(MENSAJE, "Hacia actividad B")
            startActivity(intent)

        }
    }
}