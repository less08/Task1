package Model.data;

public class Spice extends Ingredient {

    public Spice(String name, float weight){
        super(name, weight);
    }

    public float calculateCalories() {
        return 0;
    }
}
