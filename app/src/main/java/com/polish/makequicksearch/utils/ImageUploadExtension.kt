package com.polish.makequicksearch.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.polish.makequicksearch.R

/**
 * to bind the image date to the view
 */
fun bindImage(imageUrl:String, imageView: ImageView){
    Glide.with(imageView.context)
        .load(imageUrl)
        .placeholder(R.drawable.ic_launcher_background)
        .into(imageView)
}