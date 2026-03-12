package com.csconer.florafresh2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class itemcheckout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_itemcheckout)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

// Enable back arrow (optional)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener {
            // Handle back button click (navigate to landing page)
            val intent = Intent(this, newcart::class.java)
            startActivity(intent)
        }

        // Find the payment button by its ID
        val paymentButton: Button = findViewById(R.id.paymentButton)

        // Set an OnClickListener on the payment button
        paymentButton.setOnClickListener {
            // Create an AlertDialog
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("Order Confirmation")
                .setMessage("Thank you for ordering! Your order is successfully placed.")
                .setPositiveButton("Continue Shopping") { dialog, _ ->
                    // Handle continue shopping action
                    val intent = Intent(this, landingpage::class.java)
                    startActivity(intent)
                    dialog.dismiss()
                }
                .setNegativeButton("Track My Order") { dialog, _ ->
                    // Handle track my order action
                    dialog.dismiss()
                }
                .create()

            // Show the AlertDialog
            alertDialog.show()
        }
    }
}
