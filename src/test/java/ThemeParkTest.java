import attractions.Dodgems;
import attractions.Park;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollercoaster;
    IceCreamStall iceCreamStall;
    Dodgems dodgems;
    Park park;
    Visitor visitor;


    @Before
    public void before() {
        themePark = new ThemePark("Alton Towers");
        rollercoaster = new RollerCoaster("Inferno", 9);
        dodgems = new Dodgems("HickTown", 4);
        park = new Park("Prairie", 6);
        iceCreamStall = new IceCreamStall("Joey's", "Joey", ParkingSpot.A1, 8);
        visitor = new Visitor(15, 1.7, 30.00);
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

    @Test
    public void canAddVisitInThemePark() {
        themePark.visit(visitor, rollercoaster);
        themePark.visit(visitor, dodgems);
        themePark.visit(visitor, park);
        assertEquals(3, visitor.countVisitedAttractions());
        assertEquals(1, rollercoaster.getVisitCount());
        assertEquals(1, dodgems.getVisitCount());
        assertEquals(1, park.getVisitCount());
    }

    @Test
    public void canHashMapAllReviews() {
        themePark.addReview(rollercoaster);
        themePark.addReview(iceCreamStall);
        themePark.allReviewsMapped();
        System.out.println(themePark.allReviewsMapped());
    }
}
