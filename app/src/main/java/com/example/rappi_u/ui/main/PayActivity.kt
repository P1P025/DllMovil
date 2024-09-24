package com.example.rappi_u.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.rappi_u.R

class PayActivity : AppCompatActivity(), PayView {

    private lateinit var presenter: PayPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pay)

        presenter = PayPresenter(this)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            presenter.onButtonClick()
        }
    }

    override fun navigateToMainActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}
