package com.example.josesanjuanelo.proyectomovil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Jose Sanjuanelo on 21/05/2017.
 */

public class Puntuacion {
    private double puntuacion;
    private double total;
    private String numero;

    public Puntuacion(String numero, double puntuacion, double total) {
        this.numero = numero;
        this.puntuacion = puntuacion;
        this.total = total;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void guardar(Context contexto){
        SQLiteDatabase db;
        String sql1;

        DepartamentosSQLLiteOpenHelper aux = new DepartamentosSQLLiteOpenHelper(contexto, "DBCiudades", null, 1);
        db = aux.getWritableDatabase();

        sql1 = "INSERT INTO Ciudades values('"+this.getNumero()+"','"+this.getPuntuacion()+"','"+this.getTotal()+"')";
        db.execSQL(sql1);
    }
}
