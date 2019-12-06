package Model;

import Model.data.*;

import java.util.ArrayList;

public class Model {

    private Salad salad = new Salad();


    public void addIngredient(VegetableEnum vegetableEnum, float weight) {
        salad.add(new Vegetable(vegetableEnum, weight));
    }

    public void addIngredient(SpiceEnum spiceEnum, float weight) {
        salad.add(new Spice(spiceEnum, weight));
    }

    public ArrayList<Ingredient> getIngredientsInRangeOfCalories(float from, float to) {
        return salad.findIngredientInRangeOfCalories(from, to);
    }


    public float countSaladCalories() {
        return salad.countCalories();
    }

    public ArrayList<Ingredient> getIngredientList() {
        return salad.getIngredientList();
    }

    public void sortByName() {
        salad.sortByName();
    }

    public void sortByCalories() {
        salad.sortByCalories();
    }

    public void sortByWeight() {
        salad.sortByWeight();
    }
}
