package com.example.teamproject;
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class BringtxtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift)

        var back=findViewById<ImageButton>(R.id.back2)
        var ok=findViewById<Button>(R.id.bringok)

        back.setOnClickListener{
            finish()
        }

        ok.setOnClickListener {
            var intent= Intent(applicationContext, ShowgiftActivity::class.java)
            startActivity(intent)
        }
    }
}