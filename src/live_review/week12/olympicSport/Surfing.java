package live_review.week12.olympicSport;

public class Surfing extends OlympicSport{


    public Surfing(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println(getName() + " the waves");
    }
}
