package com.fundacionneuron.proyectoneuronv34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask splash = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(Splash.this, Acceso.class);
                startActivity(i);
                finish();
            }
        };
        Timer tiempoEspera=new Timer();
        tiempoEspera.schedule(splash, 2500);
    }
}