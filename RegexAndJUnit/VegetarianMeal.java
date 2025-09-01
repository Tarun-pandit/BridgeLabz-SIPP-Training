/**
 * Vegetarian meal plan implementation.
 */
public class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public String toString() {
        return getMealType() + " Meal Plan";
    }
}
