package com.mirea.kuznetsov.task7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;

    public void onCancelClick (View v) {
        tvOut.setText("Нажата Кнопка CANCEL");
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button) findViewById(R.id.btnCancel);

        View.OnClickListener onOkClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата Кнопка ОК");
            }
        };
        buttonOk.setOnClickListener(onOkClick);
    }
}