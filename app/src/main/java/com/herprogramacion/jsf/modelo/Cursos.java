package com.herprogramacion.jsf.modelo;

import android.support.v7.app.AppCompatActivity;

import com.herprogramacion.jsf.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de datos estático para alimentar la aplicación
 */

/**
 * Created by Mauricio Bautista on 17/02/2016.
 */
public class Cursos extends AppCompatActivity{
    //declaracion de las variables que llenaran nuestra vista
    private String curso;
    private String eslogan;
    private int idDrawable;

    //el cursor se encarga de posicionar cada elemento es su lugar
    public Cursos(String curso, String eslogan, int idDrawable) {
        this.curso = curso;
        this.eslogan = eslogan;
        this.idDrawable = idDrawable;
    }
    //Lista de cursos, imagenes que se muestran el inicio de la aplicacion
    public static  final List<Cursos> CURSOS = new ArrayList<Cursos>();



    /**
     * Nombre y descripcion de otros cursos en inicio de la aplicacion se podran descargar
     */
    static{
        CURSOS.add(new Cursos("JBoss","Servidor de aplicaciones Java EE", R.drawable.jboss));
        CURSOS.add(new Cursos("GlassFish","Servidor de aplicaciones de Sun MicroSystems", R.drawable.glassfish));
        CURSOS.add(new Cursos("Hibernate","Mapeo en base de datos", R.drawable.hibernate_logo));
        CURSOS.add(new Cursos("RichFaces","Aplicaciones Ricas con JAva", R.drawable.rich_faces));


    }

    //Getters y Setters
    public String getCurso() {
        return curso;
    }

    public String getEslogan() {
        return eslogan;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}


