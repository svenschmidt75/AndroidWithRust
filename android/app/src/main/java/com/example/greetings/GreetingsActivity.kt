package com.example.greetings

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.TextView

class GreetingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)

        val g = RustGreetings()
        val r = g.sayHello(", this comes from Rust")
        val textView = findViewById<View>(R.id.greetingField) as TextView
        textView.text = r
    }

    companion object {

        init {
            System.loadLibrary("rust")
        }
    }
}
