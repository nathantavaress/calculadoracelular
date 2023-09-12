package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultadoIMC extends AppCompatActivity {
    TextView resultado;
    String strNome;
    Float fltIdade, fltPeso, fltAltura, fltResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_imc);

        resultado = (TextView) findViewById(R.id.textViewResultado);

        Intent intent = getIntent();
        strNome = intent.getStringExtra("nome");
        fltIdade = Float.parseFloat(intent.getStringExtra("idade"));
        fltAltura = Float.parseFloat(intent.getStringExtra("altura"));
        fltPeso = Float.parseFloat(intent.getStringExtra("peso"));
        fltResultado = fltPeso / (fltAltura * fltAltura);

        resultado.setText(fltResultado.toString());
    }
}