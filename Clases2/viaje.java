package com.company;

import java.util.ArrayList;

public class viaje {

    private ArrayList<plan> planes;
    private int ID;



    public viaje(int ID){

        planes = new ArrayList<plan>();
        this.ID=ID;
    }

    public void addPlanHotel(plan p){
        if(p.getInformacion("hotel").verificarDisponibilidad(p) && verificarFechaReserva(p)) {
            planes.add(p); // si no esta ocupado el hotel y no tengo otra reserva en la misma fecha agrego el plan
        }

    }

    public void abrirGmail(){

        plan p = generarPlanConDatosGmail(); 
        addPlanHotel(p);  //pregunta si esta ocupado o no con el addplanhotel
    }


    public boolean verificarDisponibilidad(plan p){

        return confirmacionHotel(); //se encarga el hotel que es otro sistema
    }

    public boolean verificarFechaReserva(plan p){

        boolean validar=true;

        for(int i =0;i<this.planes.size(),i++){
            if(this.planes.get(i).esHotel()){
            if (verificarInfoConGoogleCalendar(this.planes.get(i).getInformacion("checkin"), p.getInformacion("checkin")),this.planes.get(i).getInformacion("checkout"), p.getInformacion("checkout"))) {     // utilizamos google calendar
                validar = false;
            }
            }
        }
    return validar;
    }

}


