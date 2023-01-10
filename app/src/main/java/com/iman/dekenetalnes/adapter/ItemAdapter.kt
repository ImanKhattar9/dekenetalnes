package com.iman.dekenetalnes.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.iman.dekenetalnes.R
import com.iman.dekenetalnes.model.categ_list
import com.iman.dekenetalnes.model.categoriesData

/**class ItemAdapter(var c: Context, var categList:ArrayList<categoriesData>
):RecyclerView.Adapter<ItemAdapter.CategoriesViewHolder>()
{
    inner class AnimalViewHolder(var v:categ_list): RecyclerView.ViewHolder(v.root){}
    class CategoriesViewHolder {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  CategoriesViewHolder {
        val inflter = LayoutInflater.from(parent.context)
        val v = DataBindingUtil.inflate<categ_list>(
            inflter, R.layout.list_categories,parent,
            false)
        return CategoriesViewHolder(v)

    }

    private fun CategoriesViewHolder(v: categ_list?): ItemAdapter.CategoriesViewHolder {

    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val newList = categList[position]
        holder.v.isCategories = categList[position]
        holder.v.root.setOnClickListener {
            val img = newList.img
            val name = newList.name


            class CategoriesViewHolder {

            }


val mIntent = Intent(c,NewActivity::class.java)
mIntent.putExtra("img",img)
mIntent.putExtra("name",name)

c.startActivity(mIntent)
}
}

override fun getItemCount(): Int {
return  categList.size
}

 }
**/