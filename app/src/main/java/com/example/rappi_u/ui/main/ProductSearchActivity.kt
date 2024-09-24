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
            Product(1, "Perejil", 2, "Verdura", 1, 700, "https://s3.ppllstatics.com/diariovasco/www/multimedia/202003/27/media/cortadas/perejil-k2OF-U1007014133748mE-1248x770@Diario%20Vasco.jpg" ),
            Product(2, "Manzana", 2, "Fruta", 1, 900, "data:image/jpeg;base64,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" ),
            Product(3, "Pera", 2, "Fruta", 1, 500, "https://www.gob.mx/cms/uploads/article/main_image/68008/Pera_secundaria.jpg" ),
            Product(4, "Gabanzo", 2, "Verdura", 1, 300, "https://www.gastronomiavasca.net/uploads/image/file/4233/w700_garbanzo.jpg" )
        )
        adapter = ProductViewAdapter(products)
        recyclerView.adapter = adapter
    }
}