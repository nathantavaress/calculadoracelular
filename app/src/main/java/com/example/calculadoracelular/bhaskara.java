package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class bhaskara extends AppCompatActivity {

    EditText ValorA, ValorB, ValorC;

    Button btnCalcularBhaskara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhaskara);

        ValorA = (EditText) findViewById(R.id.editTextValorA);
        ValorB = (EditText) findViewById(R.id.editTextValorB);
        ValorC = (EditText) findViewById(R.id.editTextValorC);
        btnCalcularBhaskara = (Button) findViewById(R.id.btnCalcularBhaskara);
    }
}