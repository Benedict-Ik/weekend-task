package com.example.weekendtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    //Get the Intent that started this activity
    val message = intent.getStringExtra(EXTRA_MESSAGE)

    val imageView = findViewById<ImageView>(R.id.imageView)
    val textView = findViewById<TextView>(R.id.textView)
    val textView2 = findViewById<TextView>(R.id.textView2)
    

}
