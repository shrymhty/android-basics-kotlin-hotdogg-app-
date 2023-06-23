package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shrymhty.hotdogg.R
import com.shrymhty.hotdogg.data.DataSource
import com.shrymhty.hotdogg.layoutstuff.layout.GRID

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class ItemAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<ItemAdapter.DogCardViewHolder>() {

    private val dogs = DataSource.dogs

    class DogCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val dogImage : ImageView? = view!!.findViewById(R.id.dog_img)
        val dogAge : TextView? = view!!.findViewById(R.id.dog_age)
        val dogName : TextView? = view!!.findViewById(R.id.dog_name)
        val dogHobby : TextView? = view!!.findViewById(R.id.dog_hobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val layoutadapter = when(layout) {
            GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_item, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_item_layout, parent, false)
        }
        return DogCardViewHolder(layoutadapter)
    }

    override fun getItemCount(): Int = dogs.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val dogData = dogs[position]
        holder.dogImage?.setImageResource(dogData.imageID)
        holder.dogName?.text = dogData.name
        val resources = context?.resources
        holder.dogAge?.text = resources?.getString(R.string.dog_age, dogData.age)
        holder.dogHobby?.text = resources?.getString(R.string.dog_hobbies, dogData.hobbies)
    }
}