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
//            Toast.makeText(this, inputContent, Toast.LENGTH_SHORT).show()



//                  resultTxt 의 text 속성에, inputContent의 내용을 넣어주자.

                resultTxt.text = inputContent


//                 만약, 입력한 내용이 "안녕" 이라면, "인사문구입니다." 토스트 출력
                if(inputContent=="안녕" || inputContent == "안녕하세요"){

                    Toast.makeText(this, "인사문구입니다.", Toast.LENGTH_SHORT).show()   
                    
                }  
                else if(inputContent=="바이"){
                    Toast.makeText(this, "작별인사입니다.", Toast.LENGTH_SHORT).show()           
                    
                }            
                else if(inputContent=="굿모닝"){
                    Toast.makeText(this, "아침인사입니다.", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this, "그 외의 문장입니다.", Toast.LENGTH_SHORT).show()
                }
        }
    }
}