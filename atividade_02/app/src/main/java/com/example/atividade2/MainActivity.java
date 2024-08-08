package com.example.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double saldo1, taxa1;
    EditText saldo, taxa;
    TextView resultado;
    Button enviar;
    Calculo c = new Calculo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saldo = (EditText)findViewById(R.id.etsaldo);
        saldo1 = Double.parseDouble(saldo.getText().toString());
        taxa = (EditText)findViewById(R.id.ettaxa);
        taxa1 = Double.parseDouble(taxa.getText().toString());
        resultado = (TextView)findViewById(R.id.tvresultado);
        enviar = (Button)findViewById(R.id.btenviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText("O novo saldo é: " + c.getCalculo(saldo1, taxa1));
            }
        });
    }
}
