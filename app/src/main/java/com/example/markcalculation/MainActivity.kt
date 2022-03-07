package com.example.markcalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mark1 = findViewById(R.id.ed1) as EditText
        val mark2 = findViewById(R.id.ed2) as EditText
        val mark3 = findViewById(R.id.ed3) as EditText
        val total = findViewById(R.id.edTotal) as EditText
        val avg = findViewById(R.id.edAvg) as EditText
        val  grade = findViewById(R.id.edGrade) as EditText
        val btOk = findViewById(R.id.btOk) as Button
        val btClear = findViewById(R.id.btClear) as Button

        btClear.setOnClickListener{
            mark1.setText("")
            mark2.setText("")
            mark3.setText("")
            total.setText("")
            avg.setText("")
            grade.setText("")
            mark1.requestFocus()

        }

        btOk.setOnClickListener{
            val val1 = mark1.text.toString().toInt()
            val val2 = mark2.text.toString().toInt()
            val val3 = mark3.text.toString().toInt()

            val result = val1+val2+val3

            total.setText(result.toString())

            val average =  result/3
            avg.setText(average.toString())

            if(average > 44){
                grade.setText("PASS")
            }
            else{
                grade.setText("FAIL")
            }



        }
    }

}