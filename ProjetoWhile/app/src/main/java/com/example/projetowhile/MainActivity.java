package com.example.projetowhile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText us,sn;
    Button lg;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        us = (EditText) findViewById(R.id.usuario);
        sn = (EditText) findViewById(R.id.senha);
        lg = (Button) findViewById(R.id.logar);
        res = (TextView) findViewById(R.id.resultado);

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = String.valueOf(us.getText().toString());
                String b = String.valueOf(sn.getText().toString());
                String usuario[] = {"José, Maria"};
                String senha[] = {"1234, 12345"};

                int i = 0, c = 0;

                while(i<2){
                    if (usuario[i].equals(a)){
                        res.setText("Logado");
                        c=2;
                    }
                }
                if (c == 0){
                    res.setText("Usuário ou senha inválida");
                }
            }
        });
    }
}

