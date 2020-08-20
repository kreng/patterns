package behavioral.mediator;

public class TaxiService extends Task {

    @Override
    public String process(String data) {
        System.out.println(data);
        return "Такси вызвано";
    }
}
