package structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class EmptyPizza implements AbstractPizza {

    @Override
    public void make(List<Topping> toppings) {
        for(Topping topping: toppings) {
            System.out.println(topping.getProduct().concat("  "));
        }
    }


    static abstract class PizzaDecorator implements AbstractPizza {
        protected AbstractPizza pizza;

        public PizzaDecorator(AbstractPizza pizza) {
            this.pizza = pizza;
        }
    }

    static class CheeseDecorator extends PizzaDecorator{

        CheeseDecorator(AbstractPizza pizza) {
            super(pizza);
        }

        @Override
        public void make(List<Topping> toppings) {
            toppings.add(new Topping("Cheese"));
            pizza.make(toppings);
        }
    }
    static class BaconDecorator extends PizzaDecorator{

        BaconDecorator(AbstractPizza pizza) {
            super(pizza);
        }

        @Override
        public void make(List<Topping> toppings) {
            toppings.add(new Topping("Bacon"));
            pizza.make(toppings);
        }
    }
    static class PineappleDecorator extends PizzaDecorator{

        PineappleDecorator(AbstractPizza pizza) {
            super(pizza);
        }

        @Override
        public void make(List<Topping> toppings) {
            toppings.add(new Topping("Pineapple"));
            pizza.make(toppings);
        }
    }
    static class MushroomDecorator extends PizzaDecorator{

        MushroomDecorator(AbstractPizza pizza) {
            super(pizza);
        }

        @Override
        public void make(List<Topping> toppings) {
            toppings.add(new Topping("Mushroom"));
            pizza.make(toppings);
        }
    }
    static class SeafoodDecorator extends PizzaDecorator{

        SeafoodDecorator(AbstractPizza pizza) {
            super(pizza);
        }

        @Override
        public void make(List<Topping> toppings) {
            toppings.add(new Topping("Seafood"));
            pizza.make(toppings);
        }
    }
}
