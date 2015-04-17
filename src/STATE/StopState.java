package STATE;

/**
 * Created by pawel on 24.03.15.
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Stop state");
        context.setState(this);
    }

    public String toString(){
        return "STOP STATE";
    }
}
