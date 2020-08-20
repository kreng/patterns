package behavioral.mediator;

public abstract class Task {

    Dispatcher dispatcher;

    protected abstract String process(String data);

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

}
