package com.example.simplecalculaterwkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.FileVisitResult

class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun mySum(view : View){
            number1 = numberText1.text.toString().toIntOrNull()
            number2 = numberText2.text.toString().toIntOrNull()

                if(number1 == null || number2 == null){
                    textView.text = "Please enter a valid number."
                }else{
                    textView.text = "Result : ${number1!! + number2!!}"
                }
        }
        fun mySub(view: View){
            number1 = numberText1.text.toString().toIntOrNull()
            number2 = numberText2.text.toString().toIntOrNull()

            if(number1 == null || number2 == null){
                textView.text = "Please enter a valid number."
            }else{
                textView.text = "Result : ${number1!! - number2!!}"
            }
        }
        fun myMultiply(view : View){
            number1 = numberText1.text.toString().toIntOrNull()
            number2 = numberText2.text.toString().toIntOrNull()

            if(number1 == null || number2 == null){
                textView.text = "Please enter a valid number."
            }else{
                textView.text = "Result : ${number1!! * number2!!}"
            }
        }
        fun myDiv(view: View){
            number1 = numberText1.text.toString().toIntOrNull()
            number2 = numberText2.text.toString().toIntOrNull()

            if(number1 == null || number2 == null){
                textView.text = "Please enter a valid number."
            }else{
                textView.text = "Result : ${number1!! / number2!!}"
            }
        }
}