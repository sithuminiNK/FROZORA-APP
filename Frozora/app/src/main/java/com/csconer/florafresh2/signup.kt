package com.csconer.florafresh2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val signInButton: Button = findViewById(R.id.signInButton)
        signInButton.setOnClickListener {
            // Show alert dialog
            AlertDialog.Builder(this)

                .setMessage("Account Created Successfully")
                .setPositiveButton("OK") { dialog, _ ->
                    // Navigate to login page
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent)
                    dialog.dismiss()
                }
                .setCancelable(false)
                .show()
        }
    }
}
