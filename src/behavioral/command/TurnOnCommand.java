package behavioral.command;

public class TurnOnCommand implements ICommand{
    private Fan fan = new Fan();

    public TurnOnCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();
    }
}
