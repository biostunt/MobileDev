package com.mirea.kuznetsov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        String text = getIntent().getStringExtra("dateString");
        TextView textView = findViewById(R.id.dateText);
        textView.setText(textView.getText().toString() + text);

    }
}