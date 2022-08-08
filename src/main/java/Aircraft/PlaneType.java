package Aircraft;

public enum PlaneType {
    BOEING717 (100, 1000),
    BOEING727 (200, 2000),
    BOEING737 (300, 3000),
    BOEING747 (400, 4000);


    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){return this.capacity;}

    public int getWeight(){return this.weight;}
}
