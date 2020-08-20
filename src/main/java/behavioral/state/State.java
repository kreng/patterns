package behavioral.state;

public abstract class State {

    public abstract void bake();

    void setTemperature(int t, Oven oven){
        if(t < 120) {
            oven.setState(new ColdState());
        } else if(t>=120 && t <=200){
            oven.setState(new ReadyState());
        } else{
            oven.setState(new OverhotState());
        }
    }


    static class ColdState extends State {

        @Override
        public void bake() {
            throw new RuntimeException("Печь холодная");
        }
    }

    static class ReadyState extends State {

        @Override
        public void bake() {
            System.out.println("Печь работает");
        }
    }

    static class OverhotState extends State {

        @Override
        public void bake() {
            throw new RuntimeException("Печь перегрета");
        }
    }
}
