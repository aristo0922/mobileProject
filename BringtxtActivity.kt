package com.example.teamproject

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class BringtxtActivity :AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bringtxt)

//        뒤로가기, 확인, 도움말 버튼
        var back=findViewById<ImageButton>(R.id.back2)
        var ok=findViewById<Button>(R.id.bringok)
        var help =findViewById<Button>(R.id.help)
        var gotokakao = findViewById<ImageButton>(R.id.gotokakao)

//        뒤로가기
        back.setOnClickListener{
            finish()
        }

//      확인(다음 단계)
        ok.setOnClickListener {
            var intent= Intent(applicationContext, ShowgiftActivity::class.java)
            startActivity(intent)
        }

//        카카오톡으로 이동
        gotokakao.setOnClickListener {

        }

        //도움말 -> 팝업
        help.setOnClickListener{
            showSettingPopup()
        }
    }


    private fun showSettingPopup() {
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.activity_help, null)
        var alertDialog = AlertDialog.Builder(this).create()

        val exitBtn = view.findViewById<ImageButton>(R.id.exitBtn)
        exitBtn.setOnClickListener() {
            alertDialog.dismiss()
        }

        alertDialog.setView(view)
        alertDialog.show()

    }
}