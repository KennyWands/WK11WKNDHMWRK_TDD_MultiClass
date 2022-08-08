import People.CrewMember;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {
    CrewMember crewMember;

    @Before
    public void beforeEach(){
        crewMember = new CrewMember("Alice", Rank.FLIGHTATTENDANT);
    }
    @Test
    public void crewHasName(){
        assertEquals("Alice", crewMember.getName());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("The pilot says he meant to do that", crewMember.relayMessage());
    }

    @Test
    public void crewHasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, crewMember.getRank());

    }
}
