package com.keshav.calcul

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var resultTextView: TextView
    private lateinit var btnNex :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        resultTextView = findViewById(R.id.resultTextView)
        btnNex =findViewById(R.id.btnNext)

        editText1.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                calculateSum()
            }

            override fun afterTextChanged(s: Editable) {}


        })

        editText2.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                calculateSum()
            }

            override fun afterTextChanged(s: Editable) {}
        })
        btnNex.setOnClickListener {
            val intent = Intent(this,IncreaseActivity::class.java)
            startActivity(intent)
        }

    }

    private fun calculateSum() {
        val value1 = editText1.text.toString()
        val value2 = editText2.text.toString()

        if (value1.isNotEmpty() && value2.isNotEmpty()) {
            val sum = value1.toInt() + value2.toInt()
            resultTextView.text = sum.toString()
        } else {
            resultTextView.text = Constants.Value
        }
    }
}