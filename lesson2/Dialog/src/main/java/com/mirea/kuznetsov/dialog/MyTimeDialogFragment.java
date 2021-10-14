package com.mirea.kuznetsov.dialog;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        return new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener () {
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(
                        getContext(),
                        String.format("Hour: %d, Minute: %d", hourOfDay, minute),
                        Toast.LENGTH_SHORT
                ).show();
            }
        },
        calendar.get(Calendar.HOUR_OF_DAY),
        calendar.get(Calendar.MINUTE), true);
    }
}
