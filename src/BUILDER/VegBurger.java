package BUILDER;

/**
 * Created by pawel on 19.03.15.
 */
public class VegBurger extends Burger {
    @Override
    public String getName(){
        return "Vege Burger";
    }
    @Override
    public float getPrice(){
        return 10.0f;
    }
}
