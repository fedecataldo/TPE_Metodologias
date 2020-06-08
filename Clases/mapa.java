package com.company;

import com.company.coordenadas;

import java.util.ArrayList;

public class mapa {

    private ArrayList<coordenadas> puntosMapa;
    private String ubicacion;

    public mapa(viaje v, String u){

        puntosMapa = new ArrayList<>();
        this.ubicacion = u;

        this.cargarCoordenadas(v);

    }

    public void cargarCoordenadas(viaje v) {

        for(int i = 0;i < v.size();i++){

            if(v.getPlan(i).getUbicacion() == this.ubicacion){

                coordenadas c = new coordenadas(v.getPlan(i));
                this.puntosMapa.add(c);

            }
        }
    }


    public String mostrarMapa(){

        String aux="";

        for(int i = 0; i < puntosMapa.size();i++){

         aux += "El evento: " + puntosMapa.get(i).getNombre() + "Tiene una latitud y longitud en el mapa igual a: " + puntosMapa.get(i).getLatitud() + " - " + puntosMapa.get(i).getLongitud() + "\n";

        }

    return aux;
    }

    public String mostrarUbicacion(){return this.ubicacion;}

}
