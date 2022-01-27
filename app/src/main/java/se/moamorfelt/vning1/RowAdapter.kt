package se.moamorfelt.vning1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RowAdapter() : RecyclerView.Adapter<MyViewHolder>() {

    var nyrad = mutableListOf<String>("")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val vh = MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_row, parent, false))
        return vh
    }

    override fun getItemCount(): Int {
        return nyrad.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.textrad.text = nyrad[position]
    }
}

class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    var textrad = view.findViewById<TextView>(R.id.RadTV)
}