package People;

public class CrewMember extends Person {

    private Rank rank;
    public CrewMember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() { return this.rank;}

    public String relayMessage(){return "The pilot says he meant to do that";}
}
