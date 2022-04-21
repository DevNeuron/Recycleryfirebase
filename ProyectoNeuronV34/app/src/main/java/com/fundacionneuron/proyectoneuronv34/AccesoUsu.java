package com.fundacionneuron.proyectoneuronv34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class AccesoUsu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso_usu);
        TextView neuron = findViewById(R.id.neuron);

        ImageButton ibCita = (ImageButton) findViewById(R.id.ibCita);
        ibCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AccesoUsu.this, Registro.class);
                startActivity(intent);
            }
        });

        ImageButton ibPedirCita = (ImageButton) findViewById(R.id.ibPedirCita);
        ibPedirCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(AccesoUsu.this,loginPedirCita.class);
                startActivity(intent);
            }
        });

        ImageButton ibZona = (ImageButton) findViewById(R.id.ibZona);
        ibZona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccesoUsu.this, LoginMizona.class);
                startActivity(intent);
            }
        });
        neuron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://fundacionneuron.org/";

                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });
    }
}