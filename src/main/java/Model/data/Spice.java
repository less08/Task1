package Model.data;

public class Spice extends Ingredient {

//    public Spice(String name, float weight){
//        super(name, weight);
//    }
    public Spice(SpiceEnum spiceEnum, float weight){
        super(spiceEnum.toString(), weight);

    }
    public float calculateCalories() {
        return 0;
    }

    @Override
    public float getCalories() {
        return 0;
    }
}
