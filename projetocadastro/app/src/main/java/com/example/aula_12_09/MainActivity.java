package com.example.aula_12_09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView us, snh, resultado;
    Button et;
    String usuario, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        us = (TextView) findViewById(R.id.usuario);
        snh = (TextView) findViewById(R.id.senha);
        et = (Button) findViewById(R.id.entrar);
        resultado = (TextView) findViewById(R.id.result);




        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = (String) us.getText().toString();
                senha = (String) snh.getText().toString();
                if(usuario.equals("Fernanda")){
                    resultado.setText("Logado");

                    if(senha.equals("r1234")){
                        resultado.setText("Logado");
                    }else{
                        resultado.setText("Senha incorreta");
                    }

                }else{
                    resultado.setText("Usuario incorreto");

                    if(usuario.equals("Joao")){
                        resultado.setText("Logado");

                        if(senha.equals("w1244")){
                            resultado.setText("Logado");
                        }else{
                            resultado.setText("Senha incorreta");
                        }
                    }else{
                        resultado.setText("Usuario incorreto");

                        if(usuario.equals("Carla")){
                            resultado.setText("Logado");
                            if(senha.equals("e1234")){
                                resultado.setText("Logado");
                            }else{
                                resultado.setText("Senha incorreta");
                            }
                        }else{
                            resultado.setText("Usuario incorreto");
                        }
                    }
                }


            }
        });
    }
}