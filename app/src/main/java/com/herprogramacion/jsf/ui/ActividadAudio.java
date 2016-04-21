package com.herprogramacion.jsf.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.herprogramacion.jsf.R;

/**
 * Created by Mauricio Bautista on 05/04/2016.
 */
public class ActividadAudio extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fila_lista_audios);
        registrarEventos();
    }

    private void registrarEventos(){

        /// selecciona la lista en pantalla segun su ID
        ListView lista1 = (ListView) findViewById(R.id.miLista);

        // registra una accion para el evento click
        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> aprent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://soundcloud.com/mauricio-bautista-994671241/introduccion-curso-java-server")));
                        break;
                    case 1 :
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://soundcloud.com/mauricio-bautista-994671241/que-es-java-server-faces")));
                        break;
                    case 2 :
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://soundcloud.com/mauricio-bautista-994671241/que-es-una-aplicacion-java")));
                        break;
                    case 3 :
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://soundcloud.com/mauricio-bautista-994671241/el-ciclo-de-vida-de-una-pagina")));
                        break;
                    case 4 :
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://soundcloud.com/mauricio-bautista-994671241/etiquetas-jsf")));
                        break;
                    default:
                }

            }
        });

    }
}
