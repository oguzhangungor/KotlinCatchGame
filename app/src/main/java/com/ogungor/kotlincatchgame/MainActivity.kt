package com.ogungor.kotlincatchgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun ronaldo (view : View) {
        var ronaldoIntent=Intent(this,RonaldoCatch::class.java)
        startActivity(ronaldoIntent)
    }

    fun messi (view : View) {
        var messiIntent=Intent(this,MessiCatch::class.java)
        startActivity(messiIntent)
    }

    fun quaresma (view : View) {
        var quaresmaIntent=Intent(this,QuaresmaCatch::class.java)
        startActivity(quaresmaIntent)
    }
}