package behavioral.Command;

import java.util.Stack;

public class RemoteControl {
    Stack<Command>acCommandStack;

    Command command;

    RemoteControl() {
        acCommandStack = new Stack<>();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
      command.executeCommand();
        acCommandStack.push(command);
    }

    public void undo() {
      if (!acCommandStack.empty()) {
        Command lastCommand = acCommandStack.pop();
        lastCommand.undo();
      } else {
        System.out.println("Undo not possible, history is empty!!");
      }
    }
}
