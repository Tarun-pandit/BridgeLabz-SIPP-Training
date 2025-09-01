/**
 * Vegan meal plan implementation.
 */
public class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public String toString() {
        return getMealType() + " Meal Plan";
    }
}
