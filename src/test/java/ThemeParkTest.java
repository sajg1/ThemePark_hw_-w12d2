import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollercoaster;

    @Before
    public void before() {
        themePark = new ThemePark("Alton Towers");
        rollercoaster = new RollerCoaster("Inferno", 9);
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

    




}
