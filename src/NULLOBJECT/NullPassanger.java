package NULLOBJECT;

/**
 * Created by pawel on 19.03.15.
 */
public class NullPassanger extends AbstractPassanger {
    public boolean isNil(){
        return true;
    }

    public String getName(){
        return "Object is NULL";
    }
}
