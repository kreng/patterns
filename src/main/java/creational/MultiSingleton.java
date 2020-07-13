package creational;

import java.util.ArrayList;
import java.util.List;

public class MultiSingleton {
    private static int MAX_OBJECTS = 10;

    private static List<MultiSingleton> instances = new ArrayList<>(MAX_OBJECTS);
    static {
        for(int i = 0; i< MAX_OBJECTS; i++)
            instances.add(new MultiSingleton(i));
    }

    private int id;

    public static MultiSingleton getInstance(int id) {
        return instances.stream()
                .filter(object -> object.id == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("Несуществующий id"));
    }

    private MultiSingleton(int id) {
        this.id = id;
    }
}
