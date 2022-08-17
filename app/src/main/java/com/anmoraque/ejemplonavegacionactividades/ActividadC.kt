package com.anmoraque.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ActividadC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_c)
        //Creo una clave para el mensaje a mandar
        val MENSAJE = "mensaje"

        var mensaje = intent.getStringExtra(MENSAJE)
        //Hacemos un toast para ver el mensaje
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

        //Inicializamos el boton
        val boton = findViewById<Button>(R.id.botonAB)
        //Hacemos el listener
        boton.setOnClickListener {
            //Finalizamos la actividad, asi podemos regresar a la anterio sin enviar un intent
            //y sin que salga un toast vacio, esta es la forma correcta no volviendo con intent
            finish()

        }
    }
}