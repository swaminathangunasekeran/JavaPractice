package com.sample.flights;

public class CrewMember {
    private FlightCrewJob flightCrewJob;
    public String name;

    public CrewMember(String name, FlightCrewJob flightCrewJob){

        this(flightCrewJob);
        this.name = name;

    }
    public CrewMember(FlightCrewJob flightCrewJob){

        this.flightCrewJob = (FlightCrewJob) flightCrewJob;
    }
}
