package People;

public class Passenger extends Person {

    private int numBags;
    private String flightNumber;
    public Passenger(String name, int numBags) {
        super(name);
        this.numBags = numBags;
        this.flightNumber = flightNumber;
    }
    public int getBags(){ return this.numBags;}

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
