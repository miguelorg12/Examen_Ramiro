package com.example.examen_ramiro.Models;

public class Contacto {
    private String nombre;

    private String telefono;
    private String edad;
    private String descripcionconocer;
    public Contacto(String nombre, String telefono, String edad, String descripcionconocer) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
        this.descripcionconocer = descripcionconocer;
    }

    public String getDescripcionconocer() {
        return descripcionconocer;
    }

    public void setDescripcionconocer(String descripcionconocer) {
        this.descripcionconocer = descripcionconocer;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
