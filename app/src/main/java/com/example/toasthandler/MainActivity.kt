package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton = findViewById(R.id.button_ok)
        myButton.setOnClickListener {showToast()}
    }
    private fun showToast() {
        val myToast = Toast.makeText(this, "вы нажали кнопку", Toast.LENGTH_LONG)
        myToast.show()
    }
}