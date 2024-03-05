package edu.t3h.note

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvNext1).setOnClickListener{
            startActivity(Intent(this, Activity2::class.java))
        }
        findViewById<TextView>(R.id.tvSkip1).setOnClickListener{
            startActivity(Intent(this, Activity3::class.java))
        }
    }
}