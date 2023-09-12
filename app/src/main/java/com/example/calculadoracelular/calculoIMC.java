package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculoIMC extends AppCompatActivity {
    EditText nome,idade,peso,altura;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);

        nome = (EditText) findViewById(R.id.editTextNome);
        idade = (EditText) findViewById(R.id.editTextIdade);
        peso = (EditText) findViewById(R.id.editTextPeso);
        altura = (EditText) findViewById(R.id.editTextAltura);
        botao = (Button) findViewById(R.id.btncalcularIMC);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarResultado();
            }
        });
    }

    public void mostrarResultado(){

    }
}