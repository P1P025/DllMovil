package com.example.rappi_u.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rappi_u.R

class MainActivity3 : AppCompatActivity(), MainView3 {

    private lateinit var presenter: MainPresenter3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        presenter = MainPresenter3(this)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            presenter.onButtonClick()
        }
    }

    override fun navigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
