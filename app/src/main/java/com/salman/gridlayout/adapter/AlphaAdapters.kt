package com.salman.gridlayout.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.salman.gridlayout.R
import com.salman.gridlayout.model.AlphaChar

class AlphaAdapters(var context: Context, var arrayList: ArrayList<AlphaChar>):
    RecyclerView.Adapter<AlphaAdapters.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
       val itemHolder = LayoutInflater.from(parent.context)
           .inflate(R.layout.grid_layout_list_item,parent,false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var alphaChar:AlphaChar=arrayList.get(position)
        holder.icons.setImageResource(alphaChar.iconsChar!!)
        holder.alphas.text=alphaChar.alphaChar

        holder.alphas.setOnClickListener {
            Toast.makeText(context, "", Toast.LENGTH_SHORT).show()
        }
    }
    class ItemHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var icons:ImageView = itemView.findViewById<ImageView>(R.id.icon_image)
        var alphas=itemView.findViewById<TextView>(R.id.alpha_text_view)
    }
}