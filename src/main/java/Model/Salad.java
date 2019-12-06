package Model;

import Model.data.Ingredient;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * This class represents data structure of ingredients hierarchy
 * @see Ingredient
 * @autor Elena Samsonova
 */

public class Salad {

    /**
     * Container for salad ingredients:
     * @see Model.data.Vegetable
     * @see Model.data.Spice
     */
    private ArrayList<Ingredient> ingredientList = new ArrayList<Ingredient>();

    /**
     *Appends element to the end of ingredientList.
     * @param ingredient is the element to be added
     */
    public void add(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    /**
     *Counts total amount of calories in salad
     * @return total amount of calories in salad
     */
    public float countCalories() {
        float sumOfCalories = 0;
        for (Ingredient ingredient : ingredientList) {
            sumOfCalories += ingredient.calculateCalories();
        }
        return sumOfCalories;
    }

    /**
     *Sorts ingredients in ingredientList by field name
     * lexicographically
     */
    public void sortByName() {
        ingredientList.sort(new Comparator<Ingredient>() {
            @Override
            public int compare(Ingredient o1, Ingredient o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
    }

    /**
     *Sorts ingredients in ingredientList by field weight
     * from smaller to larger
     */
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

    /**
     *Sorts ingredients in ingredientList by field calories
     * from smaller to larger
     */
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

    /**
     *Returns list of ingredients which fit in a given calorie range
     *@param from determine the lower boundary
     *@param to determine the upper boundary
     *@return list of selected ingredients
     */
    public ArrayList<Ingredient> findIngridientInRangeOfCalories(float from, float to) {
        ArrayList<Ingredient> ingredientRangeList = new ArrayList<>();
        for (Ingredient ingredient : ingredientList) {
            if (ingredient.getCalories() >= from && ingredient.getCalories() <= to)
                ingredientRangeList.add(ingredient);
        }
        return ingredientRangeList;
    }

    /**
     *@return copy of the private list of ingredients
     */
    public ArrayList<Ingredient> getIngredientList() {
        ArrayList<Ingredient> ingredientsCopy = new ArrayList<Ingredient>();
        ingredientsCopy.addAll(this.ingredientList);
        return ingredientsCopy;
    }
}
