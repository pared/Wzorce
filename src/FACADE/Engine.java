package FACADE;

/**
 * Created by pawel on 19.03.15.
 */
public class Engine implements Turnable {
    @Override
    public String turnOn(){
        return "Engine turned on!";
    }
    @Override
    public String turnOff(){
        return "Engine turned off";
    }
}
