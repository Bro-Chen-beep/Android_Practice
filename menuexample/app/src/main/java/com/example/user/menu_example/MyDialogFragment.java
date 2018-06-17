package com.example.user.menu_example;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder thedialog =new AlertDialog.Builder(getActivity());

        thedialog.setTitle("Sample");

        thedialog.setMessage("Hello motherfucker");

        thedialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"clicked ok",Toast.LENGTH_SHORT).show();
            }
        });

        thedialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"clicked cancel",Toast.LENGTH_SHORT).show();
            }
        });
        return thedialog.create();
    }
}
