package com.aymen.magic8ball

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.magic_eightball_result.*
import java.text.DecimalFormat

class Magic8BallResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.magic_eightball_result)

        show8BallResults()
        setOnClickListenerForButton()
    }


    private fun show8BallResults(){
        var formatted = getIntent().getExtras().getString("ballResults")
        txt8BallResults.setText(formatted.toString())
    }

    private fun setOnClickListenerForButton(){
        btnAskAgain.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}