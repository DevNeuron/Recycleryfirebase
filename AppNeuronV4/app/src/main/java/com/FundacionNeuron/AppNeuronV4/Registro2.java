package com.FundacionNeuron.AppNeuronV4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Registro2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);
        EditText etCaso=findViewById(R.id.etCaso);
        Button Registro2=findViewById(R.id.bRegistro2);
        String caso=etCaso.getText().toString();
        Registro2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if(!caso.isEmpty()){
                    Intent i =new Intent(Registro2.this, Registro3.class);
                    startActivity(i);
                }
            }
        });
    }
}