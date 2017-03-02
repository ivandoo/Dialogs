package com.example.upam.dialogs;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dialog2(View v)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoAlerta dialogo= new DialogoAlerta();
        dialogo.show(fragmentManager, "tagAlerta");
    }
   public void lista(View v)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoSeleccion dialog= new DialogoSeleccion();
        dialog.show(fragmentManager, "tagAlerta");
    }

    public void Dialog_Personal(View v)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoPersonalizado dialog1= new DialogoPersonalizado();
        dialog1.show(fragmentManager, "tagAlerta");
    }
    public void Time_Pickertt(View v)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        TimePickert dialog3= new TimePickert();
        dialog3.show(fragmentManager, "tagAlerta");
    }
    public void Time_Pickertt_Date(View v)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DatePickerFragment dialog4= new DatePickerFragment();
        dialog4.show(fragmentManager, "tagAlerta");
    }
}

