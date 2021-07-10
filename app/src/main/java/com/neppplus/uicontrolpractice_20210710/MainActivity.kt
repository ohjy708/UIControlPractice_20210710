package com.neppplus.uicontrolpractice_20210710

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//           토스트버튼이 눌리면 (이벤트 처리)
        toastBtn.setOnClickListener {

//                  contentEdt에 적혀있는 내용(text 속성의 값)을 가져와서 (기록해두자)

            val inputContent = contentEdt.text.toString()



//                  토스트의 문구로 사용. (기록해둔 값 사용)
            Toast.makeText(this, inputContent, Toast.LENGTH_SHORT).show()


        }

    }
}