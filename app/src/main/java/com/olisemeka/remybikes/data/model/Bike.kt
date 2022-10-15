package com.olisemeka.remybikes.data.model

import android.text.SpannableString

data class Bike(
    val name: String,
    val price: String,
    val brand: String,
    val imageUrl: String,
    var isInStock: Boolean,
    var rating: Double,
    var noOfReviews: Int,
    var productDetails: SpannableString
)