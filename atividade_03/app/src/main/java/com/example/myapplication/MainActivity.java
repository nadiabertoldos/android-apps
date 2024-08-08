package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText nome, v1, v2;
    Button enviar, subtrair, divisao, multiplicacao;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.etnome);
        enviar = findViewById(R.id.btenviar2);
        subtrair = findViewById(R.id.btsubtrair);
        divisao = findViewById(R.id.btdividir);
        multiplicacao = findViewById(R.id.btmultiplicacao);
        resultado = findViewById(R.id.tvresultado);
        v1 = findViewById(R.id.valor01);
        v2 = findViewById(R.id.valor02);

        enviar.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v){
                soma();
            }
        });

        //Método subtração
        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculo c = new Calculo();
                int valor1 = Integer.parseInt(v1.getText().toString());
                int valor2 = Integer.parseInt(v2.getText().toString());
                String res1 = String.valueOf(c.getSubtracao(valor1,valor2));
                resultado.setText("Resultado: " + res1);
            }
        });

        //Método divisão
        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculo c = new Calculo();
                int valor1 = Integer.parseInt(v1.getText().toString());
                int valor2 = Integer.parseInt(v2.getText().toString());
                String res2 = String.valueOf(c.getDivisao(valor1,valor2));
                resultado.setText("Resultado: " + res2);
            }
        });

        //Método multiplicar
        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calculo c = new Calculo();
                int valor1 = Integer.parseInt(v1.getText().toString());
                int valor2 = Integer.parseInt(v2.getText().toString());
                String res4 = String.valueOf(c.getMultiplicar(valor1,valor2));
                resultado.setText(" Resultado: " + res4);
            }
        });

    }
    //Método soma
    public void soma()
    {
        int valor1 = Integer.parseInt(v1.getText().toString());
        int valor2 = Integer.parseInt(v2.getText().toString());
        int res3 = valor1 + valor2;
        resultado.setText("Resultado: " + res3);
    }



}