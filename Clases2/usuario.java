package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class usuario {

    private ArrayList<viaje> viajes;

    public usuario(){

        viajes =  new ArrayList<viaje>();

    }


    public void reservarHotelMail(viaje v){

        v.abrirGmail();

    }

    public void reservarHotelManualmente(viaje v){
        System.out.println("Ingresar nombre del hotel : ");
        System.out.println("Ingresar cantidad de personas: ");
        System.out.println("Ingresar cantidad de habitaciones: ");
        System.out.println("Ingresar tipo de habitaciones: ");
        System.out.println("Ingresar check-in: ");
        System.out.println("Ingresar check-out: ");
        System.out.println("Ingresar direccion: ");
        System.out.println("Ingresar telefono: ");

        HashMap<String,Object> informacion = new HashMap<String, Object>();
        informacion.put("tipo", "hotel");  // en tipo se pone una instancia del plan
        informacion.put("nombreHotel","nombre");
        informacion.put("cantidadPersonas","cantPersonas");
        informacion.put("cantidadHabitaciones","cantHabitaciones");
        informacion.put("tipoHabitaciones","tipo");
        informacion.put("checkin","checkIN");
        informacion.put("checkout","checkOUT");
        informacion.put("direccionHotel","direccion");
        informacion.put("telefonoUsuario","telefono");
        informacion.put("formaPago","pago");

        plan p = new plan(informacion);  //primero genero el plan con los datos y despues intento agregar
        v.addPlanHotel(p);


    }


}
