package com.example.josesanjuanelo.proyectomovil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jose Sanjuanelo on 21/05/2017.
 */

public class PuntuacionSQLLiteOpenHelper extends SQLiteOpenHelper {
    String sql1= "CREATE TABLE Puntuacion(IdPuntuacion text, puntuacion text)";

    public PuntuacionSQLLiteOpenHelper(Context contexto, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(contexto, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST Puntuacion");
        db.execSQL(sql1);
    }
}
