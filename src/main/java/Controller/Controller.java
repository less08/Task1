package Controller;

import Model.Model;
import Model.data.SpiceEnum;
import Model.data.VegetableEnum;
import View.View;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model=model;
        this.view=view;
    }

    private void createSalad(){
        model.addIngredient(VegetableEnum.TOMATO,10);
        model.addIngredient(VegetableEnum.TOMATO,15);
        model.addIngredient(VegetableEnum.TOMATO,12);
        model.addIngredient(VegetableEnum.CUCUMBER, 40);
        model.addIngredient(VegetableEnum.CUCUMBER, 50);
        model.addIngredient(VegetableEnum.ONION,15);
        model.addIngredient(SpiceEnum.SALT,1);
        model.addIngredient(SpiceEnum.PEPPER, 0.5f);
        model.addIngredient(SpiceEnum.BASIL, 0.5f);
    }

    public void processUser(){
        createSalad();
    }


}
