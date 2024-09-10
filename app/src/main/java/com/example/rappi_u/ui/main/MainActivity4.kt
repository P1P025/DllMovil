package com.example.rappi_u.ui.main

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.rappi_u.R
import model.DatabaseHelper

class MainActivity4 : AppCompatActivity(), MainView4 {

    private lateinit var presenter: MainPresenter4
    private lateinit var cedulaEditText: EditText
    private lateinit var nameEditText: EditText
    private lateinit var surnameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val dbHelper = DatabaseHelper(this)
        presenter = MainPresenter4(this, dbHelper)


        cedulaEditText = findViewById(R.id.editTextNumber)
        nameEditText = findViewById(R.id.editTextText7)
        surnameEditText = findViewById(R.id.editTextText8)
        emailEditText = findViewById(R.id.editTextTextEmailAddress)
        phoneEditText = findViewById(R.id.editTextPhone)

        val cancelButton: Button = findViewById(R.id.button2)
        val sendButton: Button = findViewById(R.id.button3)

        cancelButton.setOnClickListener {
            presenter.saveData(
                    cedulaEditText.text.toString(),
                    nameEditText.text.toString(),
                    surnameEditText.text.toString(),
                    emailEditText.text.toString(),
                    phoneEditText.text.toString(),
                    "Enviado con éxito"
            )
        }

        sendButton.setOnClickListener {
            finish()
        }
    }

    override fun showMessage(message: String) {
        // Muestra el mensaje
    }

    override fun navigateBack() {
        finish()
    }
}
