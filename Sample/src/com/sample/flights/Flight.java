package com.sample.flights;

import java.util.ArrayList;
import java.util.List;

public  class Flight {

    private int flightNumber ;
    private Integer a =100;
    private char flightName ;
    public ArrayList <CrewMember> crewMember = new ArrayList<CrewMember>();
    private static final int MAX_VALUE = 100;
    public Flight(){

        System.out.println("FLIGHT CONSTRUCTOR");
    }

    public Flight(int flightNumber,CrewMember member){

        this(flightNumber);
        crewMember.add(member);
    }




    public Flight(int flightNumber, char flightName){
        this(flightNumber);
        this.flightName = flightName;
    }
    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }

    // abstract boolean checkFlight();
}
