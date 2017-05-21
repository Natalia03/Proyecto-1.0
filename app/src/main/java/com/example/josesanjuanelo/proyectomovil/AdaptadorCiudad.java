package com.example.josesanjuanelo.proyectomovil;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jose Sanjuanelo on 05/05/2017.
 */

public class AdaptadorCiudad extends BaseAdapter {

    private Context contexto;
    private ArrayList<Ciudad> ciudad;
    public AdaptadorCiudad(Context contexto, ArrayList<Ciudad> ciudad) {
        this.contexto = contexto;
        this.ciudad = ciudad;
    }

    @Override

    public int getCount() { return ciudad.size(); }

    @Override

    public Object getItem(int position) { return ciudad.get(position); }

    @Override

    public long getItemId(int position) { return 0; }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        TextView idd, depart, ciud;
        ImageView foto;
        LayoutInflater inflater;
        View ItemView;

        //Inflater
        inflater =(LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ItemView = inflater.inflate(R.layout.item_ciudad, null);

        //captura objetos

        idd = (TextView)ItemView.findViewById(R.id.lblId);
        depart = (TextView)ItemView.findViewById(R.id.lblNombDep);
        ciud = (TextView)ItemView.findViewById(R.id.lblNombCiu);
        foto = (ImageView) ItemView.findViewById(R.id.imgFoto);

        //pasar objetos

        idd.setText(""+ciudad.get(position).getNumero());
        depart.setText(ciudad.get(position).getNombreDep());
        ciud.setText(ciudad.get(position).getNombCiu());
        foto.setImageResource(Integer.parseInt(ciudad.get(position).getFoto()));

        //retorno itemview

        return ItemView;
    }
}
