package Model.data;

public class Vegetable extends Ingredient {
    private final float caloriesPerHundred;

    public Vegetable(String name, float caloriesPerHundred, float weight) {
        super(name, weight);
        this.caloriesPerHundred = caloriesPerHundred;
    }

    @Override
    public float calculateCalories() {
        return caloriesPerHundred * getWeight() / 100;
    }
}
