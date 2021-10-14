package com.mirea.kuznetsov.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public void onShowDialogClicked (View v) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onTimeDialogClicked (View v) {
        MyTimeDialogFragment dialogFragment = new MyTimeDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "TIME_DIALOG_FRAGMENT");
    }

    public void onDateDialogClicked(View v) {
        MyDateDialogFragment dialogFragment = new MyDateDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "DATE_DIALOG_FRAGMENT");
    }

    public void onProgressDialogClicked (View v) {
        MyProgressDialogFragment dialogFragment = new MyProgressDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "PROGRESS_DIALOG_FRAGMENT");
    }



    public void onReceiveProps(String any) {
        createToast(any);
    }

    public void onOkClicked () {
        createToast("Вы выбрали кнопку \"Иду дальше\"!");
    }

    public void onCancelClicked () {
        createToast("Вы выбрали кнопку \"Нет\"!");
    }

    public void onNeutralClicked () {
        createToast("Вы выбрали кнопку \"На паузе\"!");
    }

    protected void createToast (String body) {
        Toast.makeText(this, body, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}