package STATE;

/**
 * Created by pawel on 24.03.15.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Start state");
        context.setState(this);
    }

    public String toString(){
        return "START STATE";
    }
}
