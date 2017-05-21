package com.example.josesanjuanelo.proyectomovil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarCiudad extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Ciudad> ciudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_ciudad);

        lista = (ListView)findViewById(R.id.lvOpcCiudades);
        ciudades = Departamento.traerCiudades(getApplicationContext());

        AdaptadorCiudad adapter = new AdaptadorCiudad(this, ciudades);
        lista.setAdapter(adapter);
    }
}
