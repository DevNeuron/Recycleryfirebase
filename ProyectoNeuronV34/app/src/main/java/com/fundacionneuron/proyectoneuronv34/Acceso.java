package com.fundacionneuron.proyectoneuronv34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
        ImageButton ibUsuario = (ImageButton) findViewById(R.id.ibUsuario);



        ibUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Acceso.this, AccesoUsu.class);
                startActivity(i);
            }
        });
        /*ImageButton ibPersonal =(ImageButton) findViewById(R.id.ibPersonal);
        ibPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(Acceso.this,AccesoPers.class);
            startActivity(i);
            }
        });*/
    }
}