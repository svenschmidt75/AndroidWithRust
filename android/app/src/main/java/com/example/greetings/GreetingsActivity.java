package com.example.greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GreetingsActivity extends AppCompatActivity {

    static {
        System.loadLibrary("rust");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);

        RustGreetings g = new RustGreetings();
        String r = g.sayHello(", this comes from Rust");
        ((TextView)findViewById(R.id.greetingField)).setText(r);
    }
}
