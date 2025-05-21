package com.example.women_security_app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SafetyTips : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safety_tips)


        val edone = findViewById<EditText>(R.id.ednumberone)
        val edtwo = findViewById<EditText>(R.id.ednumbertwo)
        val edthree = findViewById<EditText>(R.id.ednumberthree)

        val btn = findViewById<Button>(R.id.btnupload)

        btn.setOnClickListener {
            val one = edone.text.toString()
            val two = edtwo.text.toString()
            val three = edthree.text.toString()

            val editor = getSharedPreferences("data", MODE_PRIVATE).edit()
            editor.putString("one", one)
            editor.putString("two", two)
            editor.putString("three", three)
            editor.apply()
            editor.commit()



        }




    }
}