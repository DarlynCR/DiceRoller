package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var resulttext : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //La clase R se genera cuando se compila la APP - incluye los activos de la APP
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener{ rollDice() }

        resulttext = findViewById(R.id.tv_result)

        val countButton : Button = findViewById(R.id.btn_count)
        countButton.setOnClickListener{ countUp() }

        val resetButton : Button = findViewById(R.id.btn_reset)
        resetButton.setOnClickListener{ reset() }
    }

    private fun rollDice() {
        //Toast.makeText(this, "Button clicked",Toast.LENGTH_SHORT).show()
        resulttext.text = (1..6).random().toString()
    }

    private fun countUp() {

        with(resulttext){
            when(this.text){
                "Hello World!" -> this.text = 1.toString()
                "6" -> this.text
                else -> this.text = (this.text.toString().toInt() + 1).toString()
            }
        }


    }

    private fun reset(){
        resulttext.text = 0.toString()
    }

}