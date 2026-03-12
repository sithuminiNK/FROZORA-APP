package com.csconer.florafresh2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class landingpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_landingpage)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val itemView3: ImageView = findViewById(R.id.itemView3)
        itemView3.setOnClickListener {
            val intent = Intent(this, item::class.java)
            startActivity(intent)
        }

        val profileIcon: ImageView = findViewById(R.id.profileIcon)
        profileIcon.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val settingsIcon: ImageView = findViewById(R.id.settingsIcon)
        settingsIcon.setOnClickListener {
            val intent = Intent(this, setting::class.java)
            startActivity(intent)
        }

        val cardIcon: ImageView = findViewById(R.id.cardIcon)
        cardIcon.setOnClickListener {
            val intent = Intent(this, newcart::class.java)
            startActivity(intent)
        }


    }
}
