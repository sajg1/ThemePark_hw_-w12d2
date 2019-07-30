package attractions;

import interfaces.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 1.45 && visitor.getAge() > 12) {
            return true;
        } else {
            return false;
        }
    }
}
