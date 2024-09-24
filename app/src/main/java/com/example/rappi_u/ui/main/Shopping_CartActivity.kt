package com.example.rappi_u.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.rappi_u.R

class Shopping_CartActivity : AppCompatActivity(), Shopping_CartView {

    private lateinit var presenter: Shopping_CartPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shopping_cart)

        presenter = Shopping_CartPresenter(this)

        val imageButton: ImageButton = findViewById(R.id.imageButton)
        val imageButton2: ImageButton = findViewById(R.id.imageButton4)

        imageButton.setOnClickListener {
            presenter.onImageButtonClick()
        }

        imageButton2.setOnClickListener {
            presenter.onImageButton2Click()
        }
    }

    override fun navigateToMainActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    override fun navigateToMainActivity3() {
        val intent = Intent(this, PayActivity::class.java)
        startActivity(intent)
    }
}
