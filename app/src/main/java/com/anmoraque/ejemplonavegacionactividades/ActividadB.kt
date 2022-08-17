package com.anmoraque.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_b)
        //Creo una clave para el mensaje a mandar
        val MENSAJE = "mensaje"


        //Inicializamos el boton
        val botonC = findViewById<Button>(R.id.botonC)
        //Inicializamos el boton
        val botonD = findViewById<Button>(R.id.botonD)
        //Recibimos el Intent
        var mensaje = intent.getStringExtra(MENSAJE)
        //Hacemos un toast para ver el mensaje
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

        //Hacemos el listener
        botonC.setOnClickListener {
            //Hacemos el Intent a otra actividad
            var intent = Intent (this, ActividadC::class.java)
            //Mandamos informacion a la otra actividad ej. un String (Clave, valor)
            intent.putExtra(MENSAJE, "Hacia actividad C")
            startActivity(intent)

        }

        //Hacemos el listener
        botonD.setOnClickListener {
            //Hacemos el Intent a otra actividad
            var intent = Intent (this, ActividadD::class.java)
            //Mandamos informacion a la otra actividad ej. un String (Clave, valor)
            intent.putExtra(MENSAJE, "Hacia actividad D")
            startActivity(intent)

        }
    }
}