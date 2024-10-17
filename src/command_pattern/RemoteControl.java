package command_pattern;

public class RemoteControl {
    private Command[] commands;
    private Command undoCommand;

    public RemoteControl(int slots) {
        commands = new Command[slots];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        commands[slot].execute();
        undoCommand = commands[slot];
    }

    public void pressUndo() {
        if (undoCommand != null) {
            undoCommand.undo();
        }
    }
}
