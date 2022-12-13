package com.polish.makequicksearch.utils

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.polish.makequicksearch.model.uimodel.ImageUrl
import com.polish.makequicksearch.model.uimodel.SearchProductImage

fun converToObjectWithGson(item: String): List<ImageUrl> {
    val type = object : TypeToken<List<ImageUrl>>() {}.type
    val gson = Gson()

    val result: List<ImageUrl> = gson.fromJson(item, type)
    return result
}