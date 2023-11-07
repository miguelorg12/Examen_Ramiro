package com.example.examen_ramiro.Adapters;
import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examen_ramiro.DescripcionContactos;
import com.example.examen_ramiro.PantallaContactos;
import com.example.examen_ramiro.R;
import com.example.examen_ramiro.Models.Contacto;

import java.util.List;

public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.viewHolder> implements View.OnClickListener {
    List <Contacto> Lista_Contactos;


    public ContactoAdaptador(List lista_contactos) {
        Lista_Contactos = lista_contactos;
    }
    @NonNull
    @Override
    public ContactoAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View v = ly.inflate(R.layout.recyclercontactos, parent, false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoAdaptador.viewHolder holder, int position) {
        Contacto c = Lista_Contactos.get(position);
        holder.setData(c);
        holder.txtnombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DescripcionContactos.class);
                intent.putExtra("edad", c.getEdad());
                intent.putExtra("descripcion", c.getDescripcionconocer());
                intent.putExtra("nombre", c.getNombre());
                v.getContext().startActivity(intent);
            }
        });

        holder.txttelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + c.getTelefono()));
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Lista_Contactos.size();
    }

    @Override
    public void onClick(View v) {
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre, txttelefono;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

        }

        public void setData(Contacto c) {
            txtnombre = itemView.findViewById(R.id.textnombre);
            txttelefono = itemView.findViewById(R.id.texttelefono);
            txtnombre.setText(c.getNombre());
            txttelefono.setText(c.getTelefono());
        }
    }
}
