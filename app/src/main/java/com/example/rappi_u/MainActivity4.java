package com.example.rappi_u;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private Button cancelButton, sendButton;
    private DatabaseHelper databaseHelper;
    private EditText cedulaEditText, nameEditText, surnameEditText, emailEditText, phoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        cancelButton = findViewById(R.id.button2);
        sendButton = findViewById(R.id.button3);
        cedulaEditText = findViewById(R.id.editTextNumber);
        nameEditText = findViewById(R.id.editTextText7);
        surnameEditText = findViewById(R.id.editTextText8);
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        phoneEditText = findViewById(R.id.editTextPhone);

        databaseHelper = new DatabaseHelper(this);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cedula = cedulaEditText.getText().toString();
                String name = nameEditText.getText().toString();
                String surname = surnameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String response = "Enviado con exito";
                saveData(cedula, name, surname, email, phone, response);
            }
        });
    }

    private void saveData(String cedula, String name, String surname, String email, String phone, String response) {
        SQLiteDatabase db = databaseHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.COLUMN_CEDULA, cedula);
        values.put(DatabaseHelper.COLUMN_NOMBRE, name);
        values.put(DatabaseHelper.COLUMN_APELLIDO, surname);
        values.put(DatabaseHelper.COLUMN_CORREO, email);
        values.put(DatabaseHelper.COLUMN_CELULAR, phone);
        values.put(DatabaseHelper.COLUMN_RESPONSE, response);
        db.insert(DatabaseHelper.TABLE_NAME, null, values);
        db.close();
    }
}
