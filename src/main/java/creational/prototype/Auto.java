package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Auto implements Cloneable{
    public static final String CAR_ID = "CAR_ID";
    public static final String CARGO_CAR_ID = "CARGO_CAR_ID";
    public static final String MINIVAN = "MINIVAN";

    private static Map<String, Auto> preCreatedAuto = new HashMap();

    static {
        preCreatedAuto.put(CAR_ID, new Auto(CAR_ID));
        preCreatedAuto.put(CARGO_CAR_ID, new Auto(CARGO_CAR_ID));
        preCreatedAuto.put(MINIVAN, new Auto(MINIVAN));
    }

    public static Auto getAutoByType(String type) {
        Auto auto = preCreatedAuto.get(type);
        //clone
        return new Auto(auto.type);
    }

    private String type;
    private String color = "RED";
    private String number = "";

    private Auto(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getNumber() {
        return number;
    }
}
