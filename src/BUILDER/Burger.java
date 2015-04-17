package BUILDER;

/**
 * Created by pawel on 19.03.15.
 */
public abstract class Burger implements Item {
    @Override
    public Packing getPacking(){
        return new Wrapper();
    }
    @Override
    public abstract float getPrice();
}
