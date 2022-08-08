import Aircraft.Plane;
import Aircraft.PlaneType;
import Flights.Flight;
import People.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;
    CrewMember crewMember, crewMember1;
    Passenger passenger, passenger1;
    ArrayList<CrewMember> crewMembers;
    ArrayList <Passenger> passengers;



    @Before
    public void beforeEach(){

        plane = new Plane (PlaneType.BOEING717);
        pilot = new Pilot ("Bob", Rank.CAPTAIN,"007" );
        crewMember = new CrewMember("Alice", Rank.FLIGHTATTENDANT);
        crewMember = new CrewMember("Barry", Rank.FLIGHTATTENDANT);
        crewMembers = new ArrayList<>();
        crewMembers.add(crewMember);
        crewMembers.add(crewMember1);
        passenger = new Passenger( "Andrew", 1);
        passenger1 = new Passenger( "Beth", 1);


        flight = new Flight(plane, pilot, crewMembers,
                "BA01","GLA", "EDI","17:00" );
    }
    @Test
    public void flightHasPlane() {
        assertEquals(PlaneType.BOEING717, flight.getPlane().getType());
    }

    @Test
    public void flightHasPilot() {
        assertEquals("Bob", flight.getPilot().getName());
    }

    @Test
    public void flightHasCrew() {
        Person returnedPerson = flight.getCrewMember(0);
        assertEquals("Barry", returnedPerson.getName());
    }

    @Test
    public void canGetPassengers() {
        flight.bookPassenger(passenger);
        assertEquals(passengers.get(0).getName(), flight.getPassengers());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("BA01", flight.getFlightNum());
    }
    @Test
    public void hasDestination() {
        assertEquals("GLA", flight.getDest());
    }

    @Test
    public void hasDeparturePort() {
        assertEquals("EDI", flight.getDepPort());
    }
    @Test
    public void hasTime() {
        assertEquals("17:00", flight.getDepTime());
    }
    @Test
    public void flightCanAddPassenger() {
        assertEquals("Andrew booked seat 0 on flight BA01",
                flight.bookPassenger(passenger));
    }
    @Test
    public void returnAvailableSeats() {
        flight.bookPassenger(passenger);
        assertEquals(99, flight.getAvailableSeats());
        assertEquals("BA01", passenger.getFlightNumber());
    }
}
