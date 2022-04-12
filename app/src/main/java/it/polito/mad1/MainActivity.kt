package it.polito.mad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var count: Int = 0
    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = findViewById<Button>(R.id.button)
        val tv = findViewById<TextView>(R.id.textView)

        b.setOnClickListener{
            count ++
            tv.text = "$count"
            if (count  % 5 == 0) {
                //creo un intent ed avvio CongratulationActivity con StartActivity
                val i = Intent(this, CongratulationsActivity::class.java)
                i.putExtra("threshold", count)
                startActivity(i)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", count)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        count = savedInstanceState.getInt("count")
        tv.text = "$count"
    }
}