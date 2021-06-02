package com.example.teamproject;


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MypageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        var back = findViewById<ImageButton>(R.id.back4)
        var loding = findViewById<Button>(R.id.lodingbefore)
        back.setOnClickListener{
            finish()
        }


//        이전 대화 내용 불러오기 구현 코드
        loding.setOnClickListener {

        }
    }
}