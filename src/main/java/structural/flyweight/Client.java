package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String... args) {
        List<Unit> army = new ArrayList<>();

        army.add(new Unit.Infantry(0,0));
        army.add(new Unit.Cavalery(0,0));
    }
}
