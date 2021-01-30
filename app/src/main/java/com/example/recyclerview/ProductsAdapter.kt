package com.example.recyclerview

import android.view.View
import com.example.recyclerview.RecyclerViewBasics.ExampleAdapter
import com.example.recyclerview.databinding.ProductLayoutBinding


//Listener 2 is basically our activity
class ProductsAdapter(val listener2: OnItemClickListener) : BaseRecyclerViewAdapter<Product, ProductLayoutBinding>(
) {


    override fun getLayout() = R.layout.product_layout

    override fun onBindViewHolder(
        holder: Companion.BaseViewHolder<ProductLayoutBinding>,
        position: Int
    ) {
        holder.binding.product = items[position]
        //Binds listener to the whole root
        holder.binding.root.setOnClickListener {
            //This listener from the BaseRecyclerViewAdapter
            listener?.invoke(it, items[position], position)
        }

        //Trigger callback in MainAct,
        ///We can bind a click listener to a specific item
        holder.binding.imageView.setOnClickListener{
            listener2.onItemClick(it, position)
        }


    }

    //Build an interface for callback

    interface OnItemClickListener {
        fun onItemClick(view: View, position: Int)
    }

    //		holder.binding.root.setOnClickListener {
//			listener?.invoke(it, items[position], position)
//		}
}









