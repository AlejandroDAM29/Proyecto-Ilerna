package com.example.proyecto1

import Asignaturas.*
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var intencion:Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // Se crea la relación entre los datos del .xml y el .kt mediante una variable en la que le decimos que encuentre por ID, el tipo que es y su id.
        val cursos = findViewById<TextView>(R.id.textViewCursos)
        cursos.text = getString(R.string.textViewCursos)

        // Se cambia la fuente del texto con un typeface e indicandole la ubicación.
        cursos.typeface = Typeface.createFromAsset(assets, "fonts/secret_admirer.ttf")

        // En este caso, es necesario cambiar el tamaño.
        cursos.textSize = 45f

        // Se cambia el color del texto (los colores estan en res/values/colors.xml).
         cursos.setTextColor(Color.parseColor("#3CB371"))

        //Ahora es repetir los pasos anteriores, pero con los botones.
        val botonDAM = findViewById<Button>(R.id.buttonDAM)
        botonDAM.text = getString(R.string.buttonDAM)
        botonDAM.typeface = Typeface.createFromAsset(assets, "fonts/a_little_sunshine.ttf")
        botonDAM.textSize = 15f
        botonDAM.setTextColor(Color.parseColor("#FF000000"))
        // Agregamos al botón la funcionalidad para que pase a la otra actividad.
        botonDAM.setOnClickListener {
            val vaDAM = Intent(this, DAM::class.java)
            startActivity(vaDAM)
        }

        val botonDAW = findViewById<Button>(R.id.buttonDAW)
        botonDAW.text = getString(R.string.buttonDAW)
        botonDAW.typeface = Typeface.createFromAsset(assets, "fonts/a_little_sunshine.ttf")
        botonDAW.textSize = 15f
        botonDAW.setTextColor(Color.parseColor("#FF000000"))
        botonDAW.setOnClickListener {
            val vaDAW = Intent(this, DAW::class.java)
            startActivity(vaDAW)
        }
    }





    //Para crear el menú dentro de la actividad principal
    @Override
    override fun onCreateOptionsMenu(miMenu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu_actividad_principal,miMenu)

        return true
    }

    //Para configurar las acciones del menú
    @Override
    override fun onOptionsItemSelected(opcionMenu: MenuItem): Boolean {

        var id = opcionMenu.itemId

        when(id){
            R.id.salir -> finish()
            R.id.info -> eleccion_actividad(intencion=Intent(this,Informacion_desarrolladores::class.java) )
            R.id.info2 -> eleccion_actividad(intencion= Intent(this,Informacion_desarrolladores::class.java))
            R.id.dam -> eleccion_actividad(intencion=Intent(this,DAM::class.java) )
            R.id.daw -> eleccion_actividad(intencion=Intent(this,DAW::class.java) )
        }

        return super.onOptionsItemSelected(opcionMenu)
    }

    fun eleccion_actividad(intencion:Intent){
        startActivity(intencion)
    }

}