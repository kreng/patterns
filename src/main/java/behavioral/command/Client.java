package behavioral.command;

public class Client {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        CommandHistory executor = new CommandHistory();

        executor.execute(new AddToppingCommand.CheeseCommand(pizza));
        executor.execute(new AddToppingCommand.PineappleCommand(pizza));
        executor.execute(new AddToppingCommand.CheeseCommand(pizza));
        executor.execute(new AddToppingCommand.BaconCommand(pizza));

        pizza.make();
    }
}
