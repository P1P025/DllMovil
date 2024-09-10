package com.example.rappi_u.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rappi_u.R

class MainAdapter(private val items: List<Item>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.item_title)
        val subtitleTextView: TextView = view.findViewById(R.id.item_subtitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = items[position]
        holder.titleTextView.text = item.title
        holder.subtitleTextView.text = item.subtitle
    }

    override fun getItemCount(): Int = items.size
}

data class Item(val title: String, val subtitle: String)
