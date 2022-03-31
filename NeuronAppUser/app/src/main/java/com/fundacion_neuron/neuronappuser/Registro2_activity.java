package com.karl.proyectoneuronuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Registro2_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);

        EditText etCaso=findViewById(R.id.etCaso);
        RadioGroup rg=findViewById(R.id.rg);
        RadioButton rbFamilia=findViewById(R.id.rbFamilia);
        RadioButton rbTrabaja=findViewById(R.id.rbTrabaja);
        RadioButton rbDoc=findViewById(R.id.rbDoc);
        RadioButton rbNeuro=findViewById(R.id.rbNeuro);
        RadioButton rbInfantil=findViewById(R.id.rbInfantil);




    }
}