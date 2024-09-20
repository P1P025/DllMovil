package com.example.rappi_u.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappi_u.R
import model.Product


class ProductSearchActivity: AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.products_search)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val products = listOf(
            Product(1, "Perejil", 2, "Verdura", 1, 500, "https://s3.ppllstatics.com/diariovasco/www/multimedia/202003/27/media/cortadas/perejil-k2OF-U1007014133748mE-1248x770@Diario%20Vasco.jpg" ),
            Product(2, "Perejil", 2, "Verdura", 1, 500, "https://s3.ppllstatics.com/diariovasco/www/multimedia/202003/27/media/cortadas/perejil-k2OF-U1007014133748mE-1248x770@Diario%20Vasco.jpg" ),
            Product(3, "Perejil", 2, "Verdura", 1, 500, "https://s3.ppllstatics.com/diariovasco/www/multimedia/202003/27/media/cortadas/perejil-k2OF-U1007014133748mE-1248x770@Diario%20Vasco.jpg" ),
            Product(4, "Perejil", 2, "Verdura", 1, 500, "https://s3.ppllstatics.com/diariovasco/www/multimedia/202003/27/media/cortadas/perejil-k2OF-U1007014133748mE-1248x770@Diario%20Vasco.jpg" )
        )
        adapter = ProductViewAdapter(products)
        recyclerView.adapter = adapter
    }
}