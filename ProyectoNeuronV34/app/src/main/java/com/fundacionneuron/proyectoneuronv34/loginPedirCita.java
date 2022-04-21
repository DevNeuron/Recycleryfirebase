package com.fundacionneuron.proyectoneuronv34;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.PatternsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginPedirCita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pedir_cita);

        EditText etUser = findViewById(R.id.etUser);
        EditText etPass = findViewById(R.id.etPass);
        TextView tv2 = findViewById(R.id.tv2);
        Button bLog=findViewById(R.id.bLog);
        String user = etUser.getText().toString();
        String pass = etPass.getText().toString();


        bLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.isEmpty() || pass.isEmpty()) {
                    tv2.setText("los campos no pueden estar vacios");
                } else if (PatternsCompat.EMAIL_ADDRESS.matcher(user).matches()) {
                    tv2.setText("Debes introducir un  formato de Email valido");
                } else{
                    Intent i= new Intent(loginPedirCita.this,PedirCita.class);
                    startActivity(i);
                }
            }
        });

    }

}