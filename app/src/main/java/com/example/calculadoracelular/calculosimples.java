package com.example.calculadoracelular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculosimples extends AppCompatActivity {
    private EditText txtNro1;
    private EditText txtNro2;
    private EditText txtNro3;
    private TextView tvResultado;
    Button bntSair2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculosimples);
        txtNro1 = findViewById(R.id.txtNro1);
        txtNro2 = findViewById(R.id.txtNro2);
        txtNro3 = findViewById(R.id.txtNro3);
        tvResultado = findViewById(R.id.tvResultado);

        bntSair2 = findViewById(R.id.btnSair2);
        bntSair2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                finishAffinity();
            }
        });
    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        int valor3 = Integer.parseInt(txtNro3.getText().toString());

        tvResultado.setText(String.valueOf(valor1 + valor2 + valor3));
    }
}