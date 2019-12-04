package Model.data;

abstract class Ingredient {
    private final String name;
    private float weight;

    protected Ingredient(String name, float weight){
        this.weight = weight;
        this.name = name;
    }

    public abstract float calculateCalories();

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
