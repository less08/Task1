package Model.data;

public class Vegetable extends Ingredient {
    private final float caloriesPerHundred;

    public Vegetable(VegetableEnum vegetableEnum, float weight) {
        super(vegetableEnum.name(), weight);
        this.caloriesPerHundred = vegetableEnum.getCaloriesPerHundred();
    }

    @Override
    public float calculateCalories() {
        return caloriesPerHundred * getWeight() / 100;
    }

    @Override
    public float getCalories() {
        return caloriesPerHundred;
    }
}
