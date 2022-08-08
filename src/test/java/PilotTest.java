import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void beforeEach(){
        pilot = new Pilot ("Bob", Rank.CAPTAIN,"007" );
    }

    @Test
    public void pilotHasName(){
        assertEquals("Bob", pilot.getName());
    }
    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }
    @Test
    public void pilotHasLicence(){
        assertEquals("007", pilot.getLicence());
    }

    @Test
    public void pilotCanFly() {
        assertEquals("Well I've never flown one like that, but I'll give it a shot",pilot.flyThePlane());
    }
}
