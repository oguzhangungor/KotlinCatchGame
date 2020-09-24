package com.ogungor.kotlincatchgame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.DisplayMetrics
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_ronaldo_catch.*
import kotlin.random.Random

class RonaldoCatch : AppCompatActivity() {

    var score=0
    var time=0
    var sycle=0
    var runnable: Runnable = Runnable {  }
    var handler: Handler= Handler()

    var imageX: Int?=null
    var imageY:Int?=null
    var timeTextY=150
    var scoreTextY=150

    lateinit var displayMetrics: DisplayMetrics
    var activiyWidth =0
    var activiyHeight = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ronaldo_catch)

            timeText.text="Time : $time"
            scoreText.text="Score : $score"

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        var activiyWidth = displayMetrics.widthPixels
        var activiyHeight = displayMetrics.heightPixels


        val ronaldoAlert=AlertDialog.Builder(this)
        ronaldoAlert.setTitle("Ronaldo Catch Game")
        ronaldoAlert.setMessage("Ready ?")
        ronaldoAlert.setPositiveButton("Start") {dialogInterface, which ->


            object : CountDownTimer(15000,1000) {
                override fun onFinish() {
                    timeText.text="Finished"
                    Toast.makeText(applicationContext,"Your Score : $score",Toast.LENGTH_LONG).show()
                }

                override fun onTick(timerCr: Long) {
                    timeText.text="Time : ${timerCr/1000}"


                    randomLocation(activiyHeight,activiyWidth)


                   /* runnable= object : Runnable {
                        override fun run() {

                        }

                    }*/


                }

            }.start()


        }
        ronaldoAlert.show()
    }




    fun randomLocation(width: Int, heigt:Int) {



        var imageRandomX= Random.nextInt(heigt-imageView2.height)
        var imageRandomY=Random.nextInt(width-(imageView2.width+scoreTextY))
        scoreText.text="w: $imageRandomX, h: $imageRandomY"
        imageView2.x= imageRandomX.toFloat()
        if(imageRandomY!=0){
            imageView2.y=imageRandomY.toFloat()
        }else
        {
            imageView2.y=(imageRandomY+timeTextY).toFloat()
        }


    }













    fun ronaldoCatch(view : View){
        score++
        scoreText.text="Score : $score"



    }
}