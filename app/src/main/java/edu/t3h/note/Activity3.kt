package edu.t3h.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        findViewById<TextView>(R.id.tvBack2).setOnClickListener{
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}