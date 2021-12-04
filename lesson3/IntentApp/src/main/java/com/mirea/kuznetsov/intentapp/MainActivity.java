package com.mirea.kuznetsov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public String getDateTime() {
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format, new Locale("ru"));
        String dateString = sdf.format(new Date(dateInMillis));
        return dateString;
    }

    public void onButtonClicked(View v) {
        Intent intent = new Intent(this, ReceiverActivity.class);
        intent.putExtra("dateString", this.getDateTime());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}