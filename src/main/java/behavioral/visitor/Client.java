package behavioral.visitor;

import java.io.IOException;

public class Client {

    public static void main(String... args) throws IOException {
        Pizza pizza = new Pizza.SimplePizza();
        pizza.accept(new Visitor.AddBaconVisitor());
        pizza.accept(new Visitor.AddPineappleVisitor());
        pizza.accept(new Visitor.AddBaconVisitor());
        pizza.make();


        pizza = new Pizza.SpecialPizza();
        pizza.accept(new Visitor.AddCheeseVisitor());
        pizza.accept(new Visitor.AddSeafoodVisitor());
        pizza.accept(new Visitor.AddPineappleVisitor());
        pizza.make();
    }
}
