package com.example.kotlin_ch12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            startService(Intent(this,MyService::class.java))
            Toast.makeText(this,"啟動Service",Toast.LENGTH_SHORT)
            finish()
        }
    }
}