package behavioral.mediator;

public class FlowerService extends Task {

    @Override
    public String process(String data) {
        System.out.println(data);
        return "Цветы доставлены";
    }
}
