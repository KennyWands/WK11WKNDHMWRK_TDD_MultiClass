import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void beforeEach(){
        passenger = new Passenger ("Kenny", 1);
    }
    @Test
    public void passengerHasName(){
        assertEquals("Kenny", passenger.getName());
    }
    @Test
    public void passengerHasBags() {
        assertEquals(1, passenger.getBags());
    }

}
