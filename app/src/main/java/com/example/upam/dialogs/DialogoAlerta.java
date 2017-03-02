package com.example.upam.dialogs;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by upam on 02/03/17.
 */

public class DialogoAlerta extends DialogFragment
{//25
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder =//25
                new AlertDialog.Builder(getActivity());

        builder.setMessage("Esto es un mensaje de alerta.")
                .setTitle("Información")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })

                .setNegativeButton("Neutral", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        //Toast.makeText((this,"OK neutral",Toast.LENGTH_SHORT));

                    }
                })

              .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       // Log.i("Dialogos", "Confirmacion Cancelada.");
                       dialog.cancel();
            }
        });

        return builder.create();
    }

}