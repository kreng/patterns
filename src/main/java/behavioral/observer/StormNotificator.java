package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StormNotificator {
    List<StormListener> listeners = new ArrayList<>();

    public void subscribe(StormListener listener){
        listeners.add(listener);
    }

    public void notify(DangerLevel level){
        for(StormListener listener: listeners){
            listener.notify(level);
        }
    }
}
