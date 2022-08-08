package Flights;

import Aircraft.Plane;
import People.CrewMember;
import People.Passenger;
import People.Person;
import People.Pilot;

import java.util.ArrayList;

public class Flight {
    private Plane plane;
    private Pilot pilot;
    private ArrayList<CrewMember> crewMembers;
    private ArrayList<Passenger> passengers;

    private String flightNum;
    private String dest;
    private String depPort;
    private String depTime;

    public Flight(Plane plane, Pilot pilot, ArrayList<CrewMember> crewMembers,
                   String flightNum, String dest,
                  String depPort, String depTime) {
        this.plane = plane;
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = new ArrayList<>();
        this.flightNum = flightNum;
        this.dest = dest;
        this.depPort = depPort;
        this.depTime = depTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        for (Passenger passenger : passengers)
        System.out.println(passenger.getName());
        return passengers;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDest() {
        return dest;
    }

    public String getDepPort() {
        return depPort;
    }

    public String getDepTime() {
        return depTime;
    }

    public Person getCrewMember(int index) {
        return crewMembers.get(index);
    }

    public String bookPassenger(Passenger passenger){
        if(passengers.size() < getPlane().getPlaneCapacity()){
            passengers.add(passenger);
            passenger.setFlightNumber(this.flightNum);
            return String.format("%s booked seat %s on flight %s",
                    passenger.getName(), passengers.indexOf(passenger),
                    this.getFlightNum());
        }
        return "Error";
    }
    public int getAvailableSeats(){
        return getPlane().getPlaneCapacity()-passengers.size();
    }
}
