package com.company;

import java.util.ArrayList;

public class viaje {

    private ArrayList<plan> planes;
    private int ID;

    public viaje(){

        planes = new ArrayList<>();
        ID =(int) Math.random()*10000;
    }

    public int size(){return planes.size();}

    public plan getPlan(int i){return planes.get(i);}

    public void addPlan(plan pNuevo){this.planes.add(pNuevo);}

}
