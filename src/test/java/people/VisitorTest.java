package people;

import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    RollerCoaster rollercoaster;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        rollercoaster = new RollerCoaster("Inferno", 9);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void AttractionsArrayListStartsEmpty() {
        assertEquals(0, visitor.countVisitedAttractions());
    }

    @Test
    public void canAddAttractionToVisitedAttractions() {
        visitor.addVisitedAttraction(rollercoaster);
        assertEquals(1, visitor.countVisitedAttractions());
    }
}
