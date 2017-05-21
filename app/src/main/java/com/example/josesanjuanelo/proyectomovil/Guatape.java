package com.example.josesanjuanelo.proyectomovil;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Guatape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guatape);
    }

    public void mostrar_mapa (View v){
        Intent i = new Intent(Guatape.this,Mapa_Guatape.class);
        startActivity(i);
    }
}
