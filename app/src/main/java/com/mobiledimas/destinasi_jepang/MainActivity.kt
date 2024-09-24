package com.mobiledimas.destinasi_jepang

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnDetails : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnDetails=findViewById(R.id.btn_details)

        btnDetails.setOnClickListener(){
            val intent= Intent(this,halaman::class.java)
            startActivity(intent)
        }
    }
}