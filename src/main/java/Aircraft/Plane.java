package Aircraft;

public class Plane {
    private PlaneType planeType;


    public Plane(PlaneType planeType) {
        this.planeType = planeType;

    }

    public PlaneType getType(){ return this.planeType;}

    public int getPlaneCapacity(){return this.planeType.getCapacity();}
    public int getPlaneWeight(){return this.planeType.getWeight();}
}
