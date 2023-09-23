package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tela2formulario extends AppCompatActivity {

    TextView tvRecebe;
    Button btnSair5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2formulario);

        btnSair5 = findViewById(R.id.btnSair5);
        btnSair5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });

        // puxa da outra tela as informações que estou pedindo
        tvRecebe = (TextView) findViewById(R.id.tvRecebe);
        String nome = getIntent().getStringExtra("Nome");
        String sobrenome = getIntent().getStringExtra("Sobrenome");

        // mostra as informações que foram colocadas na tela 1
        tvRecebe.setText(nome +" "+ sobrenome);
    }
}