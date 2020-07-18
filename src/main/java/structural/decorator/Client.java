package structural.decorator;

import java.util.ArrayList;

import static ru.Helper.assertEquals;

public class Client {

    public static void main(String... args) {

        AbstractPizza specialPizza = new EmptyPizza.BaconDecorator(
                new EmptyPizza.PineappleDecorator(
                        new EmptyPizza.BaconDecorator(
                                new EmptyPizza())));

        specialPizza.make(new ArrayList<>());

    }

}
