// Wesley Gavitt
// 1.5 PA
// 8/1/2026

package com.example.contactsaddressbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aliceButton =findViewById<android.widget.Button>(R.id.buttonAlice)
        val aaronButton =findViewById<android.widget.Button>(R.id.buttonAaron)

        aliceButton.setOnClickListener {
            val intent = Intent(this, ContactActivity1::class.java)
            startActivity(intent)
        }
        aaronButton.setOnClickListener {
            val intent = Intent(this, ContactActivity2::class.java)
            startActivity(intent)
        }

    }
}