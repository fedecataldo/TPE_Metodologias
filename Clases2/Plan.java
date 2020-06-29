package com.company;

import java.util.HashMap;

public class Plan {

    HashMap<String,Object> informacion;   // como los planes pueden tener diferente info utilizamos una hash

    public plan(HashMap info){

        this.informacion = info;

    }

    public Object getInformacion(String key){

        return this.informacion.get(key);

    }

    public boolean esHotel(){

        if (informacion.get("tipo") == "hotel"){
            return true;

        }
        return false;
    }

}
