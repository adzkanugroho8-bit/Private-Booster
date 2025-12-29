package com.private.booster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boost = findViewById<Button>(R.id.boostBtn)
        val status = findViewById<TextView>(R.id.statusText)

        boost.setOnClickListener {
            status.text = "Status: Boosting..."

            val intent = packageManager
                .getLaunchIntentForPackage("com.tencent.ig")

            if (intent != null) {
                startActivity(intent)
                status.text = "Status: Ready"
            } else {
                status.text = "PUBG Global tidak ditemukan"
            }
        }
    }
}
