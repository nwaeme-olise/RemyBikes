package com.olisemeka.remybikes.data.model

data class Accessory(
    private val name: String,
    private val price: String,
    private val imageUrl: String,
    private var isInStock: Boolean,
    private var rating: Float,
    private var noOfReviews: Int,

)