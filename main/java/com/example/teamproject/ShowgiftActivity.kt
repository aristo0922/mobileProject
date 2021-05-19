package com.example.teamproject;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ShowgiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ranking)

        var back=findViewById<ImageButton>(R.id.button4)

        back.setOnClickListener {
            finish()
        }
    }
}