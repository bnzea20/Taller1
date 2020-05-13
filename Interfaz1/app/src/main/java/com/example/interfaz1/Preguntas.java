package com.example.interfaz1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.interfaces.IniciarSesion;
import com.example.interfaces.MenuPrincipal;

public class Preguntas extends AppCompatActivity {
    private TextView pregunta1;
    private RadioButton r1,r2,r3,r4,r5;
    private int i=0;
    private String rta1,rta2,rta3,rta4,rta5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        pregunta1 = (TextView)findViewById(R.id.pregunta);
        r1 = (RadioButton) findViewById(R.id.R1);
        r2 = (RadioButton) findViewById(R.id.R2);
        r3 = (RadioButton) findViewById(R.id.R3);
        r4 = (RadioButton) findViewById(R.id.R4);
        r5 = (RadioButton) findViewById(R.id.R5);
        pregunta1.setText("¿Cuantas raciones de verdura u hortalizas consume al dia?");
    }

    public void operacion(View view){
        String respuesta="";
        i++;

        if(r1.isChecked()){
            respuesta=r1.getText().toString();
            r1.setChecked(false);
            r2.setChecked(false);
            r3.setChecked(false);
            r4.setChecked(false);
            r5.setChecked(false);
        }else if(r2.isChecked()==true){
            respuesta=r2.getText().toString();
            r1.setChecked(false);
            r2.setChecked(false);
            r3.setChecked(false);
            r4.setChecked(false);
            r5.setChecked(false);
        }else if(r3.isChecked()==true){
            respuesta=r3.getText().toString();
            r1.setChecked(false);
            r2.setChecked(false);
            r3.setChecked(false);
            r4.setChecked(false);
            r5.setChecked(false);
        }else if(r4.isChecked()==true){
            respuesta=r4.getText().toString();
            r1.setChecked(false);
            r2.setChecked(false);
            r3.setChecked(false);
            r4.setChecked(false);
            r5.setChecked(false);
        }else if(r5.isChecked()==true){
            respuesta=r5.getText().toString();
            r1.setChecked(false);
            r2.setChecked(false);
            r3.setChecked(false);
            r4.setChecked(false);
            r5.setChecked(false);
        }else{
            Toast.makeText(getApplicationContext(),"Selecciona una respuesta",Toast.LENGTH_SHORT).show();
        }
        if(i==5){
            Intent i = new Intent(Preguntas.this, MenuPrincipal.class);
            startActivity(i);
        }
        Verificar (i,respuesta);

    }
    public void Verificar (int i, String respuesta){
        switch (i) {
            case 0:
                rta1= respuesta;
                pregunta1.setText("¿Cuantos lácteos (leche yogurt, quesos) tomas al dia?");
                break;
            case 1:
                rta2= respuesta;
                pregunta1.setText("¿Cuantas raciones de carne de pollo, res o cerdo consumes a la semana?");
                break;
            case 2:
                rta3= respuesta;
                pregunta1.setText("¿Cuantas raciones de pescado o mariscos consumes a la semana?");
                break;
            case 3:
                rta4= respuesta;
                pregunta1.setText("¿Cuantas raciones de ensalada consume a la semana?");
                break;
            case 4:
                rta5= respuesta;
                break;
            default:
        }
    }
}
