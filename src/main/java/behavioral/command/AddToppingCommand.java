package behavioral.command;

public abstract class AddToppingCommand {
    Pizza pizza;

    public AddToppingCommand(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void execute();



    public static class CheeseCommand extends AddToppingCommand{

        public CheeseCommand(Pizza pizza) {
            super(pizza);
        }

        @Override
        void execute() {
            pizza.addTopping(new Topping("Cheese"));
        }
    }

    public static class BaconCommand extends AddToppingCommand{

        public BaconCommand(Pizza pizza) {
            super(pizza);
        }

        @Override
        void execute() {
            pizza.addTopping(new Topping("Bacon"));
        }
    }

    public static class PineappleCommand extends AddToppingCommand{

        public PineappleCommand(Pizza pizza) {
            super(pizza);
        }

        @Override
        void execute() {
            pizza.addTopping(new Topping("Pineapple"));
        }
    }

    public static class MushroomCommand extends AddToppingCommand{

        public MushroomCommand(Pizza pizza) {
            super(pizza);
        }

        @Override
        void execute() {
            pizza.addTopping(new Topping("Mushroom"));
        }
    }

    public static class SeafoodCommand extends AddToppingCommand{

        public SeafoodCommand(Pizza pizza) {
            super(pizza);
        }

        @Override
        void execute() {
            pizza.addTopping(new Topping("Seafood"));
        }
    }
}
