package it.polito.mad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CongratulationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congratulations)
        val tv3 = findViewById<TextView>(R.id.textView5)
        val i = intent
        val v = i.getIntExtra("threshold", 0)
        tv3.text = "You reached $v"
    }
}