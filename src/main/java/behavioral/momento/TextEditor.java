package behavioral.momento;

import static ru.Helper.assertEquals;

public class TextEditor {

    public static void main(String[] args){
        String widgetText = "first state";

        Caretaker caretaker = new Caretaker();
        Originator originator1 = new Originator(widgetText);

        caretaker.saveState(originator1);

        Originator originator2 = new Originator("Second state");
        caretaker.saveState(originator2);

        assertEquals("Second state", caretaker.getLastMemento());
    }
}
