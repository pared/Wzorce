package FACADE;

/**
 * Created by pawel on 19.03.15.
 */
public class Lights implements Turnable {
    @Override
    public String turnOn(){
        return "Lights turned on";
    }
    @Override
    public String turnOff(){
        return "Lights turned off";
    }

}
