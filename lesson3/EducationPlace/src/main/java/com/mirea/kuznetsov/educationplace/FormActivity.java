package com.mirea.kuznetsov.educationplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class FormActivity extends AppCompatActivity {

    private EditText universityInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        universityInput = findViewById(R.id.universityInput);
    }

    public void sendResultOnMainActivityOnClick(View v) {
        Intent intent = new Intent();
        intent.putExtra("name", universityInput.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}