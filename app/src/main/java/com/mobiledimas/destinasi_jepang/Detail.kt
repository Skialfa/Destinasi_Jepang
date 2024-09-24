package com.mobiledimas.destinasi_jepang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mobiledimas.destinasi_jepang.Model.ModelDestination

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val wisata = intent.getParcelableExtra<ModelDestination>( "WISATA")

        if(wisata != null){
            val namaTextView: TextView = findViewById(R.id.namaTextView)
            val lokasiTextView: TextView = findViewById(R.id.lokasiTextView)
            val tanggalTextView: TextView = findViewById(R.id.tanggalTextView)
            val detailTextView: TextView = findViewById(R.id.detailTextView)
            val gambarImageView: ImageView = findViewById(R.id.gambarImageView)

            namaTextView.text = wisata.nama
            lokasiTextView.text = wisata.lokasi
            tanggalTextView.text = wisata.tanggal
            detailTextView.text = wisata.detail
            gambarImageView.setImageResource(wisata.gambar)
        }
    }
}