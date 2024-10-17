package command_pattern;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(1);
        TV tv = new TV();
        Command tvOn = new TurnTVOn(tv);
        Command tvOff = new TurnTVOff(tv);

        remote.setCommand(0, tvOn);
        remote.pressButton(0);
        remote.pressUndo();

        remote.setCommand(0, tvOff);
        remote.pressButton(0);
        remote.pressUndo();
    }
}

