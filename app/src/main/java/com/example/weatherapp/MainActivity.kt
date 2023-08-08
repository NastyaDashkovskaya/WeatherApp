package com.example.weatherapp


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.FileUtils.copy
import android.util.Log
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import java.util.Collections.copy

const val YANDEX_API_KEY = "dashokvskaja"

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView : TextView = findViewById(R.id.textView)
        val materialbutton : MaterialButton = findViewById(R.id.MaterialButton)
        materialbutton.setOnClickListener(){
            textView.text = String.format("Здравстуйте!\n Меня зовут %s, мне %d лет", Person().name, Person().age)
        }
        //вывод свойств Data class
        val data1: Data
        data1 = Data(1,1,1)
        val data2 = data1.copy()

        val list: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9)

        for(one in list){
            Log.d("mylogs", "$one")
        }

        Log.d("mylogs", "${data1.toString()}")
        Log.d("mylogs", "${data2.toString()}")
        Log.d("mylogs", "${getTextIf()}")
        Log.d("mylogs", "${"цикл for"}")
        Log.d("mylogs", "${getTextWhen(1)}")

    }
    fun getTextIf(): String {
        val resalt1 = if(0==0){
            "test"
        }else{
            "мир сошёл с ума"
        }
        return resalt1}
    fun getTextWhen(input: Int): String{
        val resalt2 = when(input){
            1 -> "1"
            2 -> "2"
            else -> "default"
        }
        return resalt2

    }

}
class Person(var name: String = "Анастасия", var age : Int = 20){}
