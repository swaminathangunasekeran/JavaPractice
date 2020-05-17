package com.sample.flights;

public class Sample {

    public static void  main(String args[]){
        System.out.println("SAMPLE MAIN");
        Sample sample = new Sample();
    }
    public Sample(){
        System.out.println("SAMPLE");
        CargoFlight cargo = new CargoFlight();
        CrewMember jenny = new CrewMember("jenny",FlightCrewJob.Pilot);
        Flight lxOA4 = new Flight(3434,jenny);
        int sizeOfList = lxOA4.crewMember.size()-1;
        System.out.println("Crew members"+lxOA4.crewMember.get(sizeOfList).name);
         //lxOA4.crewMember
    }


}
