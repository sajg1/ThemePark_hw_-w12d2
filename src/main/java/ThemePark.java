import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addVisitedAttraction(attraction);
    }

    public HashMap<String, Integer> allReviewsMapped() {
        HashMap<String, Integer> reviews = new HashMap<>();
        for (IReviewed review : this.allReviewed) {
            reviews.put(review.getName(), review.getRating());
        }
        return reviews;
    }


}
