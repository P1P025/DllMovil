package com.example.rappi_u.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappi_u.R
import model.Product
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class ProductSearchActivity: AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductViewAdapter
    var products = listOf<Product>()
    lateinit var api: API
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.products_search)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ProductViewAdapter(products)
        recyclerView.adapter = adapter
        getAPI()
    }

    fun getAPI(){
        api = APIservice.getInstace().create(API::class.java)
        getData()
    }
    fun getData(){
        api.getProducto().enqueue(object: Callback<List<Product>>{
            override fun onResponse(p0: Call<List<Product>>, p1: Response<List<Product>>) {
                products = p1.body()!!
                adapter.notifyDataSetChanged()
            }

            override fun onFailure(p0: Call<List<Product>>, p1: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}