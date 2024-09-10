package com.example.rappi_u.ui.main

import android.content.ContentValues
import model.DatabaseHelper

class MainPresenter4(private val view: MainView4, private val dbHelper: DatabaseHelper) {

    fun saveData(cedula: String, name: String, surname: String, email: String, phone: String, response: String) {
        val db = dbHelper.writableDatabase
        val values = ContentValues()
        values.put(DatabaseHelper.COLUMN_CEDULA, cedula)
        values.put(DatabaseHelper.COLUMN_NOMBRE, name)
        values.put(DatabaseHelper.COLUMN_APELLIDO, surname)
        values.put(DatabaseHelper.COLUMN_CORREO, email)
        values.put(DatabaseHelper.COLUMN_CELULAR, phone)
        values.put(DatabaseHelper.COLUMN_RESPONSE, response)

        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()

        view.showMessage("Data saved successfully!")
    }
}
