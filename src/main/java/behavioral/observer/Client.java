package behavioral.observer;

public class Client {

    public static void main(String... args){
        StormNotificator notificator = new StormNotificator();

        notificator.subscribe(new StormListener.SchoolListener());
        notificator.subscribe(new StormListener.AirportListener());
        notificator.subscribe(new StormListener.RoadServicesListener());

        notificator.notify(DangerLevel.MEDIUM);
        notificator.notify(DangerLevel.LOW);
    }
}
