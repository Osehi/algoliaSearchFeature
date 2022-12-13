package com.polish.makequicksearch.utils

import com.polish.makequicksearch.model.MarketItem
import com.polish.makequicksearch.model.uimodel.FoodItem


fun List<MarketItem>.toFoodItem(): List<FoodItem> {
    return map {
        FoodItem(
            productImage = converToObjectWithGson(it.product_images.content)[0].imagePath,
            productTitle = it.product_title.content,
            productPrice = it.product_price.content,
            productId = it.product_id.content
        )
    }
}