package edu.t3h.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        findViewById<TextView>(R.id.tvBack1).setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        findViewById<TextView>(R.id.tvSkip2).setOnClickListener{
            startActivity(Intent(this, Activity3::class.java))
        }
        this.findViewById<TextView>(R.id.tvNext2).setOnClickListener{
            startActivity(Intent(this, Activity3::class.java))
        }
    }
}