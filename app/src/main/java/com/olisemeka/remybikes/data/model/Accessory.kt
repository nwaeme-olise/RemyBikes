package com.olisemeka.remybikes.data.model

data class Accessory(
    val name: String,
    val price: Int,
    val imageUrl: String,
    var isInStock: Boolean,
    var rating: Double,
    var noOfReviews: Int,
    )