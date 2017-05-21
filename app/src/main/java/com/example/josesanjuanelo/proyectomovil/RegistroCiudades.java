package com.example.josesanjuanelo.proyectomovil;

import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class RegistroCiudades extends AppCompatActivity {

    private Spinner cbxDepartamentos;
    private EditText cajaCiudad;
    private Resources res;
    private ArrayList<Ciudad> k = new ArrayList();
    private ArrayAdapter<String> ad1;
    private String [] opc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_ciudades2);

        res = this.getResources();
        cajaCiudad = (EditText)findViewById(R.id.txtCiudadRegistro);
        cbxDepartamentos = (Spinner)findViewById(R.id.spnDepartamentosRegistro);

        opc1 = this.getResources().getStringArray(R.array.deptos);

        ad1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,opc1);

        cbxDepartamentos.setAdapter(ad1);
    }

    public void registrar (View v) {
    int c= Departamento.traerCiudades(getApplicationContext()).size()+1;
        if (validar()) {
            String nombreDep, nombreCiu, foto;
            nombreCiu = cajaCiudad.getText().toString().trim();
            nombreDep = cbxDepartamentos.getSelectedItem().toString();

            foto = String.valueOf(aleatorio());
            Ciudad n = new Ciudad(c, foto, nombreDep, nombreCiu);
            n.guardar(getApplicationContext());

            //msj.setText(res.getString(R.string.mensaje));
            new AlertDialog.Builder(this).setMessage(res.getString(R.string.mensaje)).show();
            limpiar();
        }
    }

    public int aleatorio(){
        int fotos[] = {R.drawable.images};
        int numero = 0;
        return  fotos[numero];
    }

    public void limpiar (){
            cajaCiudad.setText("");
            cbxDepartamentos.setSelection(0);
            cajaCiudad.requestFocus();
    }

    public boolean validar(){
        if (cajaCiudad.getText().toString().isEmpty() ){
            //Toast.makeText(getApplicationContext(), "Digite por favor el nombre" , Toast.LENGTH_SHORT).show();
            cajaCiudad.setError(getResources().getString(R.string.error_1));
            return false;
        }

        return true;
    }

}
