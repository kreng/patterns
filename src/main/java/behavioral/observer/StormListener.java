package behavioral.observer;

import static behavioral.observer.DangerLevel.*;

public abstract class StormListener {
    public abstract void notify(DangerLevel level);


    public static class SchoolListener extends StormListener {

        @Override
        public void notify(DangerLevel level) {
            if(HIGH == level){
                System.out.println("Школы готовятся к шторму");
            }
        }
    }

    public static class RoadServicesListener extends StormListener {

        @Override
        public void notify(DangerLevel level) {
            if(MEDIUM == level){
                System.out.println("Дорожные службы готовятся к шторму");
            }
        }
    }

    public static class AirportListener extends StormListener {

        @Override
        public void notify(DangerLevel level) {
            if(LOW == level){
                System.out.println("Аэропорты готовятся к шторму");
            }
        }
    }
}
