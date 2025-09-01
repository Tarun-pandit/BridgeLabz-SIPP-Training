/**
 * High-Protein meal plan implementation.
 */
public class HighProteinMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public String toString() {
        return getMealType() + " Meal Plan";
    }
}
