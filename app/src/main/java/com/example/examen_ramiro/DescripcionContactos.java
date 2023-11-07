package com.example.examen_ramiro;

import androidx.appcompat.app.AppCompatActivity;
import com.example.examen_ramiro.R;
import android.os.Bundle;
import android.widget.TextView;

public class DescripcionContactos extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_contactos);
        Bundle bundle = getIntent().getExtras();
        String edad = bundle.getString("edad");
        String descripcionconocer = bundle.getString("descripcion");
        String nombre = bundle.getString("nombre");
        TextView ed = findViewById(R.id.textedad);
        TextView desc = findViewById(R.id.textdescripcion);
        TextView nom = findViewById(R.id.textnombre);
        ed.setText("Edad:" + edad);
        desc.setText("Descripcion:" + descripcionconocer);
        nom.setText("Nombre:" + nombre);

    }
}