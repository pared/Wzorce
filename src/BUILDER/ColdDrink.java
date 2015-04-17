package BUILDER;

/**
 * Created by pawel on 19.03.15.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing getPacking(){
        return new Bottle();
    }
    @Override
    public abstract float getPrice();
}
