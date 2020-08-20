package behavioral.state;

public class Oven {
    State state;
    int temperature;

    public Oven(int temperature) {
        this.temperature = temperature;
        state = new State.ColdState();
        state.setTemperature(temperature, this);
    }

    void setState(State state) {
        this.state = state;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        state.setTemperature(temperature, this);
    }

    public void bake(){
        state.bake();
    }
}
