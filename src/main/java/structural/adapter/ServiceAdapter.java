package structural.adapter;

public class ServiceAdapter {
    private Сервис service = new Сервис();

    public void firstMethod() {
        service.методДва();
    }

    public int secondMethod() {
        return service.методДва();
    }
}
