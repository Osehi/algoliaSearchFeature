package com.polish.makequicksearch.model.uimodel

data class SearchProductImage(
    val product_images: List<ImageUrl>
)

data class ImageUrl(
    val imagePath: String,
    val imageId: String
)