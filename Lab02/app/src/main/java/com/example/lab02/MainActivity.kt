package com.example.lab02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var actionSentButton: Button
    private lateinit var editTextWeight: EditText
    private lateinit var editTextHeight: EditText
    private lateinit var textViewCalculate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionSentButton = findViewById(R.id.btnCalculate)
        editTextWeight = findViewById(R.id.editWeight)
        editTextHeight = findViewById(R.id.editHeight)
        textViewCalculate = findViewById(R.id.textCalculate)


        actionSentButton.setOnClickListener(

        )


    }

}