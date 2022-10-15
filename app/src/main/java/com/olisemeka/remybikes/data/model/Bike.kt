package com.olisemeka.remybikes.data.model

import android.text.SpannableString

data class Bike(
    private val name: String,
    private val price: String,
    private val brand: String,
    private val imageUrl: String,
    private var isInStock: Boolean,
    private var rating: Double,
    private var noOfReviews: Int,
    private var productDetails: SpannableString
)