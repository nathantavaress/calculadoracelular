package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

        if (TextUtils.isEmpty(nome.getText().toString())){
            nome.setError("Campo Obrigatório!");
            return;
        }
        if (TextUtils.isEmpty(idade.getText().toString())){
            nome.setError("Campo Obrigatório!");
            return;
        }
        if (TextUtils.isEmpty(peso.getText().toString())){
            peso.setError("Campo Obrigatório!");
            return;
        }
        if (TextUtils.isEmpty(altura.getText().toString())){
            altura.setError("Campo Obrigatório!");
            return;
        }

        Intent intent = new Intent(this, resultadoIMC.class);
        intent.putExtra("nome",nome.getText().toString());
        intent.putExtra("idade",idade.getText().toString());
        intent.putExtra("altura",altura.getText().toString());
        intent.putExtra("peso",peso.getText().toString());
        startActivity(intent);

    }

}