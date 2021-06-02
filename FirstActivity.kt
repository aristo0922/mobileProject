package com.example.teamproject

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class FirstActivity :AppCompatActivity(){
    lateinit var loginBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        var button1=findViewById<ImageButton>(R.id.button)
        var button2=findViewById<ImageButton>(R.id.button2)
        button1.setOnClickListener {
            var intent= Intent(this, BringtxtActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{
            var intent= Intent(this, WheregiftActivity::class.java)
            startActivity(intent)
        }
    }
}