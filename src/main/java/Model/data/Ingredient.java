package Model.data;

public abstract class Ingredient {
    private final String name;
    private float weight;

    Ingredient(String name, float weight) {
        this.weight = weight;
        this.name = name;
    }

    public abstract float calculateCalories();

    public abstract float getCalories();

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
