package com.iman.dekenetalnes.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.iman.dekenetalnes.R
import com.iman.dekenetalnes.model.categ_list

class ItemAdapter(private val list_categories:List<categ_list>)
    :RecyclerView.Adapter<ItemAdapter.ItemViewHolder> (){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView= itemView.findViewById(R.id.image_view)
        val textView: TextView = itemView.findViewById(R.id.text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //create a new view
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_categories, parent,
                false
            )

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val currentItem = list_categories[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.text
    }

    override fun getItemCount() = list_categories.size
}
