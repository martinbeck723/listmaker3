package com.raywenderlich.listmaker3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder>() {

    //mock titles
    val listTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.list_selection_view_holder,parent,false)
        return ListSelectionViewHolder(view)
    }



    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        //take the TextViews you created in the ViewHolder and pupulate them with their position in the list and the name of the list from the listTitles array
        holder.listPosition.text=(position+1).toString()
        holder.listTitle.text=listTitles[position]
    }

    override fun getItemCount(): Int {
        return listTitles.size
    }
}