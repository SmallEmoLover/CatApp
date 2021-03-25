package com.example.petapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.petapp.model.Cat


class CatAdapter(
    private val values: List<Cat>,
    private val onClick: (Cat) -> Unit
) : RecyclerView.Adapter<CatAdapter.ViewHolder>() {

    fun ViewGroup.createViewHolder(layoutId: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(this.context).inflate(layoutId, this, false))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        parent.createViewHolder(R.layout.cat_list_item)

    override fun getItemCount() = values.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cat = values[position]
        holder.catName?.text = cat.name
        holder.catKind?.text = cat.kind
        holder.catAge?.text = "${cat.age} years"

        holder.itemView.setOnClickListener { onClick.invoke(cat) }
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