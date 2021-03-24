package com.example.petapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.petapp.model.Cat


class CatAdapter(private val values: List<Cat>) : RecyclerView.Adapter<CatAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.cat_list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = values.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cat = values[position]
        holder.catName?.text = cat.name
        holder.catKind?.text = cat.kind
        holder.catAge?.text = "${cat.age} years"
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var catName: TextView? = null
        var catAge: TextView? = null
        var catKind: TextView? = null
        init {
            catName = itemView.findViewById(R.id.cat_name)
            catAge = itemView.findViewById(R.id.cat_age)
            catKind = itemView.findViewById(R.id.cat_kind)
        }
    }
}