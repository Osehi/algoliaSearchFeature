package com.polish.makequicksearch

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@kotlinx.serialization.Serializable
data class SearchProductItemModelNew(
    @SerializedName("status")
    @Expose
    var status: Boolean? = null,

    @SerializedName("message")
    @Expose
    var message: String? = null,

    @SerializedName("user_access")
    @Expose
    var userAccess: String? = null,

    @SerializedName("fooditems")
    @Expose
    var fooditems: List<FoodItem>? = null,
)
@kotlinx.serialization.Serializable
data class Attribute(
    @SerializedName("attribute_id")
    @Expose
    var attributeId: String? = null,

    @SerializedName("attribute_name")
    @Expose
    var attributeName: String? = null,

    @SerializedName("attribute_cost")
    @Expose
    var attributeCost: String? = null,
)
@kotlinx.serialization.Serializable
data class FoodItem(
    @SerializedName("product_id")
    @Expose
    var productId: String? = null,

    @SerializedName("category_id")
    @Expose
    var categoryId: String? = null,

    @SerializedName("category_name")
    @Expose
    var categoryName: String? = null,

    @SerializedName("product_name")
    @Expose
    var productName: String? = null,

    @SerializedName("discount_status")
    @Expose
    var discountStatus: String? = null,

    @SerializedName("product_price")
    @Expose
    var productPrice: String? = null,

    @SerializedName("product_discount")
    @Expose
    var productDiscount: String? = null,

    @SerializedName("unit")
    @Expose
    var unit: String? = null,

    @SerializedName("unit_cost")
    @Expose
    var unitCost: String? = null,

    @SerializedName("is_season")
    @Expose
    var isSeason: String? = null,

    @SerializedName("product_description")
    @Expose
    var productDescription: String? = null,

    @SerializedName("product_images")
    @Expose
    var productImages: String? = null,

    @SerializedName("max_pallypeople_allowed")
    @Expose
    var maxPallypeopleAllowed: String? = null,

    @SerializedName("total_reviews")
    @Expose
    var totalReviews: String? = null,

    @SerializedName("product_rating")
    @Expose
    var productRating: String? = null,

    @SerializedName("is_fav")
    @Expose
    var isFav: String? = null,

    @SerializedName("Attributes")
    @Expose
    var attributes: List<Attribute>? = null
)
