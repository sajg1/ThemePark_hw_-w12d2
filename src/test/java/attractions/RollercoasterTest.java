package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(10,1.2, 10.00);
        visitor2 = new Visitor(13,1.5, 20.00);
        visitor3 = new Visitor(21,1.3, 40.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllowVisitorWhoIsOldEnoughAndTallEnough() {
        assertEquals( true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cannotAllowVisitorWhoIsTooYoungAndShort() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void cannotAllowVisitorWhoIsOldEnoughButTooShort() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void canGetStartingPrice() {
        assertEquals( 8.40, rollerCoaster.getStartingPrice(), 0.01);
    }
}
