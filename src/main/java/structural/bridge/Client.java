package structural.bridge;

public class Client {
    public static void main(String... args) {
        new Dinner.AmericanDinner(new Dish.secondDish()).makeDish();
    }
}