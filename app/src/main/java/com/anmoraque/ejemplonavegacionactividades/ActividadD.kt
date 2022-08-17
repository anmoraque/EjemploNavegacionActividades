package com.anmoraque.ejemplonavegacionactividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ActividadD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad_d)
        //Creo una clave para el mensaje a mandar
        val MENSAJE = "mensaje"

        var mensaje = intent.getStringExtra(MENSAJE)
        //Hacemos un toast para ver el mensaje
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
    }
}