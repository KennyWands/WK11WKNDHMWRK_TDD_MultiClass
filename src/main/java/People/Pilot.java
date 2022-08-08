package People;

public class Pilot extends CrewMember {

    private String licence;
    public Pilot(String name, Rank rank, String licence) {
        super(name, rank);
        this.licence = licence;
    }

    public String getLicence() { return this.licence;
    }
    public String flyThePlane(){
        return "Well I've never flown one like that, but I'll give it a shot";
    }
}
