package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    private double startingPrice;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.startingPrice = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 1.45 && visitor.getAge() > 12) {
            return true;
        } else {
            return false;
        }
    }
}
