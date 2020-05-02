package com.example.otelodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sayfa2.*

class sayfa2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa2)
        button2.setOnClickListener {
            val intent = Intent(this, uygulama::class.java)

            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, hakkimizda::class.java)

            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent(this, bilgiler::class.java)

            startActivity(intent)

        }
        button5.setOnClickListener {
            val intent = Intent(this, iletisim::class.java)

            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent(this, otelfotograflari::class.java)

            startActivity(intent)
        }
    }
}

