package com.keshav.calcul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class IncreaseActivity : AppCompatActivity() {
    private lateinit var increaseButton: Button
    private lateinit var numberTextView: TextView
    private var number = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_increase)
        numberTextView = findViewById(R.id.numberTextView)
        increaseButton = findViewById(R.id.increaseButton)

        increaseButton.setOnClickListener {
            number++
            numberTextView.text = number.toString()
        }
    }
}