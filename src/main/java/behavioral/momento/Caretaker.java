package behavioral.momento;

import java.util.LinkedList;

public class Caretaker {
    private LinkedList<Originator.Memento> mementos = new LinkedList<>();

    public void saveState(Originator originator){
        mementos.add(originator.createMemento());
    }

    public String getLastMemento(){
        return mementos.getLast().getState();
    }
}
