import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(String name) {
        this.name = name;
        this.allReviewed = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int countReviews() {
        return this.allReviewed.size();
    }

    public void addReview(IReviewed parkLocation) {
        this.allReviewed.add(parkLocation);
    }


}
