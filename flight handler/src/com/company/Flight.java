package com.company;

import java.util.ArrayList;

public class Flight {

    public Flight(int fNum, int planeModel, String time){  // Flight constructor
        this.fNum = fNum;
        this.planeModel = planeModel;
        this.time = time;
    }

    // INIT.
    int fNum;
    int planeModel;
    String time;

    // Plane models referenced by index
    String[] planes = {"Boeing 747", "ODIN19", "Private Jet"};

    void setPlaneModel(int p){
        planeModel = p;
    }

    void setTime(String t){
        time = t;
    }

    void setfNum(int num){
        fNum = num;
    }

    void printFlight(){
        System.out.println("Flight Number: " + fNum);
        System.out.println("Flight Time:   " + time);
        System.out.println("Plane Model:   " + planes[planeModel]);
    }
}
