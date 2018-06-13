package com.aymen.magic8ball

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.magic_eightball_result.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    var randomNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateRandomNumber()
        setOnClickListenerForButton()
    }

    fun generateRandomNumber(): Int{
        var random = Random()
        randomNum = random.nextInt(20)
        return randomNum
    }

    private fun generate8BallText() : String{
        val list = ArrayList<String>()
        list.add("It is certain")
        list.add("It is decidedly so")
        list.add("Without a doubt")
        list.add("Yes definitely")
        list.add("You may rely on it")
        list.add("As I see it, yes")
        list.add("Most likely")
        list.add("Outlook good")
        list.add("Yes")
        list.add("Signs point to yes")
        list.add("Reply hazy try again")
        list.add("Ask again later")
        list.add("Better not tell you now")
        list.add("Cannot predict now")
        list.add("Concentrate and ask again")
        list.add("Don't count on it")
        list.add("My reply is no")
        list.add("My sources say no")
        list.add("Outlook not so good")
        list.add("Very doubtful")

        var text = list.get(randomNum)

        return text
    }

    private fun setOnClickListenerForButton(){
        btnAsk.setOnClickListener{
            val intent = Intent(this,Magic8BallResultsActivity::class.java)
            intent.putExtra("ballResults",generate8BallText())
            startActivity(intent)
        }
    }

}
