package com.company;

public class coordenadas {

    private int latitud;
    private int longitud;
    private String ubicacion;
    private String nombre;

    public coordenadas(plan p) {

        this.ubicacion = p.getUbicacion();
        this.nombre = p.getNombre();
        latitudLongitud(p.getUbicacion());

    }

    public int getLatitud() {
        return latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNombre() {
        return nombre;
    }


    public void latitudLongitud(String s){

        if(s=="Madrid")
    {
        this.latitud = 123678;
        this.longitud = 5814962;
    }

        if(s=="Barcelona")
    {
        this.latitud = 456789123;
        this.longitud = 145358123;
    }

        if(s=="Japon")
    {
        this.latitud = 10489357;
        this.longitud = 6578941;
    }

        if(s=="Brasil")
    {
        this.latitud = 189123456;
        this.longitud = 25824126;
    }
}



}
