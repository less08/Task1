import Model.Model;
import Model.data.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModelTest {
    Model model;

    @Before
    public void init() {
        model = new Model();
    }

    @Test
    public void getCaloriesTest() {
        float calories = 0;
        model.addIngredient(VegetableEnum.TOMATO, 24f);
        calories += VegetableEnum.TOMATO.getCaloriesPerHundred() * 24f / 100;
        model.addIngredient(VegetableEnum.CUCUMBER, 14f);
        calories += VegetableEnum.CUCUMBER.getCaloriesPerHundred() * 14f / 100;
        model.addIngredient(VegetableEnum.ONION, 22);
        calories += VegetableEnum.ONION.getCaloriesPerHundred() * 22 / 100;
        model.addIngredient(SpiceEnum.SALT, 12f);

        Assert.assertTrue(calories == model.countSaladCalories());
    }

    @Test
    public void getListInRangeTest() {
        model.addIngredient(VegetableEnum.TOMATO, 24f);
        model.addIngredient(VegetableEnum.CUCUMBER, 14f);
        model.addIngredient(VegetableEnum.ONION, 22);
        model.addIngredient(SpiceEnum.SALT, 12f);
        float min = 10;
        float max = 15;

        model.getIngredientsInRangeOfCalories(10, 15).forEach(ingredient -> {
            Assert.assertTrue(ingredient.getCalories() >= min && ingredient.getCalories() <= max);
        });
    }

    @Test
    public void sortByWeightTest() {
        model.addIngredient(VegetableEnum.TOMATO, 24f);
        model.addIngredient(VegetableEnum.CUCUMBER, 14f);
        model.addIngredient(VegetableEnum.ONION, 22);
        model.addIngredient(VegetableEnum.ONION, 22);
        model.addIngredient(SpiceEnum.SALT, 12f);
        model.sortByWeight();
        ArrayList<Ingredient> ingredients = model.getIngredientList();

        for (int i = 0; i < ingredients.size() - 1; i++) {
            Assert.assertTrue(ingredients.get(i).getWeight() <= ingredients.get(i + 1).getWeight());
        }
    }

    @Test
    public void sortByCaloriesTest() {
        model.addIngredient(VegetableEnum.TOMATO, 24f);
        model.addIngredient(VegetableEnum.CUCUMBER, 14f);
        model.addIngredient(VegetableEnum.ONION, 22);
        model.addIngredient(VegetableEnum.ONION, 22);
        model.addIngredient(SpiceEnum.SALT, 12f);
        model.sortByCalories();
        ArrayList<Ingredient> ingredients = model.getIngredientList();

        for (int i = 0; i < ingredients.size() - 1; i++) {
            Assert.assertTrue(ingredients.get(i).getCalories() <= ingredients.get(i + 1).getCalories());
        }
    }

    @Test
    public void sortByNameTest() {
        model.addIngredient(VegetableEnum.TOMATO, 24f);
        model.addIngredient(VegetableEnum.CUCUMBER, 14f);
        model.addIngredient(VegetableEnum.ONION, 22);
        model.addIngredient(SpiceEnum.SALT, 12f);
        model.sortByName();
        ArrayList<Ingredient> ingredients = model.getIngredientList();

        for (int i = 0; i < ingredients.size() - 1; i++) {
            Assert.assertTrue(ingredients.get(i).getName().compareToIgnoreCase(ingredients.get(i + 1).getName())!=1);
        }
    }
}
