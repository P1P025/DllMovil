package com.example.rappi_u.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.rappi_u.R

class MainActivity2 : AppCompatActivity(), MainView2 {

    private lateinit var presenter: MainPresenter2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        presenter = MainPresenter2(this)

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
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun navigateToMainActivity3() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }
}
