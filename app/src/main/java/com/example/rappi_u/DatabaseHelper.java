package com.example.rappi_u;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "rappi_u.db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "responses";
    public static final String COLUMN_CEDULA = "cedula";
    public static final String COLUMN_NOMBRE = "nombre";
    public static final String COLUMN_APELLIDO = "apellido";
    public static final String COLUMN_CORREO = "correo";
    public static final String COLUMN_CELULAR = "celular";
    public static final String COLUMN_RESPONSE = "response";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_CEDULA + " TEXT PRIMARY KEY, " +
                COLUMN_NOMBRE + " TEXT, " +
                COLUMN_APELLIDO + " TEXT, " +
                COLUMN_CORREO + " TEXT, " +
                COLUMN_CELULAR + " TEXT, " +
                COLUMN_RESPONSE + " TEXT)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
