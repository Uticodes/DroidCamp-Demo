package com.driodcamp_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.curve_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val readmorBtn = findViewById<>()

        btnReadMoreee.setOnClickListener {

            val intent = Intent(this, HurrayActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnTakeQuiz.setOnClickListener {
            startActivity(Intent(this, CongratsActivity::class.java))
        }


    }
}