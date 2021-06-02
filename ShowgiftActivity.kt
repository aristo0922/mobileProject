package com.example.teamproject;

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.DialogFragment

class ShowgiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ranking)

        var back=findViewById<ImageButton>(R.id.back3)
        var builder =AlertDialog.Builder(this)
        var question1 = findViewById<Button>(R.id.question1)
        var question2 = findViewById<Button>(R.id.question2)
        var otherDialog = findViewById<Button>(R.id.otherText)
        //항목 선택 시 builder.show() 메서드 입력
        //사이트 연결은 밑에 코드에 삽입

        back.setOnClickListener {
            finish()
        }

//        이전 대화 내용 불러오기. 이전 화면 = 대화내용 불러오기
        otherDialog.setOnClickListener {
            finish()
        }


//        도움말
        question1.setOnClickListener {
            val dlg: AlertDialog.Builder = AlertDialog.Builder(this,  android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth)
            dlg.setTitle("원한다. 선물") //제목
            dlg.setMessage("친구가 갖고싶다고 직접 말한 단어들이에요! 이겁니다! 2거에요! ~(@v@)/") // 메시지
            dlg.setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which -> })
            dlg.show()
        }

        question2.setOnClickListener {
            val dlg: AlertDialog.Builder = AlertDialog.Builder(this,  android.R.style.Theme_DeviceDefault_Light_Dialog_NoActionBar_MinWidth)
            dlg.setTitle("원할껄? 선물") //제목
            dlg.setMessage("대화 내용 중 친구의 언급이 많았던 단어들이에요! 친구의 관심사에 가깝지 않을까요?") // 메시지
            dlg.setPositiveButton("확인", DialogInterface.OnClickListener { dialog, which -> })
            dlg.show()
        }
    }
}

//대화상자
class FireMissilesDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setMessage("원하는 형태의 매장을 선택해주세요")
                    .setPositiveButton("온라인 매장",
                            DialogInterface.OnClickListener { dialog, id ->
                                // FIRE ZE MISSILES!
                                //네이버 쇼핑 사이트 연결 코드
                            })
                    .setNeutralButton("오프라인 매장",
                            DialogInterface.OnClickListener { dialog, id ->
                                //지도 보여주는 코드
                            })
                    .setNegativeButton("cancel",
                            DialogInterface.OnClickListener { dialog, id ->
                                // User cancelled the dialog.
                                //아무것도 안넣어도 될 것 같은데 오류 나면 보자!
                            })
            // Create the AlertDialog object and return it
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}