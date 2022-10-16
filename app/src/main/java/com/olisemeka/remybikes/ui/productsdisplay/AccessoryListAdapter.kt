package com.olisemeka.remybikes.ui.productsdisplay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.olisemeka.remybikes.R
import com.olisemeka.remybikes.data.model.Accessory
import java.text.NumberFormat

class AccessoryListAdapter(private val context: Context, private val accessoryList: ArrayList<Accessory>):
    RecyclerView.Adapter<AccessoryListAdapter.AccessoryHolder>() {
    class AccessoryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewAccessory: ImageView = itemView.findViewById(R.id.imageview_bike)
        val imageViewFavourite: ImageView = itemView.findViewById(R.id.imageview_favourite)
        val textViewAccessoryName: TextView = itemView.findViewById(R.id.textview_bike_name)
        val textViewAccessoryPrice: TextView = itemView.findViewById(R.id.textview_bike_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccessoryHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_product, parent, false)
        return AccessoryHolder(itemView)
    }

    override fun onBindViewHolder(holder: AccessoryHolder, position: Int) {
        val accessory = accessoryList[position]
        holder.textViewAccessoryName.text = accessory.name
        holder.textViewAccessoryPrice.text = NumberFormat.getCurrencyInstance().format(accessory.price)
        Glide.with(context)
            .load(accessory.imageUrl)
            .centerCrop()
            .into(holder.imageViewAccessory)

    }

    override fun getItemCount() = accessoryList.size
}