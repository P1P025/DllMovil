package model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context?) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        val createTable = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_CEDULA + " TEXT PRIMARY KEY, " +
                COLUMN_NOMBRE + " TEXT, " +
                COLUMN_APELLIDO + " TEXT, " +
                COLUMN_CORREO + " TEXT, " +
                COLUMN_CELULAR + " TEXT, " +
                COLUMN_RESPONSE + " TEXT)"
        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME)
        onCreate(db)
    }

    companion object {
        const val DATABASE_NAME = "rappi_u.db"
        const val DATABASE_VERSION = 1
        const val TABLE_NAME = "responses"
        const val COLUMN_CEDULA = "cedula"
        const val COLUMN_NOMBRE = "nombre"
        const val COLUMN_APELLIDO = "apellido"
        const val COLUMN_CORREO = "correo"
        const val COLUMN_CELULAR = "celular"
        const val COLUMN_RESPONSE = "response"
    }
}
