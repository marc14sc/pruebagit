package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.conectiondb.R;

public class elegir_accion extends AppCompatActivity {

    Button btnCreate;
    Button btnRead;
    Button btnUpdate;
    Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elegir_accion);



        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnRead = (Button) findViewById(R.id.btnRead);
        btnUpdate =(Button) findViewById(R.id.btnUpdate);
        btnDelete =(Button) findViewById(R.id.btnDelete);

        btnCreate.setOnClickListener(corkyListener);
        btnRead.setOnClickListener(corkyListener2);
    }


    private View.OnClickListener corkyListener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            Intent pantallaCreate = new Intent(getApplicationContext(), RegistrarCliente.class);
            startActivity(pantallaCreate);
        }
    };


    private View.OnClickListener corkyListener2 = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            Intent pantallaCreate = new Intent(getApplicationContext(), LeerDatos.class);
            startActivity(pantallaCreate);
        }
    };
}