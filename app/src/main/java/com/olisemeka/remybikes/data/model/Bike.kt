package com.olisemeka.remybikes.data.model

import android.text.SpannableString
import androidx.annotation.DrawableRes

data class Bike(
    val name: String,
    val price: Int,
    val brand: String,
    val imageUrl: String,
    var isInStock: Boolean,
    var rating: Double,
    var noOfReviews: Int,
    var productDetails: SpannableString
)