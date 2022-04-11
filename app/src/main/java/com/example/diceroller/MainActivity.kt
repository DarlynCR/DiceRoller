package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var diceImageView: ImageView
    private lateinit var diceImageView2: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //La clase R se genera cuando se compila la APP - incluye los activos de la APP
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_roll)
        rollButton.setOnClickListener{ rollDice() }

        diceImageView = findViewById(R.id.iv_dice_image)
        diceImageView2 = findViewById(R.id.iv_dice_image2)

    }

    private fun rollDice() {
        //Toast.makeText(this, "Button clicked",Toast.LENGTH_SHORT).show()
        diceImageView.setImageResource(getRandomDiceImage())

        diceImageView2.setImageResource(getRandomDiceImage())

    }

    private fun getRandomDiceImage() : Int {

        val randomInt : Int = (1..6).random()

        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }

        return drawableResource

    }


}