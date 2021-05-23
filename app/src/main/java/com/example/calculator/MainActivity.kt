package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input1=findViewById<TextView>(R.id.tventer1)
        var input2=findViewById<TextView>(R.id.tvEnter2)
        var input3=findViewById<TextView>(R.id.tvinput3)
        var button=findViewById<Button>(R.id.btnAdd)
        var button2=findViewById<Button>(R.id.btnSubtract)
        var button3=findViewById<Button>(R.id.btnMultiply)
        var button4=findViewById<Button>(R.id.btnModulus)

//        var result1=input1.text.toString().toInt()
//        var result2=input2.text.toString().toInt()

        button.setOnClickListener{
//
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var add=result1+result2
            input3.text="Answer:$add"

        }
        button2.setOnClickListener{
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var subtract=result1-result2
            input3.text="Answer:$subtract"

        }
        button3.setOnClickListener{
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var multiply=result1*result2
            input3.text="Answer:$multiply"

        }
        button4.setOnClickListener{
            var result1=input1.text.toString().toInt()
            var result2=input2.text.toString().toInt()
            var modul=result1%result2
            input3.text="Answer:$modul"
        }
    }

}