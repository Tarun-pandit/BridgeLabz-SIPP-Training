import java.util.ArrayList;
import java.util.List;

/**
 * Generic Meal class to handle different meal plans.
 * @param <T> Type parameter extending MealPlan.
 */
public class Meal<T extends MealPlan> {
    private List<T> mealPlans;

    public Meal() {
        mealPlans = new ArrayList<>();
    }

    public void addMealPlan(T mealPlan) {
        mealPlans.add(mealPlan);
    }

    public List<T> getMealPlans() {
        return mealPlans;
    }

    /**
     * Generic method to validate and generate a personalized meal plan dynamically.
     * For simplicity, this method just returns true if the meal plan list is not empty.
     */
    public boolean validateMealPlans() {
        return !mealPlans.isEmpty();
    }

    /**
     * Display all meal plans.
     */
    public void displayMealPlans() {
        for (T mealPlan : mealPlans) {
            System.out.println(mealPlan);
        }
    }
}
