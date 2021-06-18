package com.example.proyecto1

import Asignaturas.*
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class DAM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dam)

        val botonSI = findViewById<Button>(R.id.buttonSistemasInformaticos)
        botonSI.text = getString(R.string.buttonSistemasInformaticos)
        botonSI.textSize = 15f
        botonSI.setTextColor(Color.parseColor("#FF000000"))
        // Agregamos al botón la funcionalidad para que pase a la otra actividad.
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
        // Agregamos al botón la funcionalidad para que pase a la otra actividad.
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

        val botonAD = findViewById<Button>(R.id.buttonAccesoDatos)
        botonAD.text = getString(R.string.buttonAccesoDatos)
        botonAD.textSize = 15f
        botonAD.setTextColor(Color.parseColor("#FF000000"))
        botonAD.setOnClickListener {
            val vaAccesoDatos = Intent(this, AccesoDatos::class.java)
            startActivity(vaAccesoDatos)
        }

        val botonDI = findViewById<Button>(R.id.buttonDesarrolloInterfaces)
        botonDI.text = getString(R.string.buttonDesarrolloInterfaces)
        botonDI.textSize = 15f
        botonDI.setTextColor(Color.parseColor("#FF000000"))
        botonDI.setOnClickListener {
            val vaDesarrolloInterfaces = Intent(this, DesarrolloInterfaces::class.java)
            startActivity(vaDesarrolloInterfaces)
        }

        val botonPM = findViewById<Button>(R.id.buttonProgramacionMultimedia)
        botonPM.text = getString(R.string.buttonProgramacionMultimedia)
        botonPM.textSize = 15f
        botonPM.setTextColor(Color.parseColor("#FF000000"))
        botonPM.setOnClickListener {
            val vaProgramacionMultimedia = Intent(this, ProgramacionMultimedia::class.java)
            startActivity(vaProgramacionMultimedia)
        }

        val botonPS = findViewById<Button>(R.id.buttonProgramacionServicios)
        botonPS.text = getString(R.string.buttonProgramacionServicios)
        botonPS.textSize = 15f
        botonPS.setTextColor(Color.parseColor("#FF000000"))
        botonPS.setOnClickListener {
            val vaProgramacionServiciosProcesos = Intent(this, ProgramacionServiciosProcesos::class.java)
            startActivity(vaProgramacionServiciosProcesos)
        }

        val botonSG = findViewById<Button>(R.id.buttonSistemasGestion)
        botonSG.text = getString(R.string.buttonSistemasGestion)
        botonSG.textSize = 15f
        botonSG.setTextColor(Color.parseColor("#FF000000"))
        botonSG.setOnClickListener {
            val vaSistemaGestionEmpresarial = Intent(this, SistemaGestionEmpresarial::class.java)
            startActivity(vaSistemaGestionEmpresarial)
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
        menuInflater.inflate(R.menu.menu_dam,miMenu)

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
            R.id.acceso_datos -> eleccion_actividad(intencion= Intent(this,AccesoDatos::class.java) )
            R.id.interfaces -> eleccion_actividad(intencion= Intent(this,DesarrolloInterfaces::class.java) )
            R.id.multimedia -> eleccion_actividad(intencion= Intent(this,ProgramacionMultimedia::class.java) )
            R.id.servicios_procesos -> eleccion_actividad(intencion= Intent(this,ProgramacionServiciosProcesos::class.java) )
            R.id.gestion_empresarial -> eleccion_actividad(intencion= Intent(this,SistemaGestionEmpresarial::class.java) )
            R.id.FOL -> eleccion_actividad(intencion= Intent(this,FormacionOrientacionLaboral::class.java) )
            R.id.empresa_iniciativa -> eleccion_actividad(intencion= Intent(this,EmpresaIniciativaEmprendedora::class.java) )
        }

        return super.onOptionsItemSelected(opcionMenu)
    }

    fun eleccion_actividad(intencion: Intent){
        startActivity(intencion)
    }
}