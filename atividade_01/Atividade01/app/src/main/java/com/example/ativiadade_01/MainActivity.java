package com.example.ativiadade_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText v1, v2, v3;
    TextView  r;
    Button enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = (EditText)findViewById(R.id.valor1);

        v2 = (EditText)findViewById(R.id.valor2);

        v3 = (EditText)findViewById(R.id.valor3);

        r = (TextView)findViewById(R.id.tvresultado);
        enviar = (Button)findViewById(R.id.btenviar);

      enviar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             int a = Integer.parseInt(v1.getText().toString());
             int b = Integer.parseInt(v2.getText().toString());
             int c = Integer.parseInt(v3.getText().toString());

                  if (a > b && a < c){

                       r.setText(v1.getText().toString());
                  }
                  else if ( a < b &&  b > c ){
                      r.setText(v3.getText().toString());
                  }
                  else {
                      r.setText(v2.getText().toString());
                  }
              }

      });

    }
}
