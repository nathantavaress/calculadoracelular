package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultadoIMC extends AppCompatActivity {
    TextView resultado;
    String strNome;
    Float fltIdade, fltPeso, fltAltura, fltResultado;
    Button btnSair3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);

        btnSair3 = findViewById(R.id.btnSair3);
        btnSair3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

        resultado = (TextView) findViewById(R.id.textViewResultado);

        Intent intent = getIntent();
        strNome = intent.getStringExtra("nome");
        fltIdade = Float.parseFloat(intent.getStringExtra("idade"));
        fltAltura = Float.parseFloat(intent.getStringExtra("altura"));
        fltPeso = Float.parseFloat(intent.getStringExtra("peso"));
        fltResultado = fltPeso / (fltAltura * fltAltura);

        String strResultado = "Olá " + strNome + "!";
        strResultado = strResultado + "\n" + "Idade: " + fltIdade.toString();
        strResultado = strResultado + "\n" + "IMC = " +fltResultado.toString();

        if (fltResultado < 17){
            strResultado = strResultado + "\n" + "Muito abaixo do peso";
        }
        else if (fltResultado < 18.49){
            strResultado = strResultado + "\n" + "Abaixo do peso";
        }
        else if (fltResultado < 24.99){
            strResultado = strResultado + "\n" + "Peso normal";
        }
        else if (fltResultado < 29.99){
            strResultado = strResultado + "\n" + " Pré-obesidade";
        }
        else if (fltResultado < 34.99){
            strResultado = strResultado + "\n" + "Obesidade Grau 1";
        }
        else if (fltResultado < 39.99){
            strResultado = strResultado + "\n" + "Obesidade Grau 2";
        }
        else{
            strResultado = strResultado + "\n" + "Obesidade Grau 3";
        }

        resultado.setText(strResultado);

    }
}