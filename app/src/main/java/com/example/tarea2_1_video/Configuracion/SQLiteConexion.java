package com.example.tarea2_1_video.Configuracion;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.tarea2_1_video.Tablas.Transacciones;

public class SQLiteConexion extends SQLiteOpenHelper {


    public SQLiteConexion(Context context,
                          String dbname,
                          SQLiteDatabase.CursorFactory factory,
                          int version)
    {
        super(context, dbname, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Transacciones.CTvideos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(Transacciones.DropTVideos);
        onCreate(db);
    }
}
