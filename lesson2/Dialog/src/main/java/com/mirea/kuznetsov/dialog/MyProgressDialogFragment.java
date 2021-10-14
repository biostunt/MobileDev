package com.mirea.kuznetsov.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {

    protected ProgressBar progressBar;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //ProgressDialog is now Deprecated (API 26)
        builder
                .setTitle("Progress Bar")
                .setView(R.layout.progress_bar)
                .setPositiveButton("Ок", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity)getActivity()).onReceiveProps(
                                String.format("Current progress: ProgressDialog is now Deprecated (API 26)")
                        );
                        dialog.cancel();
                    }
                });

        return builder.create();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        progressBar = view.findViewById(R.id.progressBar);
    }
}
