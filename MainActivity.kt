package com.example.teamproject;
import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.DialogFragment

class MainActivity : AppCompatActivity() {
    lateinit var loginBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        val intent= Intent(this, StartActivity::class.java)
        startActivity(intent)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn = findViewById<Button>(R.id.loginBtn)

        loginBtn.setOnClickListener {
            var intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
    }

}
