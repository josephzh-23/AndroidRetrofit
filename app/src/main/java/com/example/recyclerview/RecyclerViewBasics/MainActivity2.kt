package com.example.recyclerview.RecyclerViewBasics


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

import kotlin.random.Random
class MainActivity2 : AppCompatActivity(), ExampleAdapter.OnItemClickListener {
    private val exampleList = generateDummyList(10)
    private val adapter = ExampleAdapter(exampleList, this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
    fun insertItem(view: View) {
        val index = Random.nextInt(8)
        val newItem = ExampleItem(
            R.drawable.ic_launcher_background,
            "New item at position $index",
            "Line 2"
        )
        exampleList.add(index, newItem)
        adapter.notifyItemInserted(index)
    }
    fun removeItem(view: View) {
        val index = Random.nextInt(8)
        exampleList.removeAt(index)
        adapter.notifyItemRemoved(index)
    }
    override fun onItemClick(position: Int) {
        Toast.makeText(this, "Item $position clicked", Toast.LENGTH_SHORT).show()
        val clickedItem = exampleList[position]
        clickedItem.text1 = "Clicked"
        adapter.notifyItemChanged(position)
    }
    private fun generateDummyList(size: Int): ArrayList<ExampleItem> {
        val list = ArrayList<ExampleItem>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_launcher_background
                1 -> R.drawable.ic_launcher_foreground
                else -> R.drawable.ic_launcher_background
            }
            val item = ExampleItem(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}