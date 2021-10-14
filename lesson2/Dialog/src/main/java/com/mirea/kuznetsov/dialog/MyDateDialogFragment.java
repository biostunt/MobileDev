package com.mirea.kuznetsov.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyDateDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        return new DatePickerDialog(getContext(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int y, int m, int d) {
                Toast.makeText(
                        getContext(),
                        // Month + 1 Is a feature cause the first month is 0.
                        String.format("Day: %d, Month: %d, Year: %d", d, m + 1, y),
                        Toast.LENGTH_SHORT
                ).show();
            }
        },
        calendar.get(Calendar.YEAR),
        calendar.get(Calendar.MONTH),
        calendar.get(Calendar.DAY_OF_MONTH)
        );
    }
}
