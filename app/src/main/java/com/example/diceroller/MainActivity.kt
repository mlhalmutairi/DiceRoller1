package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll :Button= findViewById(R.id.button)

        val img :ImageView= findViewById(R.id.imageView)

        roll.setOnClickListener {
            rollDice()

        }
    }
    fun changeImg(){

    }
    fun rollDice(){
        val d =Dice(6)
//            d.roll()

        var diceResult: Int =d.roll()
       
        val toast = Toast.makeText(this, "You Rolled ${diceResult} !", Toast.LENGTH_SHORT)
        toast.show()
        val img :ImageView= findViewById(R.id.imageView)

        val imgre = when(diceResult){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        img.setImageResource(imgre)

    }
}
class Dice(val sides :Int){
    fun roll (): Int {
        val rand = (1..sides).random()
        return rand

    }
}