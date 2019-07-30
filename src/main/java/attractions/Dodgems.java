package attractions;

public class Dodgems extends Attraction {

    private double startingPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.startingPrice = 4.50;
    }

    public double getStartingPrice() {
        return startingPrice;
    }
}
