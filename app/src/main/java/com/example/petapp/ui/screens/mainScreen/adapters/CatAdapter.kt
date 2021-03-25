package com.example.petapp.ui.screens.mainScreen.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.petapp.R
import com.example.petapp.databinding.CatListItemBinding
import com.example.petapp.model.Cat


class CatAdapter(
    private val values: List<Cat>,
    private val onClick: (Cat) -> Unit
) : RecyclerView.Adapter<CatAdapter.CatHolder>() {

    private fun ViewGroup.createCatHolder() =
        CatHolder(CatListItemBinding.inflate(LayoutInflater.from(this.context), this, false))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        parent.createCatHolder()

    override fun getItemCount() = values.size

    override fun onBindViewHolder(holder: CatHolder, position: Int) {
        val cat = values[position]
        holder.bind(cat)
        holder.itemView.setOnClickListener { onClick.invoke(cat) }
    }

    inner class CatHolder(private val binding: CatListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(cat: Cat) {
            binding.catName.text = cat.name
            binding.catKind.text = cat.kind
            binding.catAge.text = binding.root.context.getString(R.string.cat_list_age, cat.age)
        }

    }
}