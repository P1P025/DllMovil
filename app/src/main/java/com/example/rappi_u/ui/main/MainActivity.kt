package com.example.rappi_u.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappi_u.R

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var presenter: MainPresenter
    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var searchView: SearchView
    private lateinit var imageButton1: ImageButton
    private lateinit var imageButton2: ImageButton
    private lateinit var registerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        imageButton1 = findViewById(R.id.imageButton2)
        imageButton2 = findViewById(R.id.imageButton6)
        registerButton = findViewById(R.id.button_register)
        searchView = findViewById(R.id.searchView)

        searchView.setOnQueryTextFocusChangeListener { v, hasFocus ->
            // Create and start the Intent for the search activity
            this.navigateToSearch()
            Toast.makeText(this, "Clic en: Search Text", Toast.LENGTH_SHORT).show()

        }
        imageButton1.setOnClickListener {
            presenter.onImageButton1Click()
        }

        imageButton2.setOnClickListener {
            presenter.onImageButton2Click()
        }

        registerButton.setOnClickListener {
            presenter.onRegisterButtonClick()
        }

        constraintLayout = findViewById(R.id.constraintLayout)

        presenter = MainPresenter(this)

    }

    override fun navigateToActivity2() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    override fun navigateToActivity3() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    override fun navigateToRegisterActivity() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    override fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun navigateToSearch() {
        val intent = Intent(this, ProductSearchActivity::class.java)
        startActivity(intent)
    }
}
