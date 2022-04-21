package com.fundacionneuron.proyectoneuronv34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.PatternsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        EditText etNombre = findViewById(R.id.etNombre);
        EditText etApellidos = findViewById(R.id.etApellidos);
        EditText etEdad = findViewById(R.id.etEdad);
        EditText etTelefono = findViewById(R.id.etTelefono);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etEmail2 = findViewById(R.id.etEmail2);
        EditText etContra = findViewById(R.id.etContra);
        EditText etContra2 = findViewById(R.id.etContra2);
        TextView tv = findViewById(R.id.tv);
        Button bRegistro = findViewById(R.id.bRegistro);

        String nombre = etNombre.getText().toString();
        String apellidos = etApellidos.getText().toString();
        int edad = Integer.parseInt(etEdad.getText().toString());
        String email = etEmail.getText().toString();
        String verEmail = etEmail2.getText().toString();
        String pass = etContra.getText().toString();
        String pass2 = etContra2.getText().toString();
        int tel = Integer.parseInt(etTelefono.getText().toString());

        bRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nombre.isEmpty() || apellidos.isEmpty() || etEdad.getText().toString().length()==0 || email.isEmpty()
                        || verEmail.isEmpty() || pass.isEmpty() || pass2.isEmpty()||etTelefono.getText().toString().length()==0) {
                    tv.setText("Rellene todos los campos");
                } else if (email.equals(verEmail)) {
                    tv.setText("El Email debe coincidir");
                } else if (pass.equals(pass2)) {
                    tv.setText("Las contraseñas deben coincidir");

                } else if (PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()) {
                    tv.setText("Debes introducir un formato de Email valido");

                } else if (PatternsCompat.EMAIL_ADDRESS.matcher(verEmail).matches()) {
                    tv.setText("Debes introducir un  formato de Email valido");


                } else {
                    Intent i = new Intent(Registro.this, Registro2.class);
                    startActivity(i);
                }
            }
        });

    }
}