package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class tela1formulario extends AppCompatActivity {

    EditText etEnviar, etEnviar2;
    Button btEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1formulario);

        etEnviar = (EditText) findViewById(R.id.etEnviar);
        etEnviar2 = (EditText) findViewById(R.id.etEnviar2);
        btEnviar = (Button) findViewById(R.id.btEnviar);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // intent faz com que troque de uma tela para outra
                Intent intent = new Intent(tela1formulario.this, tela2formulario.class);

                // informações que quero pegar
                intent.putExtra("Nome",etEnviar.getText().toString());
                intent.putExtra("Sobrenome",etEnviar2.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}