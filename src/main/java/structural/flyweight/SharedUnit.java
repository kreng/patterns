package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SharedUnit {

    private static Map<Class, SharedUnit> sharedUnits = new HashMap<>();
    static {
        sharedUnits.put(Unit.Infantry.class, new SharedUnit("textureInf", "soundInf"));
        sharedUnits.put(Unit.Cavalery.class, new SharedUnit("textureCav", "soundCav"));
    }

    public static SharedUnit getSharedUnit(Class clazz){
        return sharedUnits.get(clazz);
    }

    protected Object texture;
    protected Object sounds;

    public SharedUnit(Object texture, Object sounds) {
        this.texture = texture;
        this.sounds = sounds;
    }
}
