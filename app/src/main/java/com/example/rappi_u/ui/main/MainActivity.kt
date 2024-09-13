package com.example.rappi_u.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rappi_u.R

class MainActivity(var adapter: MainAdapter, var recyclerView: Any) : AppCompatActivity(), MainView {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)

        val imageButton1: ImageButton = findViewById(R.id.imageButton2)
        val imageButton2: ImageButton = findViewById(R.id.imageButton6)
        val registerButton: Button = findViewById(R.id.button_register)

        imageButton1.setOnClickListener {
            presenter.onImageButton1Click()
        }

        imageButton2.setOnClickListener {
            presenter.onImageButton2Click()
        }

        registerButton.setOnClickListener {
            presenter.onRegisterButtonClick()
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        presenter = MainPresenter(this)

        presenter.loadItems()
    }

    override fun showItems(items: List<Item>) {
        adapter = MainAdapter(items)
        recyclerView.adapter = adapter
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
}
