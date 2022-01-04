package Command;

import Main.Vehicle;

public abstract class Command {
    protected Vehicle vehicle;

    public Command(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void execute();
    public abstract void undo();
}
