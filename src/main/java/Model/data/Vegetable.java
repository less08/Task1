package Model.data;

public class Vegetable extends Ingredient {
    private final float calloriesPerHundred;

    public Vegetable(String name, float calloriesPerHundred, float weight) {
        super(name, weight);
        this.calloriesPerHundred = calloriesPerHundred;
    }

    @Override
    public float calculateCalories() {
        return calloriesPerHundred * getWeight() / 100;
    }
}
