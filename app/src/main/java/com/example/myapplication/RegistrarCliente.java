package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.example.conectiondb.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RegistrarCliente  extends AppCompatActivity {



        EditText email, password, nombre, apellidos, direccion, numero, cp, localidad, provincia, pais;
        String  semail,spassword, snombre, sapellidos, sdireccion, snumero, scp, slocalidad, sprovincia,spais;
        Button btnRegistrar;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btnRegistrar = (Button) findViewById(R.id.btnRegistrarCliente);
            email = (EditText) findViewById(R.id.formEmail);
            password = (EditText) findViewById(R.id.formPassword);
            nombre = (EditText) findViewById(R.id.formNombre);
            apellidos = (EditText) findViewById(R.id.formApellidos);
            direccion = (EditText) findViewById(R.id.formDireccion);
            numero = (EditText) findViewById(R.id.formNumero);
            cp = (EditText) findViewById(R.id.formCP);
            localidad = (EditText) findViewById(R.id.formLocalidad);
            provincia = (EditText) findViewById(R.id.formProvincia);
            pais = (EditText) findViewById(R.id.formPais);

            //cargarWebService();
            //cargarDatosArrayJson();

            //btnRegistrar.setOnClickListener(registroCliente);
        }

/*

    private View.OnClickListener registroCliente = new View.OnClickListener() {
       @Override
        public void onClick(View v) {

            // do something when the button is clicked

           snombre = nombre.getText().toString().trim();
           sapellidos = apellidos.getText().toString().trim();
           semail = email.getText().toString().trim();
           spassword = password.getText().toString().trim();
           sdireccion = direccion.getText().toString().trim();
           snumero = numero.getText().toString().trim();
           scp = cp.getText().toString().trim();
           slocalidad = localidad.getText().toString().trim();
           sprovincia = provincia.getText().toString().trim();
           spais = pais.getText().toString().trim();

           StringRequest request = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
               @Override
               public void onResponse(String response) {

               }
           });




        }

 */
    }


























/*
        private void cargarWebService() {

            String url = "https://pruebashandel.000webhostapp.com/PHP/consulta_clientes.php";
            StringRequest request = new StringRequest(
                    Request.Method.GET, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    textView.setText(response);
                    Toast.makeText(getApplicationContext(), "teste"+response.toString(), Toast.LENGTH_SHORT).show();
                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }
            );
            VolleySingleton.getInstanciaVolley(getApplicationContext()).addToRequestQueue(request);

        }


        private void cargarDatosArrayJson(){
            String url = "https://pruebashandel.000webhostapp.com/PHP/consulta_clientes.php";

            JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                    Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    int size = response.length();
                    for (int i = 0; i < size; i++) {

                        try {
                            JSONObject jsonObject = new JSONObject(response.get(i).toString());
                            String nombre = jsonObject.getString("Nombre");
                            textView.setText(" NOMBRE"+ nombre + "\n");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }
            );
            VolleySingleton.getInstanciaVolley(getApplicationContext()).addToRequestQueue(jsonArrayRequest);

        }



*/