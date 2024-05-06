package com.example.museum

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    val titles = arrayOf("Final Fantasy 1",
        "Final Fantasy 2",
        "Final Fantasy 3",
        "Final Fantasy 4",
        "Final Fantasy 5",
        "Final Fantasy 6",
        "Final Fantasy 7",
        "Final Fantasy 8",
        "Final Fantasy 9",
        "Final Fantasy 10",
        "Final Fantasy 11",
        "Final Fantasy 12",
        "Final Fantasy 13",
        "Final Fantasy 14",
        "Final Fantasy 15",
        "Final Fantasy 16")

    val details = arrayOf("1987",
        "1988",
        "1990",
        "1991",
        "1992",
        "1994",
        "1997",
        "1999",
        "2000",
        "2001",
        "2002",
        "2006",
        "2009",
        "2010",
        "2016",
        "2023")

    val images = intArrayOf(R.drawable.ff1,
        R.drawable.ff2,
        R.drawable.ff3,
        R.drawable.ff4,
        R.drawable.ff5,
        R.drawable.ff6,
        R.drawable.ff7,
        R.drawable.ff8,
        R.drawable.ff9,
        R.drawable.ff10,
        R.drawable.ff11,
        R.drawable.ff12,
        R.drawable.ff13,
        R.drawable.ff14,
        R.drawable.ff15,
        R.drawable.ff16)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView


        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemDetail = itemView.findViewById(R.id.item_detal)
            itemTitle = itemView.findViewById(R.id.item_title)

        }
    }


}