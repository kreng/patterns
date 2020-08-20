package behavioral.command;

import java.util.LinkedList;

public class CommandHistory {

    private LinkedList<AddToppingCommand> stack = new LinkedList<>();

    public void execute(AddToppingCommand command) {
        command.execute();
        stack.add(command);
    }
}
