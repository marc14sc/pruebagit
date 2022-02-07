package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.conectiondb.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LeerDatos extends AppCompatActivity {

    TextView screenText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leer_datos);
        screenText = (TextView) findViewById(R.id.screenText);
        cargarDatosArrayJson();
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
                        String email = jsonObject.getString("Email");
                        screenText.setText(" NOMBRE: "+ nombre + " Email: "+ email + "\n");
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
}