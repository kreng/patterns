package behavioral.mediator;

public class RepairerService extends Task {

    @Override
    public String process(String data) {
        System.out.println(data);
        return "Мастер прибыл";
    }
}
