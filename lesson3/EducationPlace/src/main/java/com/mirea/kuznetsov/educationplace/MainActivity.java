package com.mirea.kuznetsov.educationplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 143;
    private TextView textViewResult;

    public void startDataActivityOnClick(View v) {
        Intent intent = new Intent(this, FormActivity.class);
        startActivityForResult(intent, REQUEST_CODE);
    }

    private void setUniversityTextView(String formData){
        textViewResult.setText(formData);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textViewResult = findViewById(R.id.answerView);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null){
            String university = data.getStringExtra("name");
            setUniversityTextView(String.format("Вы обучаетесь в: %s", university));
        }
    }
}