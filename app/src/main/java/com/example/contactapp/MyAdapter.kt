package com.example.contactapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class MyAdapter(val contacts: List<MyContacts>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.items_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.contactName.text = contacts[position].name
        holder.contactNumber.text = contacts[position].Number
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var contactName = itemView.findViewById<TextView>(R.id.contactName)
        var contactNumber = itemView.findViewById<TextView>(R.id.contactNumber)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }
}

