package com.company;

public class Main {

    public static void main(String[] args) {

        plan planHotelM = new plan("hotelMadrid", "Madrid",250);
        plan planEvento1 = new plan("evento1Madrid", "Madrid",100);
        plan planVueloM = new plan("vueloMadrid", "Madrid",700);
        plan planEvento2 = new plan("evento2Madrid", "Madrid",50);
        plan traductorM = new plan("treductorMadrid", "Madrid",25);
        plan planHotelBa = new plan("hotelBarcelona", "Barcelona",250);
        plan planEvento5 = new plan("evento1Barcelona", "Barcelona",100);
        plan planVueloBa = new plan("vueloBarcelona", "Barcelona",700);
        plan planEvento6 = new plan("evento2Barcelona", "Barcelona",50);
        plan traductorBa = new plan("treductorBarcelona", "Barcelona",25);

        plan planHotelJ = new plan("hotelJapon", "Japon",400);
        plan planEvento3 = new plan("eventoJapon", "Japon",200);
        plan traductorJ = new plan("traductorJapon", "Japon",120);
        plan planVueloJ = new plan("vueloJapon", "Japon",1000);

        plan planHotelB = new plan("hotelBrasil", "Brasil",100);
        plan planEvento4 = new plan("eventoBrasil", "Brasil",60);
        plan traductorB = new plan("traductorBrasil", "Brasil",15);
        plan planVueloB = new plan("vueloBrasil", "Brasil",200);

        viaje españa = new viaje();
        españa.addPlan(planHotelM);
        españa.addPlan(planVueloM);
        españa.addPlan(traductorM);
        españa.addPlan(planEvento1);
        españa.addPlan(planEvento2);
        españa.addPlan(planHotelBa);
        españa.addPlan(planVueloBa);
        españa.addPlan(traductorBa);
        españa.addPlan(planEvento5);
        españa.addPlan(planEvento6);

        viaje japon = new viaje();
        japon.addPlan(planHotelJ);
        japon.addPlan(planVueloJ);
        japon.addPlan(traductorJ);
        japon.addPlan(planEvento3);

        viaje brasil = new viaje();
        brasil.addPlan(planHotelB);
        brasil.addPlan(planVueloB);
        brasil.addPlan(traductorB);
        brasil.addPlan(planEvento4);

        mapa mapMadrid = new mapa(españa,"Madrid");
        System.out.println("El mapa es de " + mapMadrid.mostrarUbicacion());
        System.out.println("Los planes asociados a la ubicacion son:" + "\n" + mapMadrid.mostrarMapa());


    }
}
