package Model;

import Model.data.*;

import java.util.ArrayList;

public class Model {

    private Salad salad = new Salad();


    public void addIngredient(VegetableEnum vegetableEnum, float weight){
        salad.add(new Vegetable(vegetableEnum,weight));
    }

    public void addIngredient(SpiceEnum spiceEnum, float weight){
        salad.add(new Spice(spiceEnum,weight));
    }

    public ArrayList <Ingredient> getIngredientsInRangeOfCalories(float from, float to){
        return salad.findIngridientInRangeOfCalories(from,to);
    }




}
