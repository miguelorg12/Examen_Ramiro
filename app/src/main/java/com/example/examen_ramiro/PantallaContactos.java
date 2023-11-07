package com.example.examen_ramiro;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.example.examen_ramiro.Adapters.ContactoAdaptador;
import com.example.examen_ramiro.Models.Contacto;
import com.example.examen_ramiro.R;
import java.util.ArrayList;
import java.util.List;

public class PantallaContactos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_contactos);
        ArrayList <Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Israel", "8712556689", "20", "Lo conoci estando en la prepa"));
        contactos.add(new Contacto("Miguel", "8716556689", "19", "Lo conoci estando en la prepa"));
        contactos.add(new Contacto("Norma", "8712246689", "55", "Es mi mamá"));
        contactos.add(new Contacto("Harold", "8715556689", "19", "Lo conoci estando en la prepa"));
        contactos.add(new Contacto("Emith", "8712556689", "25", "Lo conoci en la universidad"));
        ContactoAdaptador adaptador = new ContactoAdaptador(contactos);
        RecyclerView rv = findViewById(R.id.rvcontactos);
        rv.setAdapter(adaptador);
        rv.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != getPackageManager().PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.CALL_PHONE}, 1987);
        }
    }
}