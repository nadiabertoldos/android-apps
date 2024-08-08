--------------------------------TELA INICIAL---------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:background="@drawable/telainicial">

    <TextView
        android:layout_width="300dp"
        android:layout_height="50dp"
        android:fontFamily="sans-serif-light"
        android:text="ARTISTAS"
        android:textAlignment="center"
        android:textColor="#000000"
        android:textSize="40dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.504"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.242" />

    <Button
        android:id="@+id/btvangogh"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:background="#C9ADCCE6"
        android:fontFamily="sans-serif-light"
        android:text="Van Gogh"
        android:textColor="#000000"
        android:textSize="25dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.504"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.6" />

    <Button
        android:id="@+id/bttarsila"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:background="#C9ADCCE6"
        android:fontFamily="sans-serif-light"
        android:text="Tarsila do Amaral"
        android:textSize="25dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.45" />

    <Button
        android:id="@+id/btleo"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:background="#C9ADCCE6"
        android:fontFamily="sans-serif-light"
        android:text="Leonardo da Vinci"
        android:textSize="25dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.755" />

</androidx.constraintlayout.widget.ConstraintLayout>


package com.example.a03_10_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button vangogh, tata, leo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vangogh = findViewById(R.id.btvangogh);
        tata = findViewById(R.id.bttarsila);
        leo = findViewById(R.id.btleo);

        vangogh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gogh();
            }
        });

        tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tata();
            }
        });

        leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                leo();
            }
        });
    }

    public void gogh(){
        Intent intent = new Intent(this,Tela2.class);
        startActivity(intent);
    }
    public void tata(){
        Intent intent = new Intent(this,Tela3.class);
        startActivity(intent);
    }
    public void leo(){
        Intent intent = new Intent(this,Tela4.class);
        startActivity(intent);
    }

}



--------------------------------TELA 2---------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Tela2"
    android:background="@drawable/vango">

    <Button
        android:id="@+id/btvoltar2"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:background="#C600556A"
        android:text="Voltar"
        android:textColor="#FFFFFF"
        android:textSize="20dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.856" />

    <TextView
        android:id="@+id/textovan"
        android:layout_width="350dp"
        android:layout_height="500dp"
        android:fontFamily="sans-serif-medium"
        android:text="Grandes galhos de flores como este contra um céu azul eram um dos assuntos favoritos de Van Gogh. As amendoeiras florescem no início da primavera, tornando-as um símbolo de uma nova vida. Van Gogh pegou emprestado o assunto, os contornos arrojados e o posicionamento da árvore no plano da gravura japonesa."
        android:textAlignment="center"
        android:textColor="#ffff"
        android:textSize="28dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.491"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.069" />

</androidx.constraintlayout.widget.ConstraintLayout>

package com.example.a03_10_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2 extends AppCompatActivity {

    Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        voltar = findViewById(R.id.btvoltar2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retorno();
            }
        });
    }
    public void retorno(){
        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);
    }
}

--------------------------------TELA 3---------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Tela3"
    android:background="@drawable/abaporu">

    <Button
        android:id="@+id/btvoltar3"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:background="#C7EBD107"
        android:text="voltar"
        android:textColor="#FFFFFF"
        android:textSize="20dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.857" />

    <TextView
        android:id="@+id/textotar"
        android:layout_width="350dp"
        android:layout_height="350dp"
        android:fontFamily="sans-serif-medium"
        android:text="Na pintura vemos um homem com grandes pés e mãos, e ainda o sol e um cacto. Estes elementos podem representar o trabalho físico que era o ofício da maior parte da população brasileira naquele período."
        android:textAlignment="center"
        android:textColor="#ffff"
        android:textSize="28dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.737"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.33" />

</androidx.constraintlayout.widget.ConstraintLayout>

package com.example.a03_10_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela3 extends AppCompatActivity {

    Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        voltar = findViewById(R.id.btvoltar3);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retorno3();
            }
        });
    }

    public void retorno3(){
        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);
    }
}


--------------------------------TELA 4---------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Tela4"
    android:background="@drawable/monalisa">

    <Button
        android:id="@+id/btvoltar4"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:background="#C78DA188"
        android:text="Voltar"
        android:textSize="20dp"
        android:textColor="#FFFFFF"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.85" />

    <TextView
        android:id="@+id/textoleo"
        android:layout_width="350dp"
        android:layout_height="400dp"
        android:fontFamily="sans-serif-medium"
        android:text="Mona Lisa destaca-se pela estética, técnicas e recursos artísticos utilizados. O sorriso enigmático e a expressão serena são as características mais marcantes da pintura. Da Vinci buscou também retratar uma harmonia entre a humanidade e a natureza. Isto é observado na harmonia existente entre Mona Lisa e a paisagem de fundo."
        android:textAlignment="center"
        android:textColor="#ffff"
        android:textSize="25dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintHorizontal_bias="0.737"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.33" />
</androidx.constraintlayout.widget.ConstraintLayout>

package com.example.a03_10_2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4 extends AppCompatActivity {

    Button voltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        voltar = findViewById(R.id.btvoltar4);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                retorno4();
            }
        });
    }
    public void retorno4(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


