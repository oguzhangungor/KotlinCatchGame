package com.ogungor.kotlincatchgame

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_messi_catch.*

class MessiCatch : AppCompatActivity() {
    var score=0
    var timer=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messi_catch)


        val messiAlert= AlertDialog.Builder(this)
        messiAlert.setTitle("Messi Catch Game")
        messiAlert.setMessage("Ready ?")
        messiAlert.setPositiveButton("Start") { dialogInterface, which ->


            object : CountDownTimer(15000,1000) {
                override fun onFinish() {
                    Toast.makeText(applicationContext,"Your Score : $score",Toast.LENGTH_LONG).show()
                }

                override fun onTick(timerCr: Long) {
                    timeText.text="Time : ${timerCr/1000}"

                }

            }.start()


        }
        messiAlert.show()


    }
}