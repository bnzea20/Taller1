package com.example.interfaces;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.interfaz1.Proteina;
import com.example.interfaz1.R;

public class Almuerzo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuerzo);

    }

    public void Prote(View view){
        startActivity(new Intent(Almuerzo.this, Proteina.class));

    }
}
