package com.herprogramacion.jsf.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.herprogramacion.jsf.R;
import com.herprogramacion.jsf.quiz.LoginInterno;

/**
 * Created by Mauricio Bautista on 04/04/2016.
 */
public class PrivilegiosActivity extends Activity {

    private Button btnPrevilegios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.privilegios_layout);

        btnPrevilegios = (Button)findViewById(R.id.btn_privilegios);


    }

    public void introduccionPrivilegios(View view) {
        /*
        Intent intent  = new Intent(this, Login.class);
        Button button = (Button)findViewById(R.id.btn_privilegios);
        startActivity(intent);
        */
        startActivity(new Intent(PrivilegiosActivity.this, LoginInterno.class));

    }
    protected void onPause(){
        super.onPause();
        finish(); //termina la actividad
    }


}
