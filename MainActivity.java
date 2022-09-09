package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private Button button;
        private TextView textview;
        private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button);
        button=findViewById(R.id.button2);
        textview=findViewById(R.id.textView3);
        textview=findViewById(R.id.textView4);
        editText=findViewById(R.id.editTextTextPassword);
        editText=findViewById(R.id.editTextTextEmailAddress);
    }
}