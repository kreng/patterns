package creational.builder;

public class Pizzeria {

    public static void main(String... args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .addNubble(new Nubble(Nubble.NubblePiece.CHEESE))
                .addNubble(new Nubble(Nubble.NubblePiece.MUSHROOMS))
                .build();
    }
}
