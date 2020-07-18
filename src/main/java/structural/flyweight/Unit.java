package structural.flyweight;

public abstract class Unit {
    private int x;
    private int y;
    private SharedUnit sharedUnit;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
        sharedUnit = SharedUnit.getSharedUnit(this.getClass());
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public static class Infantry extends Unit {
        public Infantry(int x, int y) {
            super(x, y);
        }
    }

    public static class Cavalery extends Unit {
        public Cavalery(int x, int y) {
            super(x, y);
        }
    }
}
