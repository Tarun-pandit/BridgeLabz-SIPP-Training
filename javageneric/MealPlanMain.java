/**
 * Main class to demonstrate the Personalized Meal Plan Generator using Java Generics.
 */
public class MealPlanMain {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>();
        vegetarianMeal.addMealPlan(new VegetarianMeal());
        vegetarianMeal.addMealPlan(new VegetarianMeal());

        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.addMealPlan(new VeganMeal());

        Meal<KetoMeal> ketoMeal = new Meal<>();
        ketoMeal.addMealPlan(new KetoMeal());

        Meal<HighProteinMeal> highProteinMeal = new Meal<>();
        highProteinMeal.addMealPlan(new HighProteinMeal());

        System.out.println("Vegetarian Meal Plans:");
        vegetarianMeal.displayMealPlans();

        System.out.println("\nVegan Meal Plans:");
        veganMeal.displayMealPlans();

        System.out.println("\nKeto Meal Plans:");
        ketoMeal.displayMealPlans();

        System.out.println("\nHigh-Protein Meal Plans:");
        highProteinMeal.displayMealPlans();

        // Validate meal plans
        System.out.println("\nValidation Results:");
        System.out.println("Vegetarian valid? " + vegetarianMeal.validateMealPlans());
        System.out.println("Vegan valid? " + veganMeal.validateMealPlans());
        System.out.println("Keto valid? " + ketoMeal.validateMealPlans());
        System.out.println("High-Protein valid? " + highProteinMeal.validateMealPlans());
    }
}
