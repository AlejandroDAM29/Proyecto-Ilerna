package Asignaturas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.proyecto1.Informacion_desarrolladores
import com.example.proyecto1.R

class DesarrolloWebCliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desarrollo_web_cliente)
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