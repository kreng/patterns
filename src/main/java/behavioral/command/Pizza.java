package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Receiver
 */
public class Pizza {

    List<Topping>toppings = new ArrayList<>();

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void make(){
        for (Topping topping: toppings)
            System.out.println(topping.getProduct());
    }
}
