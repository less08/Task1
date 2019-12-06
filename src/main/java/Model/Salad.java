package Model;

import Model.data.Ingredient;

import java.util.ArrayList;
import java.util.Comparator;

public class Salad {

    private ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();

    public void add(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    public float countCalories() {
        float sumOfCalories = 0;
        for (Ingredient ingredient : ingredientList) {
            sumOfCalories += ingredient.calculateCalories();
        }
        return sumOfCalories;
    }

    public void sortByName() {
        ingredientList.sort(new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient o1, Ingredient o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    public void sortByWeight() {
        ingredientList.sort(new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient o1, Ingredient o2) {
                if (o1.getWeight() > o2.getWeight())
                    return 1;
                else if (o1.getWeight() < o2.getWeight())
                    return -1;

                return 0;
            }
        });
    }

    public void sortByCalories() {
        ingredientList.sort(new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient o1, Ingredient o2) {
                if (o1.getCalories() > o2.getCalories())
                    return 1;
                else if (o1.getCalories() < o2.getCalories())
                    return -1;

                return 0;
            }
        });
    }

    public ArrayList<Ingredient> findIngridientInRangeOfCalories(float from, float to) {
        ArrayList<Ingredient> ingredientRangeList = new ArrayList<>();
        for (Ingredient ingredient : ingredientList) {
            if (ingredient.getCalories() >= from && ingredient.getCalories() <= to)
                ingredientRangeList.add(ingredient);
        }
        return ingredientRangeList;
    }

    public ArrayList<Ingredient> getIngredientList() {
        ArrayList<Ingredient> ingredientsCopy = new ArrayList<Ingredient>();
        ingredientsCopy.addAll(this.ingredientList);
        return ingredientsCopy;
    }
}
