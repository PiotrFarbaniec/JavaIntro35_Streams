package task2;

import java.util.List;

public class Pizza {
    private boolean isVegetarian;
    private List<Ingredients> ingredients;
    private int calories;
    private PizzaName name;


    public Pizza(boolean isVegetarian, List<Ingredients> ingredients, int calories, PizzaName name) {
        this.isVegetarian = isVegetarian;
        this.ingredients = ingredients;
        this.calories = calories;
        this.name = name;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public PizzaName getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{" +  getName() + " " + getIngredients() +" "+ getCalories() +" "+ isVegetarian() + "}";
    }
}