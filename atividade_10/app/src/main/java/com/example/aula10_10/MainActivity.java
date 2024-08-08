package com.example.aula10_10;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nome, idade, sexo, cidade, valor;
    Button enviar;
    Double v1 = Double.parseDouble(idade.getText().toString());
    Double valorFinal, res1, res2, res3;
    Double valor1 = Double.parseDouble(valor.getText().toString());



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.etNome);
        idade = findViewById(R.id.etIdade);
        sexo = findViewById(R.id.etSexo);
        cidade = findViewById(R.id.etCidade);
        valor = findViewById(R.id.etValor);
        enviar = findViewById(R.id.btEnviar);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Ação para o botão enviar
                if (v1 > 18 && v1 < 25) {
                    res1 = (valor1 * 20) / 100;
                }
                else if(v1 > 25 && v1 < 35){
                    res1 = (valor1 * 10) / 100;
                }
                else if(v1 > 35){
                    res1 = (valor1 * 5) / 100;
                }
                else if(cidade.equals("Diadema")){
                    res2 = (valor1 * 10) / 100;
                }
                else if(cidade.equals("São Paulo")){
                    res2 = (valor1 * 15) / 100;
                }
                else if(cidade.equals("Santo André")){
                    res2 = (valor1 * 5) / 100;
                }
                else if(cidade.equals("São Bernardo do Campo")){
                    res2 = (valor1 * 12) / 100;
                }
                else if(sexo.equals("Masculino")){
                    res3 = (valor1 * 10) / 100;
                }
                valorFinal = valor1 + res1 + res2 + res3;

                String resposta = nome.getText().toString() + " - Valor do seguro: " + valorFinal;
                print("Dados do sistema", resposta);
           }
        });


    }


    public void print (String titulo, String mensagem){
        AlertDialog.Builder m = new AlertDialog.Builder(MainActivity.this);
        m.setTitle(titulo);
        m.setMessage(mensagem);
        m.setNeutralButton("OK", null);
        m.show();
    }
}
