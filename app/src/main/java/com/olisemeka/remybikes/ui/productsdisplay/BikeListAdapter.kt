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
import com.olisemeka.remybikes.data.model.Bike

class BikeListAdapter(private val context: Context, private val bikeList: ArrayList<Bike>): RecyclerView.Adapter<BikeListAdapter.BikeHolder>() {
    class BikeHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       val imageViewBike: ImageView = itemView.findViewById(R.id.imageview_bike)
       val imageViewFavourite: ImageView = itemView.findViewById(R.id.imageview_favourite)
       val textViewBikeName: TextView = itemView.findViewById(R.id.textview_bike_name)
       val textViewBikePrice: TextView = itemView.findViewById(R.id.textview_bike_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BikeHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_product, parent, false)
        return BikeHolder(itemView)
    }

    override fun onBindViewHolder(holder: BikeHolder, position: Int) {
        val bike = bikeList[position]
        holder.textViewBikeName.text = bike.name
        holder.textViewBikePrice.text = bike.price
        Glide.with(context)
            .load(bike.imageUrl)
            .into(holder.imageViewBike)

    }

    override fun getItemCount() = bikeList.size
}