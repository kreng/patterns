package behavioral.state;


public class Client {

    public static void main(String... args){
        Oven oven = new Oven(150);
        oven.bake();

        oven.setTemperature(30);
        oven.bake();
    }
}
