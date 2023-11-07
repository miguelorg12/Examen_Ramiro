package com.example.examen_ramiro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textocontador = findViewById(R.id.textcarga);
        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
                textocontador.setText("Cargando en: " + millisUntilFinished / 1000);
            }
            public void onFinish() {
                Intent intent = new Intent(MainActivity.this, PantallaContactos.class);
                startActivity(intent);
                textocontador.setText("Inicializando");
            }
        }.start();
    }
}