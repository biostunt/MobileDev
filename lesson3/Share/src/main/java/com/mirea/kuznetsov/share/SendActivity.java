package com.mirea.kuznetsov.share;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        String text = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        ((TextView) findViewById(R.id.textView)).setText(text);
    }
}