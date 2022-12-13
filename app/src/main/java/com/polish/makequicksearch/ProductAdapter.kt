package com.polish.makequicksearch

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.polish.makequicksearch.databinding.ProductItemLayoutBinding
import com.polish.makequicksearch.utils.bindImage

class ProductAdapter(private val productItem: List<com.polish.makequicksearch.model.uimodel.FoodItem>): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
    private val TAG = "ProductAdapter"
    class ProductViewHolder(binding: ProductItemLayoutBinding): ViewHolder(binding.root) {
        // initialize views
        val productTitle = binding.productItemTitleTv
        val productPrice = binding.productItemPriceTv
        val productImage = binding.productItemIv
        // bind view with data
        fun bind(item: com.polish.makequicksearch.model.uimodel.FoodItem) {
            productTitle.text = item.productTitle
            productPrice.text = item.productPrice
            Log.d("product", "see the out put: ${item.productImage}")
            item.productImage?.let { bindImage(it, productImage) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val productItemBinding = ProductItemLayoutBinding.inflate(layoutInflater, parent, false)
        return ProductViewHolder(productItemBinding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val currentItem = productItem[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return productItem.size
    }
}