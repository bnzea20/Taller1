package com.example.interfaz1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.interfaces.MenuPrincipal;
import com.example.interfaces.SeleccionDeComidas;

public class Formulario extends AppCompatActivity {

    private TextView pregunta1;
    private RadioButton r1, r2, r3, r4, r5;
    private int i = 0;
    private String rta1, rta2, rta3, rta4, rta5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        pregunta1 = (TextView)findViewById(R.id.pregunta);
        r1 = (RadioButton) findViewById(R.id.R1);
        r2 = (RadioButton) findViewById(R.id.R2);
        r3 = (RadioButton) findViewById(R.id.R3);
        r4 = (RadioButton) findViewById(R.id.R4);
        r5 = (RadioButton) findViewById(R.id.R5);
        /*switch (i) {
            case 0:
                pregunta.setText("@String/pregunta1");
                //break;
            case 1:
                pregunta.setText("@pregunta2");
                break;
            case 2:
                pregunta.setText("@pregunta3");
                break;
            case 3:
                pregunta.setText("@pregunta4");
                break;
            case 4:
                pregunta.setText("@pregunta5");
                break;
            default:

        }¨*/
    }

    public void operacion(View view){
        String respuesta="";
        i++;

        /*if(r1.isChecked()==true){
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
        }
        if(i==5){
            Intent i = new Intent(Formulario.this, MenuPrincipal.class);
            startActivity(i);
        }*/

    }

}
