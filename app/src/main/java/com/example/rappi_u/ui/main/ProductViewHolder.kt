package com.example.rappi_u.ui.main

import android.net.Uri
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rappi_u.R
import model.Product

class ProductViewHolder(productView: View): RecyclerView.ViewHolder(productView) {
    private val nameTextView: TextView = productView.findViewById(R.id.tvProductName)
    private val weightTextView: TextView = productView.findViewById(R.id.tvProductPrice)
    private val priceTextView: TextView = productView.findViewById(R.id.tvProductWeight)
    private val productImageView:ImageView = productView.findViewById(R.id.ivProductImage)
    fun bind(product: Product){
        val uri = Uri.parse(product.productImageUrl)
        nameTextView.text = product.name
        weightTextView.text = product.weight.toString()
        priceTextView.text = product.price.toString()
        Glide.with(productImageView.context)
            .load(uri)
            .into(productImageView)
    }

}