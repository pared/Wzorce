package FACADE;

/**
 * Created by pawel on 19.03.15.
 */
public class Car implements Turnable {
    private Engine engine=new Engine();
    private Lights dayLights = new Lights();
    private Lights lights = new Lights();

    @Override
    public String turnOn(){
        System.out.println(engine.turnOn());
        System.out.println(dayLights.turnOn());
        System.out.println("Car turned on!");
        return "Car turned on";
    }
    @Override
    public String turnOff(){
        System.out.println(engine.turnOff());
        System.out.println(dayLights.turnOff());
        System.out.println("Car turned off");
        return "Car turned off";
    }
}
