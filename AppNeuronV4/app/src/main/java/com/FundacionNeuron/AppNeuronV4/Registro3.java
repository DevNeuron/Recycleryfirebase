package com.FundacionNeuron.AppNeuronV4;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Registro3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro3);
        Intent i = new Intent( new Intent(Registro3.this,MainActivity.class));
        startActivity(i);
    }
}