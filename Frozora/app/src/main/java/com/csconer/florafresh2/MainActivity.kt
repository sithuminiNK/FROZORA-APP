package com.csconer.florafresh2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Set up the padding for edge-to-edge content
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Set up click listener for the ImageView
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setOnClickListener {
            Log.d("MainActivity", "ImageView clicked")
            // Start the LoginActivity when the image is clicked
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
