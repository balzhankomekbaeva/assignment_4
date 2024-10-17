package command_pattern;

public class TurnTVOff implements Command {
    private TV tv;

    public TurnTVOff(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
