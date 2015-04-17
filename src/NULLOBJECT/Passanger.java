package NULLOBJECT;

/**
 * Created by pawel on 19.03.15.
 */
public class Passanger extends AbstractPassanger {
    public Passanger(String name){
        this.name = name;
    }

    public boolean isNil(){
        return false;
    }

    public String getName(){
        return name;
    }
}
