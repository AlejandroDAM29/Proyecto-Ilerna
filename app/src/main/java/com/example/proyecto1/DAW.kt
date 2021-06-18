package com.example.proyecto1

import Asignaturas.*
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class DAW : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daw)

        val botonSI = findViewById<Button>(R.id.buttonSistemasInformaticos)
        botonSI.text = getString(R.string.buttonSistemasInformaticos)
        botonSI.textSize = 15f
        botonSI.setTextColor(Color.parseColor("#FF000000"))
        botonSI.setOnClickListener {
            val vaSistemasInformaticos = Intent(this, SistemasInformaticos::class.java)
            startActivity(vaSistemasInformaticos)
        }

        val botonBDA = findViewById<Button>(R.id.buttonBaseDatosA)
        botonBDA.text = getString(R.string.buttonBaseDatosA)
        botonBDA.textSize = 15f
        botonBDA.setTextColor(Color.parseColor("#FF000000"))
        botonBDA.setOnClickListener {
            val vaBaseDatosA = Intent(this, BaseDatosA::class.java)
            startActivity(vaBaseDatosA)
        }

        val botonBDB = findViewById<Button>(R.id.buttonBaseDatosB)
        botonBDB.text = getString(R.string.buttonBaseDatosB)
        botonBDB.textSize = 15f
        botonBDB.setTextColor(Color.parseColor("#FF000000"))
        botonBDB.setOnClickListener {
            val vaBaseDatosB = Intent(this, BaseDatosB::class.java)
            startActivity(vaBaseDatosB)
        }

        val botonPA = findViewById<Button>(R.id.buttonProgramacionA)
        botonPA.text = getString(R.string.buttonProgramacionA)
        botonPA.textSize = 15f
        botonPA.setTextColor(Color.parseColor("#FF000000"))
        botonPA.setOnClickListener {
            val vaProgramacionA = Intent(this, ProgramacionA::class.java)
            startActivity(vaProgramacionA)
        }

        val botonPB = findViewById<Button>(R.id.buttonProgramacionB)
        botonPB.text = getString(R.string.buttonProgramacionB)
        botonPB.textSize = 15f
        botonPB.setTextColor(Color.parseColor("#FF000000"))
        botonPB.setOnClickListener {
            val vaProgramacionB = Intent(this, ProgramacionB::class.java)
            startActivity(vaProgramacionB)
        }

        val botonLM = findViewById<Button>(R.id.buttonLenguajeMarcas)
        botonLM.text = getString(R.string.buttonLenguajeMarcas)
        botonLM.textSize = 15f
        botonLM.setTextColor(Color.parseColor("#FF000000"))
        botonLM.setOnClickListener {
            val vaLenguajeMarcas = Intent(this, LenguajeMarcas::class.java)
            startActivity(vaLenguajeMarcas)
        }

        val botonED = findViewById<Button>(R.id.buttonEntornosDesarrollo)
        botonED.text = getString(R.string.buttonEntornosDesarrollo)
        botonED.textSize = 15f
        botonED.setTextColor(Color.parseColor("#FF000000"))
        botonED.setOnClickListener {
            val vaEntornosDesarrollo = Intent(this, EntornosDesarrollo::class.java)
            startActivity(vaEntornosDesarrollo)
        }

        val botonDWC = findViewById<Button>(R.id.buttonDesarrolloWebCliente)
        botonDWC.text = getString(R.string.buttonDesarrolloWebCliente)
        botonDWC.textSize = 15f
        botonDWC.setTextColor(Color.parseColor("#FF000000"))
        botonDWC.setOnClickListener {
            val vaDesarrolloWebCliente = Intent(this, DesarrolloWebCliente::class.java)
            startActivity(vaDesarrolloWebCliente)
        }

        val botonDeWS = findViewById<Button>(R.id.buttonDesarrolloWebServidor)
        botonDeWS.text = getString(R.string.buttonDesarrolloWebServidor)
        botonDeWS.textSize = 15f
        botonDeWS.setTextColor(Color.parseColor("#FF000000"))
        botonDeWS.setOnClickListener {
            val vaDesarrolloWebServidor = Intent(this, DesarrolloWebServidor::class.java)
            startActivity(vaDesarrolloWebServidor)
        }

        val botonDApW = findViewById<Button>(R.id.buttonDespliegueAppWeb)
        botonDApW.text = getString(R.string.buttonDespliegueAppWeb)
        botonDApW.textSize = 15f
        botonDApW.setTextColor(Color.parseColor("#FF000000"))
        botonDApW.setOnClickListener {
            val vaDespliegueAplicacionesWeb = Intent(this, DespliegueAplicacionesWeb::class.java)
            startActivity(vaDespliegueAplicacionesWeb)
        }

        val botonDIW = findViewById<Button>(R.id.buttonDiseño)
        botonDIW.text = getString(R.string.buttonDiseño)
        botonDIW.textSize = 15f
        botonDIW.setTextColor(Color.parseColor("#FF000000"))
        botonDIW.setOnClickListener {
            val vaDisenoInterfacesWeb = Intent(this, DisenoInterfacesWeb::class.java)
            startActivity(vaDisenoInterfacesWeb)
        }

        val botonFOL = findViewById<Button>(R.id.buttonFOL)
        botonFOL.text = getString(R.string.buttonFOL)
        botonFOL.textSize = 15f
        botonFOL.setTextColor(Color.parseColor("#FF000000"))
        botonFOL.setOnClickListener {
            val vaFormacionOrientacionLaboral = Intent(this, FormacionOrientacionLaboral::class.java)
            startActivity(vaFormacionOrientacionLaboral)
        }

        val botonEIE = findViewById<Button>(R.id.buttonEIE)
        botonEIE.text = getString(R.string.buttonEIE)
        botonEIE.textSize = 15f
        botonEIE.setTextColor(Color.parseColor("#FF000000"))
        botonEIE.setOnClickListener {
            val vaEmpresaIniciativaEmprendedora = Intent(this, EmpresaIniciativaEmprendedora::class.java)
            startActivity(vaEmpresaIniciativaEmprendedora)
        }
    }



















    //Para crear el menú dentro de la actividad principal
    @Override
    override fun onCreateOptionsMenu(miMenu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_daw,miMenu)

        return true
    }

    //Para configurar las acciones del menú
    @Override
    override fun onOptionsItemSelected(opcionMenu: MenuItem): Boolean {

        var id = opcionMenu.itemId

        when(id){
            R.id.salir -> finish()
            R.id.info -> eleccion_actividad(intencion= Intent(this, Informacion_desarrolladores::class.java) )
            R.id.sistemas_informaticos -> eleccion_actividad(intencion= Intent(this,SistemasInformaticos::class.java) )
            R.id.bbdd_a -> eleccion_actividad(intencion= Intent(this,BaseDatosA::class.java) )
            R.id.bbdd_b -> eleccion_actividad(intencion= Intent(this,BaseDatosB::class.java) )
            R.id.programacion_a -> eleccion_actividad(intencion= Intent(this,ProgramacionA::class.java) )
            R.id.programacion_b -> eleccion_actividad(intencion= Intent(this,ProgramacionB::class.java) )
            R.id.lenguaje_marcas -> eleccion_actividad(intencion= Intent(this,LenguajeMarcas::class.java) )
            R.id.entornos_desarrollo -> eleccion_actividad(intencion= Intent(this,EntornosDesarrollo::class.java) )
            R.id.FOL -> eleccion_actividad(intencion= Intent(this,FormacionOrientacionLaboral::class.java) )
            R.id.empresa_iniciativa -> eleccion_actividad(intencion= Intent(this,EmpresaIniciativaEmprendedora::class.java) )
            R.id.desarrollo_web_cliente -> eleccion_actividad(intencion= Intent(this,DesarrolloWebCliente::class.java) )
            R.id.desarrollo_web_servidor -> eleccion_actividad(intencion= Intent(this,DesarrolloWebServidor::class.java) )
            R.id.despliegue_aplicaciones_web -> eleccion_actividad(intencion= Intent(this,DespliegueAplicacionesWeb::class.java) )
            R.id.interfaces_web -> eleccion_actividad(intencion= Intent(this,DisenoInterfacesWeb::class.java) )
        }

        return super.onOptionsItemSelected(opcionMenu)
    }

    fun eleccion_actividad(intencion: Intent){
        startActivity(intencion)
    }
}