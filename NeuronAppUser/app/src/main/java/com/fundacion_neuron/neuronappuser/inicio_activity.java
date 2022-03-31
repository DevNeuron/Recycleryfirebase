package com.karl.proyectoneuronuser;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class inicio_activity extends AppCompatActivity {
    EditText etUser, etPassword;
    TextView tvUser, tvPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_activity);
        Button bRegistro = findViewById(R.id.bRegistro);
        Button bIninicio = findViewById(R.id.bInicio);
        etUser = findViewById(R.id.etUser);
        etPassword = findViewById(R.id.etPassword);
        tvUser = findViewById(R.id.tvUser);
        tvPass = findViewById(R.id.tvUser);


        bRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registro = new Intent(inicio_activity.this, Registro1_activity.class);
                startActivity(registro);


            }
        });


        bIninicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newUsuario = etUser.getText().toString();
                String newPass = etPassword.getText().toString();
                String superUser = "user";
                String superPass = "pass";

                if(newUsuario.equals(superUser)&&newPass.equals(superPass)) {
                    Intent iniciar = new Intent(inicio_activity.this, Inicio2_activity.class);
                    startActivity(iniciar);
                } if (newUsuario.isEmpty()) {

                    tvUser.setText("El campo usuario esta vacio");

                } else if (!newUsuario.equals(etUser)) {
                    tvUser.setText("Usuario o contraseña erroneo");
                } else if (newPass.isEmpty()) {
                    tvPass.setText("El campo contraseña esta vacio");

                } else if (!newPass.equals(etPassword)) {
                    tvPass.setText("Usuario o contraseña erroneo");
                    //borrar esta contraseña de pruebas
                }else if(newUsuario.equals(superUser)&&newPass.equals(superPass)){
                    Intent iniciar = new Intent(inicio_activity.this, Inicio2_activity.class);
                    startActivity(iniciar);
                } else {
                    Intent iniciar = new Intent(inicio_activity.this, Inicio2_activity.class);
                    startActivity(iniciar);
                }
            }
        });


    }


}
