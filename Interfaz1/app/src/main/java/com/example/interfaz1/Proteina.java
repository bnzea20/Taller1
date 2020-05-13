package com.example.interfaz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class Proteina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proteina);

        DisplayMetrics metrica = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrica);
        int ancho=metrica.widthPixels;
        int alto=metrica.heightPixels;
        getWindow().setLayout((int)(ancho * 0.8),(int)(alto *0.8) );
    }
}
