package creational.prototype;

import static creational.prototype.Auto.CARGO_CAR_ID;
import static ru.Helper.assertEquals;

public class Client {

    public static void main(String... args) {
        Auto cargoCar = Auto.getAutoByType(CARGO_CAR_ID);

        assertEquals(cargoCar.getType(), CARGO_CAR_ID );

    }
}
