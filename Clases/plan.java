package com.company;

public class plan {

    private String nombre;
    private String ubicacion;
    private float precio;

    public plan(String nombre, String ubicacion, float precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }


    public String getUbicacion() {
        return ubicacion;
    }


    public float getPrecio() {
        return precio;
    }



}
