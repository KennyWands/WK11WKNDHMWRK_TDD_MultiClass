import Aircraft.Plane;
import Aircraft.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void beforeEach(){
        plane = new Plane (PlaneType.BOEING717);
    }
    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING717, plane.getType());
    }
    @Test
    public void planeHasCapacity(){
        assertEquals(100, plane.getPlaneCapacity());
    }
    @Test
    public void planeHasWeight(){
        assertEquals(1000, plane.getPlaneWeight());
    }


}
