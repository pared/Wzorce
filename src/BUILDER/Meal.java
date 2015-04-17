package BUILDER;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pawel on 19.03.15.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item i : items){
            cost+=i.getPrice();
        }
        return cost;
    }

    public void showItems(){
        for(Item i : items){
            System.out.print("Item: "+i.getName()+", Packing: "+i.getPacking().getPack()+", Price: "+i.getPrice()+"\n");
        }
    }
}
