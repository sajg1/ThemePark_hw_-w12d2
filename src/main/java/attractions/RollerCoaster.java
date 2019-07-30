package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private double startingPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.startingPrice = 8.40;
    }

    public double defaultPrice() {
        return startingPrice;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 1.45 && visitor.getAge() > 12) {
            return true;
        } else {
            return false;
        }
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return this.startingPrice * 2;
        } else {
            return this.startingPrice;
        }
    }


}
