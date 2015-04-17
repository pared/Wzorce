package NULLOBJECT;

/**
 * Created by pawel on 19.03.15.
 */
public class PassangerFactory {
    public static final String[] withTickets ={"Rob","Joe","Julie"};

    public static AbstractPassanger getPassanger(String name){
        for (int i = 0;i < withTickets.length;i++){
            if(withTickets[i].equals(name)){
                return new Passanger(name);
            }
        }
        return new NullPassanger();
    }
}
