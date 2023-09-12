package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnSair, btnCalculo, btnCalculo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

        btnCalculo = findViewById(R.id.btnCalculo);
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculosimples = new Intent(getApplicationContext(),com.example.calculadoracelular.calculosimples.class);
                startActivity(calculosimples);
            }
        });

        btnCalculo2 = findViewById(R.id.btnCalculo2);
        btnCalculo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculosIMC = new Intent(getApplicationContext(),com.example.calculadoracelular.calculoIMC.class);
                startActivity(calculosIMC);
            }
        });
    }
}