import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollercoaster;
    IceCreamStall iceCreamStall;


    @Before
    public void before() {
        themePark = new ThemePark("Alton Towers");
        rollercoaster = new RollerCoaster("Inferno", 9);
        iceCreamStall = new IceCreamStall("Joey's", "Joey", ParkingSpot.A1, 8);
    }

    @Test
    public void hasName() {
        assertEquals("Alton Towers", themePark.getName());
    }

    @Test
    public void allReviewsStartsEmpty() {
        assertEquals(0, themePark.countReviews());
    }

    @Test
    public void canAddReviewToArrayList() {
        themePark.addReview(rollercoaster);
        assertEquals(1, themePark.countReviews());
    }

    @Test
    public void canAddMultipleDifferentReviewedLocations() {
        themePark.addReview(rollercoaster);
        themePark.addReview(iceCreamStall);
        assertEquals(2, themePark.countReviews());
    }






}
