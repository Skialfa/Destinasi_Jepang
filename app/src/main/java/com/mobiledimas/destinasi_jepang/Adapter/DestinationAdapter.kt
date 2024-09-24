package com.mobiledimas.destinasi_jepang.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mobiledimas.destinasi_jepang.R
import com.mobiledimas.destinasi_jepang.Model.ModelDestination

class DestinationAdapter (
    private val wisataList : List<ModelDestination>,
    private val onItemClick : (ModelDestination) -> Unit
) : RecyclerView.Adapter<DestinationAdapter.WisataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_destination,parent,false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.bind(wisata, onItemClick)
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    inner class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val namaTextView : TextView = itemView.findViewById(R.id.namaTextView)
        val lokasiTextView : TextView = itemView.findViewById(R.id.lokasiTextView)
        val gambarImageView : ImageView = itemView.findViewById(R.id.gambarImageView)

        fun bind(wisata: ModelDestination, onItemClick: (ModelDestination) -> Unit){
            namaTextView.text = wisata.nama
            lokasiTextView.text = wisata.lokasi
            gambarImageView.setImageResource(wisata.gambar)

            itemView.setOnClickListener{
                onItemClick(wisata)
            }
        }
    }
}