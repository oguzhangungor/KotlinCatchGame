package com.ogungor.kotlincatchgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_ronaldo_catch.*

class QuaresmaCatch : AppCompatActivity() {
    var score=0
    var time=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quaresma_catch)


        timeText.text="Time : $time"
        scoreText.text="Score : $score"

        val quaresmaDialog= AlertDialog.Builder(this)
        quaresmaDialog.setTitle("Quaresma Catch Game")
        quaresmaDialog.setMessage("Ready ?")
        quaresmaDialog.setPositiveButton("Start") { dialogInterface, which ->


            object : CountDownTimer(15000,1000) {
                override fun onFinish() {
                    Toast.makeText(applicationContext,"Your Score : $score", Toast.LENGTH_LONG).show()
                }

                override fun onTick(timerCr: Long) {
                    timeText.text="Time : ${timerCr/1000}"
                }

            }.start()


        }
        quaresmaDialog.show()
    }
}