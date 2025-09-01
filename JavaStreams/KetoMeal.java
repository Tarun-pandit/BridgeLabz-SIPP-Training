/**
 * Keto meal plan implementation.
 */
public class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public String toString() {
        return getMealType() + " Meal Plan";
    }
}
