package com.example.test

import android.graphics.Color
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        var number = 0
        plus.setBackgroundColor(Color.parseColor(#47885e))
        minus.setBackgroundColor(Color.parseColor(#47885e))
        plusdecade.setBackgroundColor(Color.parseColor(#47885e))
        minusdecade.setBackgroundColor(Color.parseColor(#47885e))
        plus.setOnClickListener {
            number++
            Total.setText(number.toString())
        }
        minus.setOnClickListener {
            number--
            Total.setText(number.toString())
        }
        plusdecade.setOnClickListener {
            number = number+10
            Total.setText(number.toString())
        }
        minusdecade.setOnClickListener {
            number = number-10
            Total.setText(number.toString())
        }
    }
}
