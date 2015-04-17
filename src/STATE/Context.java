package STATE;

/**
 * Created by pawel on 24.03.15.
 */
public class Context {
    private State state;
    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
