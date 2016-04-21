package com.herprogramacion.jsf.quiz;

import android.database.sqlite.SQLiteDatabase;


/**
 * Created by Mauricio Bautista on 23/02/2016.
 * Faltan comentarios en la clase y los metodos
 */
public interface UsuarioDAO {
    void agregar(Usuario usuario, SQLiteDatabase db);
}
