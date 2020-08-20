package behavioral.mediator;

public class Client {

    public static void main(String... args) {
        Dispatcher dispatcher = new Dispatcher.ConciergeService();
        //подготовка
        dispatcher.registerTask(new FlowerService());
        dispatcher.registerTask(new RepairerService());
        dispatcher.registerTask(new TaxiService());

        // получение нотификации
        System.out.println(dispatcher.callTaxi());
        System.out.println(dispatcher.orderFlowers());
    }
}
